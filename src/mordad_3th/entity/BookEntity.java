package com.mahdi.service.model;

public class BookEntity extends Entity {

    private String name;
    private String isbn;
    private int writerId;

    public BookEntity() {
        super();
    }

    public BookEntity(String name, String isbn, int writerId) {
        this.name = name;
        this.isbn = isbn;
        this.writerId = writerId;
    }

    public BookEntity(int id, String name, String isbn, int writerId) {
        super(id);
        this.name = name;
        this.isbn = isbn;
        this.writerId = writerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getWriterId() {
        return writerId;
    }

    public void setWriterId(int writerId) {
        this.writerId = writerId;
    }

    @Override
    public String toString() {
        return "BookEntity{" +
                "name='" + name + '\'' +
                ", isbn='" + isbn + '\'' +
                ", writerId=" + writerId +
                "} " + super.toString();
    }
}
