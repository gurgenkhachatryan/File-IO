package com.company.day2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class ReadByteArray10 {
    public static void main(String[] args) {
        String path="AAAA";
        File file=new File(path+"/hhh.txt");
        try (FileInputStream fileInputStream = new FileInputStream(file)) {

            byte[]byteArray= fileInputStream.readAllBytes();

            System.out.println(Arrays.toString(byteArray));
            for (int x: byteArray) {
                char c=(char) x;
                System.out.print(c);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
