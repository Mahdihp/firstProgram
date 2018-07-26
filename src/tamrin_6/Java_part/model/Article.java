package tamrin_6.Java_part.model;

public class Article  extends Researches{

    private String journal;
    private int year;

    public Article(String title, BookWriter bookWriter, String universityName, String journal, int year) {
        super(title, bookWriter, universityName);
        this.journal = journal;
        this.year = year;
    }
    public void getInfo(){

    }
}
