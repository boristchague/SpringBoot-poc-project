package com.boris.pocproject.student;


import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class StudentConfig {


    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args -> {
            Student boris = new Student(
                    "Boris",
                    "TCHAGUE",
                    "risbo.voyage.01@gmail.com",
                    30
            );
            Student joe = new Student(
                    "joe",
                    "biden",
                    "john.biden@gmail.com",
                    10
            );
            studentRepository.saveAll(
                    List.of(boris, joe)
            );


        };
    }

}
