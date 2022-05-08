package com.fonyou.technicaltest.exam.service;
import com.fonyou.technicaltest.exam.model.dto.AssignmentDto;
import com.fonyou.technicaltest.exam.model.dto.TestDto;

import java.util.List;

public interface AssignmentService {
    List<AssignmentDto> createAssigment(AssignmentDto test);
}
