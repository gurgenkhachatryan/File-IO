package com.company.day2;

import java.io.*;

public class Read12 {
    public static void main(String[] args) {
        String path="AAAA";
        File file=new File(path+"/hhh.txt");
       // try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file))) {
       // try(FileInputStream bufferedInputStream=new FileInputStream(file)){
        try(FileReader bufferedInputStream=new FileReader(file)){
            for (;;)
            {
                int readInt= bufferedInputStream.read();
                if (readInt==-1)
                {
                    break;
                }
                System.out.print((char) readInt);
            }



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
