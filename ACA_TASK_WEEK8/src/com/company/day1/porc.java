package com.company.day1;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class porc {
    public static void main(String[] args) {
        File file = new File("text.txt");

        try (FileOutputStream fileOutputStream = new FileOutputStream(file)) {

            String text = "Hello world";

            byte[] dataByte = text.getBytes();

            fileOutputStream.write(dataByte);

        } catch (IOException e) {
            e.printStackTrace();
        }



        File file1 = new File("text.txt");
        try (FileInputStream fileInputStream = new FileInputStream(file1)) {

//            int data = fileInputStream.read();
//            while (data != -1) {
//                System.out.println((char) data);
//                data = fileInputStream.read();
//            }
            byte[] bytes = new byte[50];
               System.out.println(fileInputStream.read(bytes));
            String str = new String(bytes);
            System.out.println(str);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
