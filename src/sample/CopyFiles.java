package sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyFiles {

    public static void copyFile(File fileIn, File fileOut) throws IOException {
        try (InputStream is = new FileInputStream(fileIn);
             OutputStream os = new FileOutputStream(fileOut)) {
            long copyByte = is.transferTo(os);

            System.out.println(copyByte + " byte copied");
        }
    }

    public static void copyFilesWithSpecificExt (File folderIn, File folderOut, String extension) throws IOException {
        File[] files = folderIn.listFiles();
        for (File file : files) {
            if(file.isFile()) {
                if (file.getName().substring(file.getName().lastIndexOf(".")).equalsIgnoreCase(extension)) {
                    File fileOut = new File(folderOut,file.getName());
                    copyFile(file, fileOut);
                }
            }
        }

    }

}
