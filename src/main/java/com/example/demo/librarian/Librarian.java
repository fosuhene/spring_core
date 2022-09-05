package com.example.demo.librarian;

import java.time.LocalDate;

public class Librarian {
    private Integer id;
    private String name;
    private String role;
    private LocalDate date_joined;

    //generate empty constructor
    public Librarian() {
    }

    //generate constructor with all fields
    public Librarian(Integer id, String name, String role, LocalDate date_joined) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.date_joined = date_joined;
    }

    //generate constructor without id. DB generates id for us
    public Librarian(String name, String role, LocalDate date_joined) {
        this.name = name;
        this.role = role;
        this.date_joined = date_joined;
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public LocalDate getDate_joined() {
        return date_joined;
    }

    public void setDate_joined(LocalDate date_joined) {
        this.date_joined = date_joined;
    }

    //generate toString

    @Override
    public String toString() {
        return "Librarian{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", role='" + role + '\'' +
                ", date_joined=" + date_joined +
                '}';
    }
}
