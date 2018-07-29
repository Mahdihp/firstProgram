package tamrin_6.Java_part.model;

import tamrin_6.Java_part.LibraryDate;

public class BorreowBook {

    private Book book;
    private Member member;
    private LibraryDate  borrowedBackDate;

    public BorreowBook(Book book, Member member, LibraryDate borrowedBackDate) {
        this.book = book;
        this.member = member;
        this.borrowedBackDate = borrowedBackDate;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public LibraryDate getBorrowedBackDate() {
        return borrowedBackDate;
    }

    public void setBorrowedBackDate(LibraryDate borrowedBackDate) {
        this.borrowedBackDate = borrowedBackDate;
    }
}
