package com.example.demo.librarian;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class LibrarianService {
    public List<Librarian> getLibrarian(){
        return List.of(
                new Librarian(
                        1,
                        "James Obeng",
                        "Manager",
                        LocalDate.of(2015, Month.JUNE, 15)
                ),
                new Librarian(
                        2,
                        "Rita Obeng",
                        "Attendant",
                        LocalDate.of(2021, Month.JANUARY, 8)
                )
        );
    }
}
