package com.company.day2;

import java.io.*;
import java.util.Scanner;

public class Console8 {
    public static void main(String[] args) {
BufferedReader B=new BufferedReader(new InputStreamReader(System.in));
        try {
            //B.readLine();
            String line=B.readLine();
            System.out.println(line);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
