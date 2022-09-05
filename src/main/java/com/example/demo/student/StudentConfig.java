 package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

 @Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
            return args -> {
               Student Kofi =  new Student(
                        "Nana Kofi Fosuhene-Jethro",
                        "Male",
                        LocalDate.of(2005, FEBRUARY, 3),
                        "nkfosuhene@gmail.com"
                     );
                  Student Akwasi =  new Student(
                                "Nana Akwasi Fosuhene-Jethro",
                                "Male",
                                LocalDate.of(2013, JUNE, 3),
                                "nakfosuhene@gmail.com"
                        );
                   Student Akosua = new Student(
                                "Nana Akosua Fosuhene-Jethro",
                                "Female",
                                LocalDate.of(2021, MARCH, 15),
                                "nafosuhene@gmail.com"
                        );
                   //save students into the database
                repository.saveAll(
                        List.of(Kofi, Akwasi, Akosua)
                );
            };
    }
}
