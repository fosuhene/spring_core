package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

//initantiate studentService class a bean
@Service
public class StudentService {

    //declare student repository interface class to use database on student model
    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudent(){
        return studentRepository.findAll();

    }

    public void addNewStudent(Student student) {
      Optional<Student> studentByEmail =  studentRepository.findStudentByEmail(student.getEmail());

      if(studentByEmail.isPresent()){
           throw new IllegalStateException("email already taken.");
        }

      studentRepository.save(student);
    }

    //delete student record from the db
    public void deleteStudent(Integer studentId) {
      boolean exist =  studentRepository.existsById(studentId);
        if(!exist){
            throw new IllegalStateException("student with id " + studentId + " does not exist!");
        }

        studentRepository.deleteById(studentId);
    }

    //update student record.
    @Transactional
    public void updateStudent(Integer studentId, String name, String gender, String email) {
           Student student =  studentRepository.findById(studentId).orElseThrow(() -> new IllegalStateException(
                    "student with " + studentId + " does not exist!"
            ));

            if(name != null && name.length() > 0 && !Objects.equals(student.getName(), name)){
                student.setName(name);
            }

            if(email != null && email.length() > 0 && !Objects.equals(student.getEmail(), email)){

                Optional<Student> studentOptional = studentRepository.findStudentByEmail(email);
                if(studentOptional.isPresent()){
                    throw new IllegalStateException("email already taken!");
                }

                student.setEmail(email);
            }
    }
}
