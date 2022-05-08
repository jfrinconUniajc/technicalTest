package com.fonyou.technicaltest.exam.model;

import lombok.*;

import javax.persistence.*;

@Table(name = "question")
@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
@Builder
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private  int point;
}
