package com.codewithakash.java8;

import java.util.Date;
import java.util.function.Supplier;

public class RandomOtpGenerator {

    /**
     * @param args Math.Random logic states generated value should be
     *             0<=x<1 means minimum value could be 0 and maximum could be 0.9999
     *             if we multiply by 10 (Math.random()*10) means minimum value is 0 and maximum is 9.9999
     */
    public static void main(String[] args) {

        //Generating 6 digit OTP
        String otp = "";
        for (int i = 0; i < 6; i++) {
            int tmp = (int) (Math.random() * 10);
            otp += tmp;
        }
        System.out.println(otp);

        //Using Supplier FI .. wrong using for loop inside lamda expression

        Supplier<String> s = () -> {
            String otpNo = "";
            for (int i = 0; i < 6; i++) {
                //int tmp=(int)(Math.random()*10);
                otpNo += (int) (Math.random() * 10);
                ;
            }
            return otpNo;
        };

        Supplier<Date> s1 = () -> new Date();

        System.out.println(s.get());

        System.out.println(s1.get());


    }
}
