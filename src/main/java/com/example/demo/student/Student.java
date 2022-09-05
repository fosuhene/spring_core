package com.example.demo.student;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;

//map student class to database
@Entity     //hibernate
@Table      //for table in our database
public class Student {
    @Id
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )

    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )

    private Integer id;
    private String name;
    private String gender;
    private LocalDate dob;
    private String email;

    @Transient
    private Integer age;

    //generate empty constructor
    public Student() {
    }

    //generate constructor with all fields
    public Student(Integer id, String name, String gender, LocalDate dob, String email) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.email = email;
    }

    //generate constructor without id
    // db will generate id

    public Student(String name, String gender, LocalDate dob, String email) {
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.email = email;
    }

    //generate getters and setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        //return age;
        return Period.between(this.dob, LocalDate.now()).getYears();
    }

    public void setAge(Integer age) {
        this.age = age;
    }


    //generate toString

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", dob=" + dob +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }

}
