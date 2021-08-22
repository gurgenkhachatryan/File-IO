package com.company.day2;

import javax.swing.*;
import java.io.*;

public class ListFile1 {
    public static void main(String[] args) {
        String pathFolder="directory";
        File folder=new File(pathFolder);
        folder.mkdir();
        String pathFile=folder.getAbsolutePath();
        File file1=new File(pathFile+ "/text1.txt");
        File file2=new File(pathFile+"/text2.txt");
        File file3=new File(pathFile+ "/text3.txt");
        try {
            file1.createNewFile();
            file2.createNewFile();
            file3.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
               File file=new File(pathFolder);

        File[] listOfFiles=file.listFiles();
        for (File x: listOfFiles) {
            if(x.isFile())
                {  System.out.println(x.getName());}
                else
                {
                    System.out.println("ddddddd");
                }
            }

        }

     }



