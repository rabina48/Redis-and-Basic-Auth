package com.example.student.studentrecord.student;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import org.hibernate.annotations.Table;

import java.io.Serializable;

@Data
@Entity
@Table(appliesTo = "student")
public class Student implements Serializable {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;

        private String name;

        private String address;

        private int rollNo;



}


