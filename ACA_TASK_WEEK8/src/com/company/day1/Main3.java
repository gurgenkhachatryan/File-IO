package com.company.day1;

import java.io.*;

public class Main3 {
    public static void main(String[] args) {
        Person3 person3=new Person3("BBBB",30);
        String path="C:/Users/Toshiba/Desktop/Person3.txt";
        File file=new File(path);
        try (FileOutputStream fileOutputStream = new FileOutputStream(file);
             ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(person3);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        File file1=new File(path);
        try (FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream)) {
           Person3 newPerson=(Person3) objectInputStream.readObject();
            System.out.println(newPerson.name);
            System.out.println(newPerson.age);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
