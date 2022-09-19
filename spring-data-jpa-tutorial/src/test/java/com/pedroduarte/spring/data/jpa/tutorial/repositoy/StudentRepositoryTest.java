package com.pedroduarte.spring.data.jpa.tutorial.repositoy;

import com.pedroduarte.spring.data.jpa.tutorial.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentRepositoryTest {

    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void saveStudent(){
        Student student = Student.builder()
                .emailId("ppppp@gmail.com")
                .firstName("Pedro")
                .lastName("Carvalho")
                .guardianName("Maria Raquel")
                .guardianEmail("mmmrrrr@gmmm.com")
                .guardianMobile("3199999999")
                .build();
        studentRepository.save(student);
    }

    @Test
    public void printAllStudent(){
        List<Student> studentList = studentRepository.findAll();

        System.out.println("List of students: " + studentList);
    }

}