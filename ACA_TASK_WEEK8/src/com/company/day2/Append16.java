package com.company.day2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Append16 {
    public static void main(String[] args) {
        String pathFolder="AAAA";
        File file=new File(pathFolder+"/hhh.txt");
        try (FileWriter fileWriter = new FileWriter(file,true)) {
            fileWriter.write("\nnewtext");


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
