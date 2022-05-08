package com.fonyou.technicaltest.exam.model.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fonyou.technicaltest.exam.model.Question;
import com.fonyou.technicaltest.exam.model.Test;
import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
@Builder
public class QuestionDto {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Long id;
    private String description;
    private List<AnswerOptionDto> options;
    private int point;

    public static QuestionDto entityToDto(Question question) {
        return QuestionDto.builder()
                .id(question.getId())
                .description(question.getDescription())
                .point(question.getPoint())
                .build();
    }

    public static Question DtoToEntity(QuestionDto question) {
        return Question.builder()
                .description(question.getDescription())
                .point(question.getPoint())
                .build();
    }
}
