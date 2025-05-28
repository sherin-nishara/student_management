package com.ssm.studentmgmt.controller;
import com.ssm.studentmgmt.dto.StudentDto;
import com.ssm.studentmgmt.StudentmgmtApplication;
import com.ssm.studentmgmt.entity.StudentEntity;
import com.ssm.studentmgmt.repository.StudentRepository;
import com.ssm.studentmgmt.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class StudentController {
    @Autowired
    private StudentService studentService;
    @Autowired
    private StudentRepository studentRepository;
    @PostMapping("/student/add")
    public StudentDto addStudent(@RequestBody StudentDto studentDto) {
        return studentService.addStudent(studentDto);
    }
    @GetMapping("/student/get")
    public List<StudentEntity> getAllStudents() {
        return studentRepository.findAll();
    }
}
