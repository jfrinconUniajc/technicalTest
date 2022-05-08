package com.fonyou.technicaltest.exam.model.dto;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fonyou.technicaltest.exam.model.Student;
import lombok.*;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
@Builder
public class StudentDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Long id;
    private String name;
    private int age;
    private String city;
    private String timezone;

    public static StudentDto entityToDto(Student student) {
        return StudentDto.builder()
                .id(student.getId())
                .name(student.getName())
                .age(student.getAge())
                .city(student.getCity())
                .timezone(student.getTimezone())
                .build();
    }

    public static Student DtoToEntity(StudentDto student) {
        return Student.builder()
                .name(student.getName())
                .age(student.getAge())
                .city(student.getCity())
                .timezone(student.getTimezone())
                .build();
    }

}




