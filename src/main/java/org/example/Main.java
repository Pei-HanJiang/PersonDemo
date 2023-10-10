package org.example;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person();
        //set name
        try{
            person1.set_Name("Sofie1 koropecká");
        }catch(Exception e){
            System.out.println("Person already exists: " + e.getMessage());
        }


        try{
            person1.set_Name("Sofie2");
        }catch(Exception e){
            System.out.println("Person already exists: " + e.getMessage());
        }

        person1.get_allNames();
    }
}