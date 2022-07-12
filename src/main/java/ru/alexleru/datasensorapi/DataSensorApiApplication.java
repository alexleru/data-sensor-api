package ru.alexleru.datasensorapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class DataSensorApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(DataSensorApiApplication.class, args);
    }

}
