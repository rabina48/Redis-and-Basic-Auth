package com.example.student.studentrecord.service;


import ch.qos.logback.core.net.SyslogOutputStream;
import com.example.student.studentrecord.exception.RecordNotFoundException;
import com.example.student.studentrecord.repository.StudentRepo;
import com.example.student.studentrecord.student.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    public StudentRepo studentRepo;



    @Override
    @CachePut(value = "student", key = "#id")
    public Student update(int id, Student student) throws RecordNotFoundException {
            Optional<Student> optionalRecord = studentRepo.findById(id);
            Student newRecord = optionalRecord.get();
            if (optionalRecord.isPresent()) {
                newRecord.setName(student.getName());
                newRecord.setAddress(student.getAddress());
                newRecord.setRollNo(student.getRollNo());
                studentRepo.save(newRecord);
            } else {
                throw new RecordNotFoundException("Record not found with id: " + id);
            }
            return  newRecord;
    }

    @Override
    @Cacheable(value = "student")
    public List<Student>  getAll() {
        List<Student> emp = studentRepo.findAll();
        return emp;
    }

    @Override
    @CacheEvict(value = "student", key = "#id")
    public void deleteById(int id) {
            studentRepo.deleteById(id);
    }


    @Override
    public Student newStudentAdd(Student student) {
        student.setName(student.getName());
        student.setRollNo(student.getRollNo());
        student.setAddress(student.getAddress());
        return studentRepo.save(student);
    }
}
