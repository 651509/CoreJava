package com.codewithakash.corejava.logtest;

import com.codewithakash.corejava.lesson3.logging.CarService;
import org.junit.Test;

public class CarServiceTest {

    @Test
    public void loggingTest(){

        CarService carService = new CarService();
        carService.process("BMW");
    }


}