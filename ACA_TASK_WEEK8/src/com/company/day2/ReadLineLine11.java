package com.company.day2;

import java.io.*;

public class ReadLineLine11 {
    public static void main(String[] args) {
        String path="AAAA";
        File file=new File(path+ "/hhh.txt");
        try (BufferedReader b = new BufferedReader(new FileReader(file))) {

            for (; ; ) {
                String str= b.readLine();
                if(str==null)
                break;
                else
                {
                    System.out.println(str);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
