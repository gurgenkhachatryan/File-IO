package com.company.day3;

import java.io.*;

public class CountChar1 {
    public static void main(String[] args) {
        String pathFolder = "AAAA";
        File file = new File(pathFolder + "/hhh.txt");
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            char ch = 'a';
            int counter = 0;
            for (; ; ) {
                int str = bufferedReader.read();
                if (str == -1) {
                    break;
                }
                if (ch == (char) str) {
                    counter++;
                }
            }
            System.out.println("counter=" + counter);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
