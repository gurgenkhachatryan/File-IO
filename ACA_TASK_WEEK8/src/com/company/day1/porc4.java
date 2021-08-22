package com.company.day1;

import java.io.*;
import java.util.Arrays;

public class porc4 {
    public static void main(String[] args) {
        String pathFolder="C:/Users/Toshiba/Desktop/Porc4Folder";
        File myFolder=new File(pathFolder);
        myFolder.mkdir();
        String pathFile="C:/Users/Toshiba/Desktop/Porc4Folder/porc4.txt";
        File file=new File(pathFile);
        try (FileOutputStream fileOutputStream = new FileOutputStream(file)) {
      String text="123";
            byte[] byteArray=text.getBytes();
            fileOutputStream.write(byteArray);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        File file1=new File(pathFile);
        try (FileInputStream fileInputStream = new FileInputStream(file)) {
            byte[] byteArray=new byte[8];
            fileInputStream.read();
            fileInputStream.read();
            fileInputStream.read(byteArray);
            String str=new String(byteArray);
            System.out.println(str);
          /*  String[] newstr=str.split("3");
            System.out.println(newstr);
            int counter=0;
            int []intArray=new int[3];
            for (String x: newstr) {
                intArray[counter++]=Integer.parseInt(x);
            }
            System.out.println(Arrays.toString(intArray));*/


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
