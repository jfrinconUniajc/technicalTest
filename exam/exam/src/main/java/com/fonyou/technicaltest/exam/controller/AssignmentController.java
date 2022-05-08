package com.fonyou.technicaltest.exam.controller;

import com.fonyou.technicaltest.exam.model.dto.AssignmentDto;
import com.fonyou.technicaltest.exam.model.dto.TestDto;
import com.fonyou.technicaltest.exam.model.dto.interno.GenericDto;
import com.fonyou.technicaltest.exam.service.AssignmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * The type Assignment controller.
 */
@RestController
@RequestMapping("/assignment")
public class AssignmentController {
    private final AssignmentService assignmentService;

    @Autowired
    public AssignmentController(AssignmentService assignmentService) {
        this.assignmentService = assignmentService;
    }

    @PostMapping(value = "/assign")
    public ResponseEntity<GenericDto> assign(@RequestBody AssignmentDto assignmentDto) {
        GenericDto<List<AssignmentDto>> response = new GenericDto<>(assignmentService.createAssigment(assignmentDto));
        return ResponseEntity.ok(response);
    }
}
