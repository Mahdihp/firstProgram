package tamrin_6.Java_part;

import tamrin_6.Java_part.model.*;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private String name;
    private List<Person> librarianList = new ArrayList<>(); // لیست متصدیان کتابخانه
    private List<Book> bookList = new ArrayList<>(); // لیست ککل کتاب ها
    private List<BorreowBook> borreowBookList = new ArrayList<>(); // کتاب های امانت داده شده
    private List<Member> memberList=new ArrayList<>();

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
        borreowBookList.add(new BorreowBook(book, member, borrowedBackDate));
    }

    public void deleteBorrowedBook(Book borrowedBook, LibraryDate
            borrowedBackDate) {
        borreowBookList.remove(new BorreowBook(borrowedBook, null, borrowedBackDate));

    }

    public void getBooks() {
        for (Book b :  bookList) {
            System.out.println("Book Title : "+ b.getTitle());
        }
    }

    public void getBorrowedBooks() {
        for (BorreowBook b :  borreowBookList) {
            System.out.println("Borrowed Book Title : "+ b.getBook().getTitle());
        }
    }

    public void getAvailableBooks() {
        for (Book b :  bookList) {
            for (BorreowBook bb :  borreowBookList) {
               if (!b.equals(bb.getBook())){
                   System.out.println("Book Title : "+ b.getTitle());
               }
            }
        }
    }

    public void addLibrarian(Person librarian) {
        this.librarianList.add(librarian);
    }

    public void getLibrarians() {
        for (Person p  : librarianList) {
            Librarian lib= (Librarian) p;
            System.out.println("First Name : "+ lib.getFirstName()+", Last Name : "+ lib.getLastName()+", Personal Id : "+lib.getLibrarianID());
        }
    }

    public void deleteLibrarian(tamrin_6.Java_part.model.Librarian librarian) {
        librarianList.remove(librarian);
    }

    public void addMember(Member member) {
            memberList.add(member);
    }

    public void getMembers() {
        for (Member p  : memberList) {
            System.out.println("First Name : "+ p.getFirstName()+", Last Name : "+ p.getLastName()+", Member ID : "+p.getMemberID());
        }
    }

    public void deleteMember(Member member) {
        memberList.remove(member);
    }

}
