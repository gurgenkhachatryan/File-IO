package com.company.day2;

import java.io.File;

public class Lf1 {
    public static void main(String[] args) {
        File file=new File("C:/Users/Toshiba/Desktop/ACA/ACA_TASK_WEEK8/ACA_TASK_WEEK8/directory/aaa");
       File[] listOfFile=file.listFiles();
        for (File x: listOfFile) {
            if(x.isFile())
            {
                System.out.println(x.getName());
            }
            else
            {
                System.out.println("ddd");
            }
        }
    }

}
