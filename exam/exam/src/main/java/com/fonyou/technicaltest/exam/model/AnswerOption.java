package com.fonyou.technicaltest.exam.model;

import lombok.*;

import javax.persistence.*;

@Table(name = "answer_option")
@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
@Builder
public class AnswerOption {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long idQuestion;
    private String description;
    private int isCorrect;
    private String position;
}
