package com.example.student.studentrecord;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class StudentRecordApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentRecordApplication.class, args);
    }

}
