package sample;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        File folder1 = new File("C://downloads/");
        File folder2 = new File("C://downloads/copy");
        folder2.mkdirs();

        try {
            CopyFiles.copyFilesWithSpecificExt(folder1, folder2, ".pdf");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
