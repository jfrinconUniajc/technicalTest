package com.fonyou.technicaltest.exam.repository;

import com.fonyou.technicaltest.exam.model.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestRepository extends JpaRepository<Test, Long> {

}
