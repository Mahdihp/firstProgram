package tamrin_6.Java_part.model;

public class StoryBook extends Book {

    private String style;

    public StoryBook(String title, BookWriter bookWriter, String style) {
        super(title, bookWriter);
        this.style = style;
    }
    public void getInfo(){

    }
}
