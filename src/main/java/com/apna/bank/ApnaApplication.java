package com.apna.bank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApnaApplication {

    public static void main(String[] args) {

        SpringApplication.run(ApnaApplication.class, args);
        System.out.println("ApnaBank has Started");
    }

}
