package com.company.day1;

import java.io.*;

public class porc3 {
    public static void main(String[] args) {

        String path="C:/Users/Toshiba/Desktop/porc3.txt";
        File file=new File(path);
        try (FileOutputStream fileOutputStream = new FileOutputStream(file)) {
        String str="porc3 forever";
        byte[] byteArray=str.getBytes();
        fileOutputStream.write(byteArray);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


     //   File file1=new File(path);
        try (FileInputStream fileInputStream = new FileInputStream(file)) {

            byte[] byteArray = new byte[20];
            fileInputStream.read(byteArray);
            String str=new String(byteArray);
            System.out.println(str);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
