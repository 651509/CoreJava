package com.codewithakash.lesson4.exceptionhandling;

import java.sql.SQLException;

public class Car {

    public  CarState mode(String state){
        return switch (state) {
            case "DRIVING" -> CarState.DRIVING;
            case "WAITING" -> CarState.WAITING;
            case "PARKING" -> CarState.PARKING;
            default -> throw new RuntimeException("Unknown State: " + state);
        };
    }
}
