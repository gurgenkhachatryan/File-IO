package com.company.day2;

import java.io.*;
import java.util.Arrays;

public class LongestWord18 {
    public static void main(String[] args) {
        String pathFolder="AAAA";
        File file=new File(pathFolder+"/hhh.txt");
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {



            String max=new String();
            for(;;) {
                String str = bufferedReader.readLine();
                if (str == null) {
                    break;
                }
                String[] newstr = str.split(" ");

                for (int i = 1; i < newstr.length - 1; i++) {
                    // max = newstr[i];
                    if (max.length() < newstr[i].length()) {
                        max = newstr[i];
                    }
                }
            }
            System.out.println(max);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
