package com.pedroduarte.spring.data.jpa.tutorial.repositoy;

import com.pedroduarte.spring.data.jpa.tutorial.entity.Course;
import com.pedroduarte.spring.data.jpa.tutorial.entity.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class TeacherRepositoryTest {

    @Autowired
    private TeacherRepository teacherRepository;

    @Test
    public void saveTeacher(){
        Course courseJava = Course.builder()
                .title("Java")
                .credit(5)
                .build();

        Course coursePhyton = Course.builder()
                .title("Phyton")
                .credit(3)
                .build();

        Teacher teacher = Teacher.builder()
                .firstName("Peter")
                .lastName("Carvalho")
              //  .course(List.of(courseJava, coursePhyton))
                .build();
        teacherRepository.save(teacher);
    }

}