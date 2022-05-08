package com.fonyou.technicaltest.exam.model;

import lombok.*;

import javax.persistence.*;

@Table(name = "test_question")
@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
@Builder
public class TestQuestion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long idTest;
    private Long idQuestion;

}
