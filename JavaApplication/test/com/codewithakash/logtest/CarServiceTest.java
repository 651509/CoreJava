package com.codewithakash.logtest;

import com.codewithakash.lesson3.logging.CarService;
import org.junit.Test;

public class CarServiceTest {

    @Test
    public void loggingTest(){

        CarService carService = new CarService();
        carService.process("BMW");
    }
}
