package com.fonyou.technicaltest.exam.repository;

import com.fonyou.technicaltest.exam.model.AnswerOption;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnswerOptionRepository extends JpaRepository<AnswerOption, Long> {

}
