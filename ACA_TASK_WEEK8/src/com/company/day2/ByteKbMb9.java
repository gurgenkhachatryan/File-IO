package com.company.day2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class ByteKbMb9 {
    public static void main(String[] args) {
        String path = "AAAA";
        File file = new File(path + "/hhh.txt");
        if (file.exists()) {
            try (FileInputStream fileInputStream = new FileInputStream(file)) {

                byte[] byteArray = fileInputStream.readAllBytes();
                double byteCount = byteArray.length;
                double KB = byteCount / 1024;
                double MB = KB / 1024;
                System.out.println("byteCount=" + byteCount);
                System.out.println("Kb=" + KB);
                System.out.println("Mb=" + MB);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}