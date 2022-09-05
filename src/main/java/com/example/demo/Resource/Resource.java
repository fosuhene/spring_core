package com.example.demo.Resource;

import java.time.LocalDate;

public class Resource {
    private Integer id;
    private String name;
    private String description;
    private String author;
    private String ISBN;
    private LocalDate published_date;
    private Integer quantity;
    private Integer createdBy;


    //generate empty constructor
    public Resource() {
    }

    //generate constructor with all fields
    public Resource(Integer id, String name, String description, String author, String ISBN, LocalDate published_date, Integer quantity, Integer createdBy) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.author = author;
        this.ISBN = ISBN;
        this.published_date = published_date;
        this.quantity = quantity;
        this.createdBy = createdBy;
    }

    //generate constructor without id. DB will generate id
    public Resource(String name, String description, String author, String ISBN, LocalDate published_date, Integer quantity, Integer createdBy) {
        this.name = name;
        this.description = description;
        this.author = author;
        this.ISBN = ISBN;
        this.published_date = published_date;
        this.quantity = quantity;
        this.createdBy = createdBy;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public LocalDate getPublished_date() {
        return published_date;
    }

    public void setPublished_date(LocalDate published_date) {
        this.published_date = published_date;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    //generate toString
    @Override
    public String toString() {
        return "Resource{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", author='" + author + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", published_date=" + published_date +
                ", quantity=" + quantity +
                ", createdBy=" + createdBy +
                '}';
    }
}
