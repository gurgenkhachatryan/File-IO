package com.company.day1;

import java.io.*;
import java.util.Arrays;

public class Main4 {
    public static void main(String[] args) {
        Person4[] person4s={new Person4("AAA",15),new Person4("BBB",25),new Person4("CCC",30)};

        File file=new File("person4.bin");
        try (FileOutputStream fileOutputStream = new FileOutputStream(file);
             ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream)) {
            
            objectOutputStream.writeObject(person4s);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream)) {
            Person4[] p=(Person4[]) objectInputStream.readObject();
            System.out.println(Arrays.toString(p));


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
