package com.example.student.studentrecord.service;


import com.example.student.studentrecord.exception.RecordNotFoundException;
import com.example.student.studentrecord.student.Student;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface StudentService {

    public Student update(int appId, Student employe) throws RecordNotFoundException;

    public List<Student> getAll();

    public Student newStudentAdd(Student profile);

    public void deleteById(int id);
}
