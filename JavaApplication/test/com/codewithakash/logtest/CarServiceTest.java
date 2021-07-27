package com.codewithakash.logtest;

import com.codewithakash.lesson3.logging.CarService;
import com.codewithakash.lesson4.exceptionhandling.Car;
import org.junit.Test;

import java.util.Scanner;

public class CarServiceTest {

    @Test
    public void loggingTest(){

        CarService carService = new CarService();
        carService.process("BMW");
    }


}