package com.pedroduarte.spring.data.jpa.tutorial.repositoy;

import com.pedroduarte.spring.data.jpa.tutorial.entity.Guardian;
import com.pedroduarte.spring.data.jpa.tutorial.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class StudentRepositoryTest {
    //Esta anotação permite utilizar a classe sem precisar instanciar
    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void saveStudent(){
        Student student = Student.builder()
                .emailId("ppasdpp@gmail.com")
                .firstName("Pedro")
                .lastName("Carvalho")
             /**   .guardianName("Maria Raquel")
                .guardianEmail("mmmrrrr@gmmm.com")
                .guardianMobile("3199999999")*/
                .build();
        studentRepository.save(student);
    }

    @Test
    public void saveStudentWhitGuardian(){
        Guardian guardian = Guardian.builder()
                .name("Maria Raquel")
                .email("rrrr@gmail.com")
                .mobile("3199999999")
                .build();

        Student student = Student.builder()
                .firstName("Andre")
                .emailId("aaaaaa@gmail.com")
                .lastName("Carvalho")
                .guardian(guardian)
                .build();

        studentRepository.save(student);
    }


    @Test
    public void printAllStudent(){
        List<Student> studentList = studentRepository.findAll();

        System.out.println("List of students: " + studentList);
    }
    @Test
    public void printStudentByFirstName(){
        List<Student> students = studentRepository.findByFirstName("Pedro");
        System.out.println("students = " + students);
    }
    @Test
    public void printStudentByFirstNameContaining(){
        List<Student> students = studentRepository.findByFirstNameContaining("pe");
        System.out.println("students = " + students);
    }

    @Test
    public void printStudentBasedOnGuardian(){
        List<Student> students = studentRepository.findByGuardianName("Maria Raquel");
        System.out.println("students = " + students);
    }

    @Test
    public void printGetStudentByEmailAddress(){
        Student student = studentRepository.getStudentByEmailAddress("ppppp@gmail.com");
        System.out.println("student = " + student);
    }

    @Test
    public void printGetStudentByEmailAddressNative(){
        Student student = studentRepository.getStudentByEmailAddressNative("ppppp@gmail.com");
        System.out.println("student = " + student);
    }

    @Test
    public void printGetStudentByEmailAddressNativeNamedParam(){
        Student student = studentRepository.getStudentByEmailAddressNativeNamedParam("ppppp@gmail.com");
        System.out.println("student = " + student);
    }

    @Test
    public void printUpdateStudentNameByEmailId() {
        int student = studentRepository.updateStudentNameByEmailId("Pedro Henrique", "ppppp@gmail.com");
        System.out.println("student = " + student);
    }
}