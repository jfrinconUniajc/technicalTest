package com.fonyou.technicaltest.exam.service.impl;
import com.fonyou.technicaltest.exam.model.AnswerOption;
import com.fonyou.technicaltest.exam.model.dto.AnswerOptionDto;
import com.fonyou.technicaltest.exam.repository.AnswerOptionRepository;
import com.fonyou.technicaltest.exam.service.AnswerOptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AnswerOptionImpl implements AnswerOptionService {
    private final AnswerOptionRepository answerOptionRepository;


    @Autowired
    public AnswerOptionImpl(
            AnswerOptionRepository answerOptionRepository) {
        this.answerOptionRepository = answerOptionRepository;
    }


    @Override
    public List<AnswerOptionDto> createAnswerOptions(List<AnswerOptionDto> answers, Long idQuestion) {
        List<AnswerOptionDto> response = new ArrayList<>();
        for (AnswerOptionDto obj:answers) {
            AnswerOption answerEntity = AnswerOptionDto.DtoToEntity(obj);
            answerEntity.setIdQuestion(idQuestion);
            response.add(AnswerOptionDto.entityToDto(answerOptionRepository.save(answerEntity)));
        }
        return response;
    }
}
