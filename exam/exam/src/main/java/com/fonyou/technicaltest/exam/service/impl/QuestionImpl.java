package com.fonyou.technicaltest.exam.service.impl;

import com.fonyou.technicaltest.exam.model.Question;
import com.fonyou.technicaltest.exam.model.dto.QuestionDto;
import com.fonyou.technicaltest.exam.repository.QuestionRepository;
import com.fonyou.technicaltest.exam.service.AnswerOptionService;
import com.fonyou.technicaltest.exam.service.QuestionService;
import com.fonyou.technicaltest.exam.service.TestQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionImpl implements QuestionService {
    private final QuestionRepository questionRepository;
    private final AnswerOptionService answerOptionService;
    private final TestQuestionService testQuestionService;


    @Autowired
    public QuestionImpl(
            QuestionRepository questionRepository, AnswerOptionService answerOptionService, TestQuestionService testQuestionService) {
        this.questionRepository = questionRepository;
        this.answerOptionService = answerOptionService;
        this.testQuestionService = testQuestionService;
    }


    @Override
    public List<QuestionDto> createQuestion(List<QuestionDto> questions, Long idTest) {
        List<QuestionDto> response = new ArrayList<>();
        for (QuestionDto obj:questions) {
            QuestionDto element;
            Question questionEntity = QuestionDto.DtoToEntity(obj);
            element = QuestionDto.entityToDto(questionRepository.save(questionEntity));
            element.setOptions(answerOptionService.createAnswerOptions(obj.getOptions(), element.getId()));
            response.add(element);
            testQuestionService.createTestQuestion(idTest, element.getId());
        }
        return response;
    }
}
