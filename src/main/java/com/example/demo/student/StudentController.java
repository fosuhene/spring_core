package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

    //declare reference to the StudentService
    private final StudentService studentService;

    //generate constructor
    @Autowired  //dependency injection  // meaning StudentService shld be wired for us
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
        public List<Student> getStudent(){
            //use constructor to access methods
            return studentService.getStudent();
    }

    //posting db
    @PostMapping
    public void registerNewStudent(@RequestBody Student student){
        //invoke student service
        studentService.addNewStudent(student);
    }

    //deletion
    @DeleteMapping(path = "{studentId}")
    public void deleteStudent(@PathVariable("studentId") Integer studentId){
            studentService.deleteStudent(studentId);
    }

    //update student profile
    @PutMapping(path = "{studentId}")
    public void updateStudent(
        @PathVariable("studentId") Integer studentId,
        @RequestParam(required = false) String name,
        @RequestParam(required = false) String gender,
        @RequestParam(required = false) String email)
        {
            studentService.updateStudent(studentId, name, gender, email);
        }

}
