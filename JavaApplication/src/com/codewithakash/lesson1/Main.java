package com.codewithakash.lesson1;

import java.util.Arrays;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");
        /* byte age =30;
        long viewsCount=3_123_456_789L;
        float price =10.99F;
        boolean isEligible = false;*/ //primitive type®

        Date now = new Date();
        System.out.println(now); // reference type

        //Array are of reference type
        int[] number = {1,2,4,3,2};
        Arrays.sort(number);//to sort
        System.out.println(Arrays.toString(number)); // to print array use Arrays class and it's toString method

        //Multi-dimensional array
        int[][] twoDNumbers = {{1,3,2},{1,2,0}};
        System.out.println(Arrays.deepToString(twoDNumbers)); // to print 2d 0r 3d array use deeptoString function

        //Implicit Casting
        int x=10;
        double y=x+1.1;

        //Explicit Casting
        int a=10;
        int b=(int)10.1+1;

        //Casting to convert String into Int, Float etc..
        String s = "1";
        //int q=s+10; cannot convert or cast String into primitive data  type of String
        //Solution:User wrapper class of primitive data types
        int i = Integer.parseInt(s)+10;
        System.out.println(i);






    }
}
