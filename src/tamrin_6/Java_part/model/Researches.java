package tamrin_6.Java_part.model;

public class Researches extends Book {

    private String universityName;

    public Researches(String title, BookWriter bookWriter, String universityName) {
        super(title, bookWriter);
        this.universityName = universityName;
    }
}
