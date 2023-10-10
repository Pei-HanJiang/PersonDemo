package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    Person aPerson;

    @BeforeEach
    void init() {
        aPerson = new Person();
    }

    @Test
    void set_NameTest() {
        assertThrows(NameInvalidExp.class, () -> aPerson.set_Name("So"));
    }

    @Test
    void set_BirthYear() {
        assertThrows(YearInvalidExp.class, () -> aPerson.set_BirthYear(0));
        assertThrows(YearInvalidExp.class, () -> aPerson.set_BirthYear(-1));
        assertThrows(YearInvalidExp.class, () -> aPerson.set_BirthYear(1000));
    }

    @Test
    void set_height() {
        assertThrows(HeightInvalidExp.class, () -> aPerson.set_height(-127623.8));
        assertThrows(HeightInvalidExp.class, () -> aPerson.set_height(0));
    }

    @Test
    void set_weight() {
        assertThrows(WeightInvalidExp.class, () -> aPerson.set_weight(0));
        assertThrows(WeightInvalidExp.class, () -> aPerson.set_weight(-12736231.3));

    }

    @Test
    void get_Name() {
        //Create object person 1
        try {
            aPerson.set_Name("Sofie");
        }catch(Exception e){
            System.out.println("Error occured: "+ e );
        }

        //create object person 2
        Person person2 = new Person();
        try {
            person2.set_Name("Amanda");
        }catch(Exception e){
            System.out.println("Error occured: "+ e );
        }

        //Test name does exist
        try {
            assertEquals("Sofie", aPerson.get_Name());
        }catch (Exception e){
            System.out.println(e);
        }
        //Test name does exist
        try {
            assertEquals("Amanda", person2.get_Name());
        }catch (Exception e){
            System.out.println(e);
        }
        //Test name does not exist
        Person person3 = new Person();
        assertThrows(NameNotExistExp.class, () -> person3.get_Name());

    }
}