package com.company.day2;

import java.io.*;
import java.util.ArrayList;

public class OneString13 {
    public static void main(String[] args) {
        String path = "AAAA";
        File file = new File(path + "/hhh.txt");
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String bigStr = new String();
            String str;
            for (; ; ) {
                str = bufferedReader.readLine();
                if (str == null) {
                    break;
                }
                bigStr += str;
            }
            System.out.println(bigStr);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
