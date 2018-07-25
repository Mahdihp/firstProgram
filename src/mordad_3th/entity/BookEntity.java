package mordad_3th.entity;

public class BookEntity {

    private int id;
    private String name;
    private String isbn;
    private int writerId;

    public BookEntity() {
    }

    public BookEntity(int id, String name, String isbn, int writerId) {
        this.id = id;
        this.name = name;
        this.isbn = isbn;
        this.writerId = writerId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getWriterId() {
        return writerId;
    }

    public void setWriterId(int writerId) {
        this.writerId = writerId;
    }

    @Override
    public String toString() {
        return "BookEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", isbn='" + isbn + '\'' +
                ", writerId='" + writerId + '\'' +
                '}';
    }
}
