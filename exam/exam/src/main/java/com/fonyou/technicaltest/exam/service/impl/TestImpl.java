package com.fonyou.technicaltest.exam.service.impl;
import com.fonyou.technicaltest.exam.model.Test;
import com.fonyou.technicaltest.exam.model.dto.TestDto;
import com.fonyou.technicaltest.exam.repository.TestRepository;
import com.fonyou.technicaltest.exam.service.QuestionService;
import com.fonyou.technicaltest.exam.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestImpl implements TestService {
    private final QuestionService questionService;
    private final TestRepository testRepository;


    @Autowired
    public TestImpl(
            TestRepository testRepository,
            QuestionService questionService) {
        this.testRepository = testRepository;
        this.questionService = questionService;
    }

    @Override
    public TestDto createTest(TestDto test) {
        TestDto response;
        Test testEntity = TestDto.DtoToEntity(test);
        response = TestDto.entityToDto(testRepository.save(testEntity));
        response.setQuestions(questionService.createQuestion(test.getQuestions(),response.getId()));
        return response;
    }
}
