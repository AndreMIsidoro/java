package com.bookstore.book_service.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import java.math.BigDecimal;

@Entity
public class Book {

    @Id
    @GeneratedValue
    private Long id;

    private String title;
    private String author;
    private BigDecimal price;


    public Book(Long id, String title, String author, BigDecimal price) {
      this.id = id;
      this.title = title;
      this.author = author;
      this.price = price;
    }


    public Long getId() {
      return id;
    }
    public void setId(Long id) {
      this.id = id;
    }
    public String getTitle() {
      return title;
    }
    public void setTitle(String title) {
      this.title = title;
    }
    public String getAuthor() {
      return author;
    }
    public void setAuthor(String author) {
      this.author = author;
    }
    public BigDecimal getPrice() {
      return price;
    }
    public void setPrice(BigDecimal price) {
      this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return id != null && id.equals(book.getId());
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
