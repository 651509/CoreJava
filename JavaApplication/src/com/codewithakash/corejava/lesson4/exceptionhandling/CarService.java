package com.codewithakash.corejava.lesson4.exceptionhandling;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CarService {

    private final static Logger log = LoggerFactory.getLogger(CarService.class);

    public static void main(String[] args) {

        Car car = new Car();
        for(String argument: args){
            try{
                car.mode(argument);
            }
           /* catch(RuntimeException e){
                System.err.println(e.getMessage());
            }*/
            //Fundamental approach to use logging
            catch(RuntimeException e){
                log.debug(argument);
            }
        }

    }
}
