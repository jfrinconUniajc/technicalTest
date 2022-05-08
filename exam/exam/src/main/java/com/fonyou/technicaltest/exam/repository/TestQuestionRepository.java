package com.fonyou.technicaltest.exam.repository;

import com.fonyou.technicaltest.exam.model.TestQuestion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestQuestionRepository extends JpaRepository<TestQuestion, Long> {

}
