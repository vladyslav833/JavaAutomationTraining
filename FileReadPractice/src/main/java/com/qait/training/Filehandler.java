package com.qait.training;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Filehandler {

    private String fileloc = "";
    private String st = "";

    Filehandler(String fileloc) {
        this.fileloc = fileloc;
    }

    public List<String> getFileNames() {
        File filedirectory = new File(this.fileloc);
        return Arrays.asList(filedirectory.list());
    }

    public String getFileContent(String filename) {
        String returnContent = "";
        try {
            File file = new File(this.fileloc + "/" + filename);
            BufferedReader br = new BufferedReader(new FileReader(file));

            String st = "";

            while ((st = br.readLine()) != null) {
                returnContent = returnContent + st;
            }
        } catch (FileNotFoundException fe) {

        } catch (IOException io) {

        }
        return returnContent;
    }

    public Map<String, String> getFileNamesandContent() {
        Map<String, String> fileNameandContent = new HashMap<String, String>();

        for (String filename : getFileNames()) {
            fileNameandContent.put(filename, getFileContent(filename));
        }
        return fileNameandContent;
    }
}