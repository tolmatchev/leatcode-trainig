package org.example.interview;

import java.io.File;

// рекурсивная, вызывается до тех пор, пока нету вложенных файлов и печатает все что есть в директории
public class SberPrintAllFilesInDirectory {

    public void printWorkProjectStructure() {
        File file = new File("/Users/nikitatolmacev/repositories/leatcode-trainig");
        printAllFilesInDirectory(file.listFiles(), "");
    }

    public void printAllFilesInDirectory(File[] files, String append) {
        for (int i = 0; i < files.length; i++) {
            System.out.println(append + files[i].getName());
            if (files[i].isDirectory()) {
                printAllFilesInDirectory(files[i].listFiles(), append + "  ");
            }
        }

    }
}
