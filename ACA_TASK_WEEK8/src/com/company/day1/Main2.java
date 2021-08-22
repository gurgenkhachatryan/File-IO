package com.company.day1;

import java.io.*;

public class Main2 {
    public static void main(String[] args) {
        Person2 person2=new Person2("AAAA",25);
        File file=new File("Person2.txt");
        try (FileOutputStream fileOutputStream = new FileOutputStream(file);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)){
            objectOutputStream.writeObject(person2  );
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        File file1=new File("Person2.txt");
        try (FileInputStream fileInputStream = new FileInputStream(file1);
        ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream)) {
            Person2 newPerson=(Person2) objectInputStream.readObject();
            System.out.println("newPerson.name=" + newPerson.name);
            System.out.println("newPerson.age=" + newPerson.age);



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
