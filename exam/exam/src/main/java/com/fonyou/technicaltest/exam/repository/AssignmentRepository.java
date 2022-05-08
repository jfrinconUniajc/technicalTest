package com.fonyou.technicaltest.exam.repository;

import com.fonyou.technicaltest.exam.model.Assignment;
import com.fonyou.technicaltest.exam.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssignmentRepository extends JpaRepository<Assignment, Long> {

}
