package com.codewithakash.lesson3.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CarService {

    private final Logger log = LoggerFactory.getLogger(CarService.class);

    public void process(String input) {
        log.debug("Processing car: {}",input);
    }
}
