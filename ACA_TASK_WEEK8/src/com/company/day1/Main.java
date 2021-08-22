package com.company.day1;

import java.io.*;

public class Main  {

    public static void main(String[] args) {
	Person person=new Person("AAA",20);
	File file=new File("persontext.txt");

        try( FileOutputStream fileOutputStream=new FileOutputStream(file);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(person);

        } catch (IOException e) {
            e.printStackTrace();
        }

        File file1=new File("persontext.txt");
        try (FileInputStream fileInputStream = new FileInputStream(file1);
        ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream)){

            Person newperson=(Person) objectInputStream.readObject();
            System.out.println("newperson.name=" + newperson.name);
            System.out.println("newperson.name=" + newperson.age);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
