package com.fonyou.technicaltest.exam.model.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fonyou.technicaltest.exam.model.Test;
import com.fonyou.technicaltest.exam.model.TestQuestion;
import lombok.*;


@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
@Builder
public class TestQuestionDto {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Long id;
    private Long idTest;
    private Long idQuestion;

    public static TestQuestionDto entityToDto(TestQuestion testQuestion) {
        return TestQuestionDto.builder()
                .idTest(testQuestion.getIdTest())
                .idQuestion(testQuestion.getIdQuestion())
                .build();
    }

    public static TestQuestion DtoToEntity(Long idTest, Long idQuestion) {
        return TestQuestion.builder()
                .idTest(idTest)
                .idQuestion(idQuestion)
                .build();
    }
}
