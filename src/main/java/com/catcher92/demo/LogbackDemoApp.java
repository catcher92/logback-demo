package com.catcher92.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

/**
 * Hello world!
 */
public class LogbackDemoApp {

    private static Logger logger = LoggerFactory.getLogger(LogbackDemoApp.class);

    public static void main(String[] args) {
        logger.info("args={}", Arrays.toString(args));
        logger.error("args={}", Arrays.toString(args));
        System.out.println("Hello World!");
    }

}
