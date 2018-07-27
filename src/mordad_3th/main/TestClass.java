package mordad_3th.main;

import mordad_3th.dao.BookDao;
import mordad_3th.entity.BookEntity;
import mordad_3th.entity.Entity;

public class TestClass {
    public static void main(String[] args) {
        BookDao dao = new BookDao();
//        BookEntity be = new BookEntity(3, "Java Champion 3", "44444", "Mahdihp");

        for(Entity be :dao.readAll()) {
            System.out.println(be);
        }
    }
}
