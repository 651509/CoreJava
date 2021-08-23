package com.codewithakash.corejava.lesson4.exceptionhandling;

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
