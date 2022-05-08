package com.fonyou.technicaltest.exam.service;

import com.fonyou.technicaltest.exam.model.dto.AnswerOptionDto;
import com.fonyou.technicaltest.exam.model.dto.QuestionDto;
import java.util.List;


public interface AnswerOptionService {
    List<AnswerOptionDto> createAnswerOptions(List<AnswerOptionDto> answers, Long idQuestion);
}
