package tamrin_6.Java_part.model;

public class Librarian extends Person {

    private int librarianID;


    public Librarian(String firstName, String lastName, int librarianID) {
        super(firstName, lastName);
        this.librarianID = librarianID;
    }

    public int getLibrarianID() {
        return librarianID;
    }

    public void setLibrarianID(int librarianID) {
        this.librarianID = librarianID;
    }
}
