package com.codewithakash.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SumOfMarks {

    /**
     * @param args Code to perform sum of marks inside Function FI passing List<Student> collection as input and return Integer
     */
    public static void main(String[] args) {


        Student[] student = {new Student("Akash", 80),
                new Student("Darpan", 60),
                new Student("Aman", 50),
                new Student("Mickey", 100),
                new Student("Royal", 40),
                new Student("Pumpkin", 20)};

        List<Student> l1 = Arrays.asList(student);

        //In lambda expression never use for-loop its a blunder.
        Function<List<Student>, Integer> f = s -> {
            int sum = 0;
            for (Student tmp : s) {
                sum += tmp.getsMarks();
            }
            return sum;
        };
        System.out.println(f.apply(l1));
        System.out.println();
        System.out.println("USING STREAMS CONCEPT--->");
        System.out.println();


        //below map method of stream will uses (Function FI as argument) to get marks from Student List and Collectors.summingInt
        // uses method reference concept to add value, uses intValue method of Integer class
        Integer l2 = l1.stream().map(s -> s.getsMarks()).collect(Collectors.summingInt(Integer::intValue));

        System.out.println(l2);

        String hello = "hello";

        String s1 = new String();


        Class helloClass = hello.getClass();

        System.out.println(helloClass.toString());

        System.out.println(helloClass.hashCode());

        System.out.println(helloClass.getName());

        String world = "world";
        Class worldClass = world.getClass();
        System.out.println(worldClass.hashCode());


        System.out.println(helloClass == worldClass);


    }
}
