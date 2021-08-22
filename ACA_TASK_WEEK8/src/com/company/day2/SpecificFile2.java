package com.company.day2;

import java.io.File;
import java.util.Scanner;

public class SpecificFile2 {
    public static void main(String[] args) {
      File file=new File("AAAA");
      File[] fileArray=file.listFiles();
        for (File x: fileArray) {
            if(x.getName().endsWith(".ping"))
            {
                System.out.println(x.getName());
            }
        }

    }
}
