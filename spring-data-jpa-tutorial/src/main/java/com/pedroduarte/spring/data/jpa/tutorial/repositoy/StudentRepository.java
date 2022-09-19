package com.pedroduarte.spring.data.jpa.tutorial.repositoy;

import com.pedroduarte.spring.data.jpa.tutorial.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
