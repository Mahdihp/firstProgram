package tamrin_in_class_2.view;

import java.util.Scanner;

public class TestJDBC {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean again = true;
        while (again) {
            System.out.println("1: Add Teacher");
            System.out.println("2: Add Student:");
            System.out.println("3: Delete Teacher:");
            System.out.println("4: Delete Student:");
            System.out.println("5: Find By Id Student:");
            System.out.println("6: List All Teacher And Student:");
            System.out.println("7: Exit");
            System.out.print("Enter Your Choice:");
            int i = scanner.nextInt();
            switch (i) {
                case 1:
                    addTeacher();
                    break;
                case 2:
                    addStudent();
                case 3:
                    deleteTeacher();
                case 4:
                    deleteStudent();
                    break;
                case 5:
                    findByIdStudent();
                    break;
                case 6:
                    listOfTeacherAndStudent();
                    break;
                case 7:
                    again = false;
                    break;
                default:
                    System.out.println("Enter a Operation number");
            }
        }
    }

    private static void deleteTeacher() {

    }

    private static void addStudent() {

    }

    private static void deleteStudent() {

    }

    private static void findByIdStudent() {
    }

    private static void listOfTeacherAndStudent() {

    }

    private static void addTeacher() {

    }
}
