package org.example;
import java.util.List;
import java.util.ArrayList;

public class Person {
    String name;
    int birthYear;
    double height;
    double weight;

    static List<String> names = new ArrayList<>();

    public Person(){
        //initialization
        this.name = "";
        this.birthYear = 0;
        this.height = 0;
        this.weight = 0;

    }

    void set_Name(String name) throws NameInvalidExp {
        if (name.length() < 3){
            throw new NameInvalidExp("Invalid Name");
        }
        this.name = name;
        names.add(name);
    }
    void set_BirthYear(int year) throws YearInvalidExp{
        if(year >= 1923 || year <= 2023){
            throw new YearInvalidExp("Invalid BirthYear");
        }
        this.birthYear = year;
    }

    void set_height(double height) throws HeightInvalidExp{
        if(height <= 0){
            throw new HeightInvalidExp("Height Invalid");
        }
        this.height = height;
    }

    void set_weight(double weight) throws WeightInvalidExp {
        if(weight <= 0){
            throw new WeightInvalidExp("Weight Invalid");
        }
        this.weight = weight;
    }

    String get_Name() throws NameNotExistExp{
        if(!names.contains(this.name)){
            throw new NameNotExistExp("Name not exist");
        }
        return this.name;
    }

    int get_age(){
        return 2023-this.birthYear;
    }

    double get_BMI(){
        return this.weight/(this.height*this.height);
    }

    void get_allNames(){
        for(int i = 0 ; i < names.size() ; i++){
            System.out.println(names.get(i));
        }
    }







}
