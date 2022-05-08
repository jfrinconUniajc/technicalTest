package com.fonyou.technicaltest.exam.model;

import lombok.*;

import javax.persistence.*;
import java.sql.Timestamp;

@Table(name = "assignment")
@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
@Builder
public class Assignment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long idStudent;
    private Long idTest;
    private Timestamp date_assignment;
}
