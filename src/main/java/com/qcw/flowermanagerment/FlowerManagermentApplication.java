package com.qcw.flowermanagerment;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class FlowerManagermentApplication {

    public static void main(String[] args) {

        SpringApplication.run(FlowerManagermentApplication.class, args);
    }

}
