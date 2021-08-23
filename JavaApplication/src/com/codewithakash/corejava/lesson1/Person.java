package com.codewithakash.corejava.lesson1;

import com.codewithakash.corejava.lesson2.PersonName;

public class Person {

    private PersonName personName;
    static int personCounter; // class level variable and visibility to global level or to all other objects of Person class

    /*
    * Default Constructor
    * */
    public Person(){
        personCounter++;

    }

    public Person(PersonName personName){
        this.personName=personName;
    }

    public String helloWorld() {
        return "Hello World";
    }

    /*
    * To get access via Class level use static modifier
    * */
    public static int getPersonCounter() {
        return personCounter;
    }
}
