package com.fonyou.technicaltest.exam.service;

import com.fonyou.technicaltest.exam.model.dto.TestQuestionDto;


public interface TestQuestionService {
    TestQuestionDto createTestQuestion(Long idTest, Long idQuestion);
}
