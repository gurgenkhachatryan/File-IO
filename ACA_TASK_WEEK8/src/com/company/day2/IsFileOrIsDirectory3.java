package com.company.day2;

import java.io.File;

public class IsFileOrIsDirectory3 {
    public static void main(String[] args) {
        String pathFolder = "AAAA";
//        File fileFolder = new File(pathFolder + "/hhh.txt");
//        if (fileFolder.isDirectory()) {
//            System.out.println("is directory");
//        } else if (fileFolder.isFile()) {
//            System.out.println("is files");
//        } else {
//            System.out.println("is not file or directory");
//        }
        File folder=new File(pathFolder);
        System.out.println(folder.exists());

    }
    }