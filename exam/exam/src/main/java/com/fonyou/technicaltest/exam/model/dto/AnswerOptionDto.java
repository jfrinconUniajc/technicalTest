package com.fonyou.technicaltest.exam.model.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fonyou.technicaltest.exam.model.AnswerOption;
import com.fonyou.technicaltest.exam.model.Student;
import lombok.*;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
@Builder
public class AnswerOptionDto {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Long id;
    private Long idQuestion;
    private String description;
    private int isCorrect;
    private String position;
    public static AnswerOptionDto entityToDto(AnswerOption ao) {
        return AnswerOptionDto.builder()
                .id(ao.getId())
                .idQuestion(ao.getIdQuestion())
                .description(ao.getDescription())
                .isCorrect(ao.getIsCorrect())
                .position(ao.getPosition())
                .build();
    }

    public static AnswerOption DtoToEntity(AnswerOptionDto ao) {
        return AnswerOption.builder()
                .idQuestion(ao.getIdQuestion())
                .description(ao.getDescription())
                .isCorrect(ao.getIsCorrect())
                .position(ao.getPosition())
                .build();
    }
}
