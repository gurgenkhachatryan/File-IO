package com.company.day1;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class porc2 {
    public static void main(String[] args) {
       File file=new File("porc2.txt");
        try (FileOutputStream fileOutputStream = new FileOutputStream(file)) {
              String text="porc2 gorcnakan";
             byte[] byteArray;
           byteArray=  text.getBytes();
             fileOutputStream.write(byteArray);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }




        File file1=new File("porc2.txt");
        try (FileInputStream fileInputStream = new FileInputStream(file1)) {

            byte[] byteArray=new byte[20];
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
