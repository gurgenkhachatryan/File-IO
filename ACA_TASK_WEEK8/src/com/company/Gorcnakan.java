package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Gorcnakan {
    public static void main(String[] args) {
       byte[] bytes= new byte[100];
        try {
            InputStream inputStream=new FileInputStream("input.txt");
            int read=inputStream.read(bytes);
          //  String s=new String(read);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    }
