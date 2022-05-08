package com.fonyou.technicaltest.exam.model.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fonyou.technicaltest.exam.model.Assignment;
import com.fonyou.technicaltest.exam.model.TestQuestion;
import lombok.*;

import java.sql.Timestamp;


@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
@Builder
public class AssignmentDto {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Long id;
    private Long idTest;
    private Long idStudent;
    private Timestamp dateAssignment;

    public static AssignmentDto entityToDto(Assignment assignment) {
        return AssignmentDto.builder()
                .idTest(assignment.getIdTest())
                .idStudent(assignment.getIdStudent())
                .dateAssignment(assignment.getDate_assignment())
                .build();
    }

    public static Assignment DtoToEntity(AssignmentDto assignment) {
        return Assignment.builder()
                .idTest(assignment.getIdTest())
                .idStudent(assignment.getIdStudent())
                .date_assignment(assignment.getDateAssignment())
                .build();
    }
}
