package com.truyenho.dollarlover;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class DollarLoverApplication {

    public static void main(String[] args) {
        SpringApplication.run(DollarLoverApplication.class, args);
    }

}
