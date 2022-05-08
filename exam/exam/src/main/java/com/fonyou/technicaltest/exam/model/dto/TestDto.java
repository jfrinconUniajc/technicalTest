package com.fonyou.technicaltest.exam.model.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fonyou.technicaltest.exam.model.Student;
import com.fonyou.technicaltest.exam.model.Test;
import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
@Builder
public class TestDto {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Long id;
    private String name;
    private List<QuestionDto> questions;

    public static TestDto entityToDto(Test test) {
        return TestDto.builder()
                .id(test.getId())
                .name(test.getName())
                .build();
    }

    public static Test DtoToEntity(TestDto test) {
        return Test.builder()
                .name(test.getName())
                .build();
    }
}
