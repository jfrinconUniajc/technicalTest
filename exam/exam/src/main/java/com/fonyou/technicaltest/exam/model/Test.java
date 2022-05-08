package com.fonyou.technicaltest.exam.model;

import lombok.*;

import javax.persistence.*;

@Table(name = "test")
@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
@Builder
public class Test {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
}
