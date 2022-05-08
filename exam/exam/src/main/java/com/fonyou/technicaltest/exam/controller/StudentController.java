package com.fonyou.technicaltest.exam.controller;

import com.fonyou.technicaltest.exam.model.dto.StudentDto;
import com.fonyou.technicaltest.exam.model.dto.interno.GenericDto;
import com.fonyou.technicaltest.exam.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * The type Student controller.
 */
@RestController
@RequestMapping("/student")
public class StudentController {
    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping(value = "/create")
    public ResponseEntity<GenericDto> createStudent(@RequestBody StudentDto student) {
        GenericDto<StudentDto> response = new GenericDto<>(studentService.createStudent(student));
        return ResponseEntity.ok(response);
    }
}
