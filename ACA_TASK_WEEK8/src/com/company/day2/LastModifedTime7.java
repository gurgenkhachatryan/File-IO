package com.company.day2;

import java.io.*;
import java.util.Date;

public class LastModifedTime7 {
    public static void main(String[] args) {
        String path = "AAAA";
        File file = new File(path+"/hhh.txt");
        Date date=new Date(file.lastModified());
        System.out.println(date);

      /*  try (FileReader fileReader = new FileReader(file)) {
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            System.out.println(bufferedReader.readLine());
            bufferedReader.
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
    }
}