package tamrin_6.Java_part.model;

import java.util.Objects;

public class Book {

    private String title;
    private BookWriter bookWriter;

    public Book(String title, BookWriter bookWriter) {
        this.title = title;
        this.bookWriter = bookWriter;
    }


    public void getWriter() {
        System.out.println("First Nmae : " + bookWriter.getFirstName() + ", Last Name : " + bookWriter.getLastName());
    }

    public void getMemberBorrowed(){

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BookWriter getBookWriter() {
        return bookWriter;
    }

    public void setBookWriter(BookWriter bookWriter) {
        this.bookWriter = bookWriter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) &&
                Objects.equals(bookWriter, book.bookWriter);
    }

    @Override
    public int hashCode() {

        return Objects.hash(title, bookWriter);
    }
}
