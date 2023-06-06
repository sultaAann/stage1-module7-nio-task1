package com.epam.mjc.nio;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;


public class FileReader {

    public Profile getDataFromFile(File file) {
        {
            String[] res = new String[4];
            try (java.io.FileReader fileReader = new java.io.FileReader(file); BufferedReader rd = new BufferedReader(fileReader)) {
                int i = 0;
                while (rd.ready()) {
                    res[i] = (rd.readLine()).split(":")[1].trim();
                    i++;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return new Profile(res[0], Integer.parseInt(res[1]), res[2], Long.parseLong(res[3]));
        }
    }
}
