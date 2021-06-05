package com.milo.ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jms.artemis.ArtemisAutoConfiguration;

@SpringBootApplication(exclude = ArtemisAutoConfiguration.class)
public class MiloBeerInventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MiloBeerInventoryServiceApplication.class, args);
    }

}
