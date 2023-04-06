package com.example.student.studentrecord.controller;

import com.example.student.studentrecord.exception.RecordNotFoundException;
import com.example.student.studentrecord.service.StudentService;
import com.example.student.studentrecord.student.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
     * @author Rabina
     */

    @RestController
    @RequestMapping("app")
    public class EmployeeController {

        @Autowired
        private StudentService studentService;


        @GetMapping("all")
        public List<Student> getAllAppointment() {
            return studentService.getAll();
             }

        @PutMapping("{id}")
        public Student updateAppointment(@PathVariable int id, @RequestBody Student profile) throws RecordNotFoundException {
            return studentService.update(id, profile);
        }

        @DeleteMapping("{id}")
        public void deleteStudentById(@PathVariable int id) {
            studentService.deleteById(id);
        }


        @PostMapping("add")
        public Student appointmentAdd(@RequestBody Student profile) {
            return studentService.newStudentAdd(profile);
        }
    }


