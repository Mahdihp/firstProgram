package mordad_3th.main;

import mordad_3th.dao.BookDao;
import mordad_3th.entity.BookEntity;

public class TestClass {
    public static void main(String[] args) {
        BookDao dao = new BookDao();
        BookEntity be = new BookEntity(1, "Java Champion", "123456", "Mahdihp");
        System.out.println(dao.create(be));
    }
}
