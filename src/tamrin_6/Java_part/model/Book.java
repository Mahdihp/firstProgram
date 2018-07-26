package tamrin_6.Java_part.model;

public class Book {

    private String title;
    private BookWriter bookWriter;

    public Book(String title, BookWriter bookWriter) {
        this.title = title;
        this.bookWriter = bookWriter;
    }


    public void getWriter() {
        System.out.println("First Nmae : " + bookWriter.getfName() + ", Last Name : " + bookWriter.getlName());
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

}
