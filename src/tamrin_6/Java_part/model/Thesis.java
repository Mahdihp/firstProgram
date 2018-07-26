package tamrin_6.Java_part.model;

public class Thesis extends Researches {

    private String professor;

    public Thesis(String title, BookWriter bookWriter, String universityName, String professor) {
        super(title, bookWriter, universityName);
        this.professor = professor;
    }

    public void getInfo(){

    }
}
