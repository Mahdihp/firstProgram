package mordad_3_abstract_interface;

public class Book implements Printable, Borrowable {


    private String bookName;
    private String isbn;
    private boolean flag;

    @Override
    public void print() {
        System.out.println("Book Title : " + bookName + ", ISBN : " + isbn);
    }

    @Override
    public void borrow() {
        flag = false;
    }

}
