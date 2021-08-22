package com.company.day2;

import java.io.*;

public class WriteRead15 {
    public WriteRead15() throws FileNotFoundException {
    }

    public static void main(String[] args) {

        create();
        Read();

    }

    public static void create() {

        String pathFolder = "NewDirectory";
        File folder = new File(pathFolder);
        folder.mkdir();
        String pathFile = pathFolder + "/nortext.txt";
        File file = new File(pathFile);
        try (FileWriter fileWriter = new FileWriter(file,true)) {
            fileWriter.write("\nHello new world");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void Read() {

        String pathFolder = "NewDirectory";
        String pathFile = pathFolder + "/nortext.txt";
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(pathFile))) {

            for (;;)
            {
                String str= bufferedReader.readLine();
                if(str==null)
                {
                    break;
                }
                System.out.println(str);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}