package tamrin_6.Java_part.model;

import java.util.Objects;

public class StoryBook extends Book {

    private String style;

    public StoryBook(String title, BookWriter bookWriter, String style) {
        super(title, bookWriter);
        this.style = style;
    }

    public void getInfo() {
        System.out.println("Book Name : " + getTitle() + getBookWriter() + " ,style : " + style);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        StoryBook storyBook = (StoryBook) o;
        return Objects.equals(style, storyBook.style);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), style);
    }
}
