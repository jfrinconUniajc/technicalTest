package com.fonyou.technicaltest.exam.service.impl;
import com.fonyou.technicaltest.exam.model.Test;
import com.fonyou.technicaltest.exam.model.TestQuestion;
import com.fonyou.technicaltest.exam.model.dto.TestDto;
import com.fonyou.technicaltest.exam.model.dto.TestQuestionDto;
import com.fonyou.technicaltest.exam.repository.TestQuestionRepository;
import com.fonyou.technicaltest.exam.service.TestQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestQuestionImpl implements TestQuestionService {
    private final TestQuestionRepository testQuestionRepository;


    @Autowired
    public TestQuestionImpl(
            TestQuestionRepository testQuestionRepository) {
        this.testQuestionRepository = testQuestionRepository;
    }

    @Override
    public TestQuestionDto createTestQuestion(Long idTest, Long idQuestion){
        TestQuestion testEntity = TestQuestionDto.DtoToEntity(idTest,idQuestion);
        return TestQuestionDto.entityToDto(testQuestionRepository.save(testEntity));
    }
}
