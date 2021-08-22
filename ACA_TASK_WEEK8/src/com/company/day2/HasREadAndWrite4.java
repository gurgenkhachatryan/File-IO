package com.company.day2;

import java.io.File;

public class HasREadAndWrite4 {
    public static void main(String[] args) {
        String pathFolder="AAAA";
        File fileFolder=new File(pathFolder);
        File file=new File(pathFolder+"/hhh.txt");
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        System.out.println(file.canExecute());
    }
}
