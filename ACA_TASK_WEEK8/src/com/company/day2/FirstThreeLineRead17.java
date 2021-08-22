package com.company.day2;

import java.io.*;

public class FirstThreeLineRead17 {
    public static void main(String[] args) {
        String pathFolder="AAAA";
        File file=new File(pathFolder+"/hhh.txt");
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            for (int i=0;i<3;i++)
            {
                String str= bufferedReader.readLine();

//                if(str==null)
//                {
//                    break;
//                }
                System.out.println(str);
            }
          //  System.out.println(bufferedReader.readLine());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
