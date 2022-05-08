package com.fonyou.technicaltest.exam.service;

import com.fonyou.technicaltest.exam.model.dto.StudentDto;

import java.util.List;

public interface StudentService {
    StudentDto createStudent(StudentDto student);
    List<StudentDto> getAll();
}
