package com.qait.training;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Filehandler files = new Filehandler("src/main/resources/files");
        List<String> filenames = files.getFileNames();
        System.out.println(filenames);
        System.out.println(files.getFileNamesandContent());
    }
}
