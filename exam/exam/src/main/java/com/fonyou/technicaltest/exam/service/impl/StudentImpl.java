package com.fonyou.technicaltest.exam.service.impl;

import com.fonyou.technicaltest.exam.model.Student;
import com.fonyou.technicaltest.exam.model.dto.StudentDto;
import com.fonyou.technicaltest.exam.repository.StudentRepository;
import com.fonyou.technicaltest.exam.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentImpl implements StudentService {
    private final StudentRepository studentRepository;

    @Autowired
    public StudentImpl(
            StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public StudentDto createStudent(StudentDto student) {
        Student studentEntity = StudentDto.DtoToEntity(student);
        return StudentDto.entityToDto(studentRepository.save(studentEntity));
    }
}
