package com.ssm.studentmgmt.service;
import com.ssm.studentmgmt.dto.StudentDto;
import com.ssm.studentmgmt.entity.StudentEntity;
import com.ssm.studentmgmt.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;
    public StudentDto addStudent(StudentDto studentDto){
        System.out.println("adding student: " + studentDto);
        StudentEntity studentEntity = StudentEntity.builder()
                .id(studentDto.getStdId())
                .age(studentDto.getAge())
                .email(studentDto.getEmail())
                .name(studentDto.getName())
                .build();
        studentRepository.save(studentEntity);
        return studentDto;
    }

    public List<StudentEntity> getAllStudents() {
        return studentRepository.findAll();
    }
}
