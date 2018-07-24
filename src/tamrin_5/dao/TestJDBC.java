package tamrin_5.dao;

import tamrin_5.model.Student;
import tamrin_5.model.Teacher;

import java.util.Scanner;

public class TestJDBC {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean again = true;
        while (again) {
            System.out.println("1: Add Teacher");
            System.out.println("2: Add Student:");
            System.out.println("3: Delete Student:");
            System.out.println("4: Find By Id Student:");
            System.out.println("5: Find By Id Teacher:");
            System.out.println("6: List All Teacher:");
            System.out.println("7: List All Student:");
            System.out.println("0: Exit");
            System.out.println("Enter Your Choice:");
            int i = scanner.nextInt();
            switch (i) {
                case 1:
                    addTeacher();
                    break;
                case 2:
                    addStudent();
                case 3:
                    deleteStudent();
                case 4:
                    findByIdStudent();
                    break;
                case 5:
                    findByIdTeacher();
                    break;
                case 6:
                    listTeacher();
                    break;
                case 7:
                    listStudent();
                    break;
                case 0:
                    again = false;
                    break;
                default:
                    System.out.println("Enter a Operation number");
            }
        }
    }

    private static void findByIdTeacher() {


    }

    private static void addStudent() {
        StudentDao studentDao=new StudentDao();
        Student s1=new Student("mahdi","Hosseinpour","Qom",1);
        studentDao.addEntity(s1);
    }

    private static void deleteStudent() {

    }

    private static void findByIdStudent() {
    }

    private static void listTeacher() {
        TeacherDao teacherDao=new TeacherDao();
        for(Teacher t :teacherDao.getAllEntity()){
            System.out.println(t.getFname() +" , "+ t.getLname() +" , "+ t.getAddress());
        }
        System.out.println();
    }
    private static void listStudent() {

    }

    private static void addTeacher() {
        TeacherDao teacherDao=new TeacherDao();
        Teacher t1=new Teacher("sadegh","Aliakbari","Computer");
        teacherDao.addEntity(t1);

    }
}
