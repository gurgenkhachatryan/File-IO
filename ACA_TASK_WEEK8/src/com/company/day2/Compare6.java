package com.company.day2;

import java.io.*;
import java.util.Arrays;
import java.util.Iterator;

public class Compare6 {
    public static void main(String[] args) {
        String pathFolder = "AAAA";
        File file1 = new File(pathFolder + "/hhh.txt");
        File file2 = new File(pathFolder + "/KKK.txt");
        try (BufferedReader bufferedReader1 = new BufferedReader(new FileReader(file1));
             BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file2))) {

            int allCount = 0;
            String str1 = new String();
            String str2 = new String();
            for (; ; ) {
                str1 = bufferedReader1.readLine();
                str2 = bufferedReader2.readLine();
                if (str1 == null && str2 == null) {
                    break;
                }

                if (str1 == null) {
                    allCount += str2.length();
                } else if (str2 == null) {
                    allCount += str1.length();
                } else {

                    int sizeTarb = Math.abs(str2.length() - str1.length());
                    int minSize = str1.length();
                    int count = sizeTarb;
                    if (str2.length() < str1.length()) {
                        minSize = str2.length();
                    }
                    for (int i = 0; i < minSize; i++) {
                        if (str1.charAt(i) != str2.charAt(i)) {
                            count++;
                        }
                    }
                    allCount += count;

                }
            }
            System.out.println("AllCount=" + allCount);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

