package com.example.demo.Resource;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class ResourceService {
    public List<Resource> getResource(){
        return List.of(
                new Resource(
                        1,
                        "The deer and the lazy dog",
                        "Interesting tale of story from the other side of the world",
                        "Ruth Mings",
                        "IHG564-98R",
                        LocalDate.of(2018, Month.MARCH, 6),
                        15,
                        1
                )
        );
    }
}
