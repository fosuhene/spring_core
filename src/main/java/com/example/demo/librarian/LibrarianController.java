package com.example.demo.librarian;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/librarian")
public class LibrarianController {

    //declare reference to the Librarian Service
    private final   LibrarianService librarianService;

    //generate constructor
    @Autowired
    public LibrarianController(LibrarianService librarianService) {
        this.librarianService = librarianService;
    }

    @GetMapping
    public List<Librarian> getLibrarian() {
        return librarianService.getLibrarian();
    }


}