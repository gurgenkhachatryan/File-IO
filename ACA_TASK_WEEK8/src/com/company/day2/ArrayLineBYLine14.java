package com.company.day2;

import java.io.*;
import java.util.ArrayList;

public class ArrayLineBYLine14 {
    public static void main(String[] args) {
        String path = "AAAA";
        File file = new File(path + "/hhh.txt");
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
ArrayList<String> arrayList=new ArrayList<>();
            String str;
            for (;;)
            {
                str= bufferedReader.readLine();
                if(str==null)
                {
                    break;
                }
                arrayList.add(str);
            }
            System.out.println(arrayList);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}