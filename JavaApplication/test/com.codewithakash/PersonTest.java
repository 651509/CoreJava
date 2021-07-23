package com.codewithakash;

import com.codewithakash.lesson1.Person;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    @Test
    public void shouldReturnHelloWorld(){

       Person person = new Person();
       assertEquals("Hello World", person.helloWorld());
    }

    @Test
    public void getPersonCounter(){
        Person personObj1= new Person();
        Person personObj2= new Person();
        Person personObj3= new Person();
        Person personObj4= new Person();

        assertEquals(4, Person.getPersonCounter());
    }

    @Test
    public void demonstrateArrays(){

        Person[] persons = new Person[5];

        for(int i=0;i< persons.length;i++){
            persons[i]=new Person();
        }

        for(Person myPerson: persons){
            myPerson.helloWorld();
        }



    }

}
