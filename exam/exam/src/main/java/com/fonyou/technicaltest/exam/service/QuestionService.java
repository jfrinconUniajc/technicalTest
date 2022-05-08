package com.fonyou.technicaltest.exam.service;

import com.fonyou.technicaltest.exam.model.dto.QuestionDto;

import java.util.List;


public interface QuestionService {
    List<QuestionDto> createQuestion(List<QuestionDto> questions, Long idTest);
}
