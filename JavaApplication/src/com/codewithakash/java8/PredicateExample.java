package com.codewithakash.java8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();

        Predicate<String> pr = nameValue -> nameValue.length() > 5;

        System.out.println(pr.test(name));


    }
}
