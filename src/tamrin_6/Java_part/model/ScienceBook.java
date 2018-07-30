package tamrin_6.Java_part.model;

public class ScienceBook extends Book {
    private String name;
    private BookWriter bookWriter;
    private String scienceField;

    public ScienceBook(String name, BookWriter bookWriter, String scienceField) {
        super(name, bookWriter);
        this.bookWriter = bookWriter;
        this.scienceField = scienceField;
    }

    public void getInfo() {
        System.out.println("Book Name : "+ getTitle() + getBookWriter()+" ,scienceField : "+scienceField);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BookWriter getBookWriter() {
        return bookWriter;
    }

    public void setBookWriter(BookWriter bookWriter) {
        this.bookWriter = bookWriter;
    }

    public String getScienceField() {
        return scienceField;
    }

    public void setScienceField(String scienceField) {
        this.scienceField = scienceField;
    }
}
