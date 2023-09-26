package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        logger.debug("TEST {} {}", a , b);//{} для оптимизации скорости
        logger.trace("someone writes something");

    }
}