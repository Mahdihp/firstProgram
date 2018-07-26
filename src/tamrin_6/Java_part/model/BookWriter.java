package tamrin_6.Java_part.model;

public class BookWriter extends Person {

    private int id;

    public BookWriter(String firstName, String lastName, int id) {
        super(firstName, lastName);
        this.id = id;
    }

    public void getWrittenBooks(){

    }
    public void addWrittenBooks(Book book){

    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

}
