package tamrin_6.Java_part;

import tamrin_6.Java_part.model.Book;
import tamrin_6.Java_part.model.BorreowBook;
import tamrin_6.Java_part.model.Member;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library {

    private String name;
    private String Librarian;
    private List<Book> bookList = new ArrayList<>(); // لیست ککل کتاب ها
    private List<BorreowBook> borreowBookList=new ArrayList<>(); // کتاب های امانت داده شده

    public Library(String name) {
        this.name = name;
    }

    public void addBook(Book book) {
        bookList.add(book);
    }

    public void deleteBook(Book book) {
        bookList.remove(book);
    }

    public void addBorreowedBooks(Book book, Member member, LibraryDate
            borrowedBackDate) {
        borreowBookList.add(new BorreowBook(book,member,borrowedBackDate));
    }

    public void deleteBorrowedBook(Book borrowedBook, LibraryDate
            borrowedBackDate) {

    }
    public void getBooks(){

    }
    public void getBorrowedBooks(){

    }
    public void getAvailableBooks(){

    }
    public void addLibrarian(){

    }
    public void getLibrarians(){

    }
    public void deleteLibrarian(tamrin_6.Java_part.model.Librarian librarian){

    }
    public void addMember(Member member){

    }
    public void getMembers(){

    }
    public void deleteMember(Member member){

    }

}
