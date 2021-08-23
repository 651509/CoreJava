package com.codewithakash.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FIExample {

    public static void main(String[] args) {

        Student[] student = {new Student("Akash", 80),
                new Student("Darpan", 60),
                new Student("Aman", 50),
                new Student("Mickey", 100),
                new Student("Royal", 40),
                new Student("Pumpkin", 20)};

        System.out.println(student.hashCode());

        List<Student> list = Arrays.asList(student);


        //Function Functional Interface to perform operation & return value
        Function<Student, String> f = s -> {
            String grade = "";
            if (s.getsMarks() >= 80) grade = "A";
            else if (s.getsMarks() >= 60) grade = "B";
            else if (s.getsMarks() >= 50) grade = "C";
            else if (s.getsMarks() >= 35) grade = "D";
            else grade = "Failed";
            return grade;
        };
        //predicate functional interface to condition check
        Predicate<Student> p = s -> s.getsMarks() >= 80;

        //Consumer functional interface to accept value and does not return or check any conditions
        Consumer<Student> c = s -> {
            System.out.println("Student Name  " + s.getsName());
            System.out.println("Student Marks " + s.getsMarks());
            System.out.println("Student Grade " + f.apply(s));
            System.out.println();


        };

        //Supplier functional interface, do not take any input and only return
        Supplier<String> sup = () -> {
            return new Student("Apple", 100).getsName();
        };


        for (Student tmp : student) {

            if (p.test(tmp)) {
                c.accept(tmp);
            }

            System.out.println(sup.get());


			/*if(p.test(tmp)) {
			System.out.println("Student Name  "+tmp.getsName());
			System.out.println("Student Marks "+tmp.getsMarks());
			System.out.println("Student Grade "+ f.apply(tmp));
			System.out.println();
			}*/
			/*else {
					System.out.println("Student Name  "+tmp.getsName());
					System.out.println("Student Marks "+tmp.getsMarks());
					System.out.println("Student Grade "+ f.apply(tmp));
					System.out.println();
					}
			}*/

        }

    }

}
