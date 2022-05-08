package com.fonyou.technicaltest.exam.service.impl;
import com.fonyou.technicaltest.exam.model.Assignment;
import com.fonyou.technicaltest.exam.model.Student;
import com.fonyou.technicaltest.exam.model.dto.AssignmentDto;
import com.fonyou.technicaltest.exam.model.dto.QuestionDto;
import com.fonyou.technicaltest.exam.model.dto.StudentDto;
import com.fonyou.technicaltest.exam.repository.AssignmentRepository;
import com.fonyou.technicaltest.exam.service.AssignmentService;
import com.fonyou.technicaltest.exam.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AssignmentImpl implements AssignmentService {
    private final AssignmentRepository assignmentRepository;
    private final StudentService studentService;


    @Autowired
    public AssignmentImpl(
            AssignmentRepository assignmentRepository, StudentService studentService) {
        this.assignmentRepository = assignmentRepository;
        this.studentService = studentService;
    }


    @Override
    public List<AssignmentDto> createAssigment(AssignmentDto assignmentDto) {
        List<AssignmentDto> response = new ArrayList<>();
        studentService.getAll().forEach(studentDto -> {
            assignmentDto.setIdStudent(studentDto.getId());
            Assignment assignmentEntity = AssignmentDto.DtoToEntity(assignmentDto);
            response.add(AssignmentDto.entityToDto(assignmentRepository.save(assignmentEntity)));
        });
        return response;
    }
}
