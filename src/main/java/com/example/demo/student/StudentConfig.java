package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner( StudentRepository studentRepository){
        return args -> {
          Student bram=  new Student(1, "jorammanoah1@gmail.com","Joram Bramuel");
          studentRepository.saveAll(
                  List.of(bram)
          );

        };
    }
}
