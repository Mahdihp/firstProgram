package mordad_3th.main;

import mordad_3th.dao.BookDao;
import mordad_3th.dao.WriterDao;
import mordad_3th.entity.BookEntity;
import mordad_3th.entity.Entity;
import mordad_3th.entity.WriterEntity;

import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean again = true;
        while (again) {
            System.out.println("1: Add BookWriter");
            System.out.println("2: Delete BookWriter:");
            System.out.println("3: Find By BookWriter:");
            System.out.println("4: List All BookWriter:");

            System.out.println("5: Add Book");
            System.out.println("6: Delete Book:");
            System.out.println("7: Find By Book:");
            System.out.println("8: List All Book:");

            System.out.println("0: Exit");
            System.out.print("Enter Your Choice:");
            int i = scanner.nextInt();
            switch (i) {
                case 1:
                    addBookWriter();
                    break;
                case 2:
                    deleteBookWriter();
                case 3:
                    findByBookIdWriter();
                case 4:
                    listBookWriter();
                    break;
                case 5:
                    addBook();
                    break;
                case 6:
                    deleteBook();
                    break;
                case 7:
                    findByBookId();
                    break;
                case 8:
                    listBook();
                    break;
                case 0:
                    again = false;
                    break;
                default:
                    System.out.println("Enter a Operation number");
            }
        }
    }

    private static void listBook() {
        try {
            BookDao bookDao = new BookDao();
            for (Entity e : bookDao.readAll()) {
                BookEntity bw = (BookEntity) e;
                System.out.println("Name : " + bw.getName() + ", ISBN : " + bw.getIsbn() + ", Writer Id : " + bw.getWriterId());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void findByBookId() {
        try {
            BookDao bookDao = new BookDao();
            System.out.print("Enter Book Id for find:");
            Scanner sc = new Scanner(System.in);
            int id = sc.nextInt();
            Entity read = bookDao.read(id);
            System.out.println("");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void deleteBook() {
        try {
            BookDao bookDao = new BookDao();
            System.out.print("Enter Book Id for delete:");
            Scanner sc = new Scanner(System.in);
            int id = sc.nextInt();
            bookDao.delete(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void addBook() {
        try {
            BookDao bookDao = new BookDao();
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Writer Name ISBN writer Id:");

            String name = sc.next();
            String isbn = sc.next();
            int writer_Id = sc.nextInt();
            bookDao.create(new BookEntity(name, isbn, writer_Id));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void listBookWriter() {
        try {
            WriterDao writerDao = new WriterDao();
            for (Entity e : writerDao.readAll()) {
                WriterEntity bw = (WriterEntity) e;
                System.out.println("Name : " + bw.getName() + ", Age : " + bw.getAge() + ", Style : " + bw.getStyle());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void findByBookIdWriter() {
        try {
            WriterDao writerDao = new WriterDao();
            System.out.print("Enter Writer Id for find:");
            Scanner sc = new Scanner(System.in);
            int id = sc.nextInt();
            Entity read = writerDao.read(id);
            System.out.println("");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void deleteBookWriter() {
        try {
            WriterDao writerDao = new WriterDao();
            System.out.print("Enter Writer Id for delete:");
            Scanner sc = new Scanner(System.in);
            int id = sc.nextInt();
            writerDao.delete(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    private static void addBookWriter() {
        try {

            WriterDao writerDao = new WriterDao();
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Name Age Style Writer Id:");

            String name = sc.next();
            int age = sc.nextInt();
            String style = sc.next();
            writerDao.create(new WriterEntity(name, age, style));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
