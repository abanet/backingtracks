package com.backingtrackstoimprovise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.backingtrackstoimprovise.repositorios")
public class BackingtracksApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackingtracksApplication.class, args);
    }

}
