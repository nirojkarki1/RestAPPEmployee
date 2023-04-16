package com.javaguides.demoSpringBoot.Dao;

import com.javaguides.demoSpringBoot.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDao  extends JpaRepository<Student,Integer> {
}
