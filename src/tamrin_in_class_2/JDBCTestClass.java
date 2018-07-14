package tamrin_in_class_2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCTestClass {
    static Connection conn = null;

    public static void main(String[] args) {
        conn = DBConnection.getConnection();

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

    private static void addTeacher() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Fname & LName & Department From Teacher:");
        String fName = scanner.next();
        String lName = scanner.next();
        String dept = scanner.next();
        try {
            Statement stmt = conn.createStatement();
            String sql = "INSERT INTO teacher(fname,lname,dept) VALUES  ('" + fName + "','" + lName + "','" + dept + "');";
            stmt.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void addStudent() {
        Scanner scanner = new Scanner(System.in);
        getListTeacher();
        System.out.println("Enter Fname & LName & Address From Student:");
        String fName = scanner.next();
        String lName = scanner.next();
        String address = scanner.next();
        try {
            Statement stmt = conn.createStatement();
            String sql = "INSERT INTO student(fname,lname,address,teacher_id) VALUES  ('" + fName + "','" + lName + "','" + address + "','" + 1 + "');";
            stmt.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void getListTeacher() {
        System.out.println("Teacher List:");
        try {
            Statement stmt = conn.createStatement();
            String sql = "SELECT * From teacher";
            ResultSet resultSet = stmt.executeQuery(sql);
                while (resultSet.next()) {
                    System.out.println("FLName Teacher: " + resultSet.getString("id")
                            +" " + resultSet.getString("fname") + " " + resultSet.getString("fname"));
                }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void deleteTeacher() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Teacher Id from Delete Entry:");
        int id = scanner.nextInt();
        try {
            Statement stmt = conn.createStatement();
            String sql = "DELETE FROM teacher WHERE id = "+id;
            stmt.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void deleteStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Student Id from Delete Entry:");
        int id = scanner.nextInt();
        try {
            Statement stmt = conn.createStatement();
            String sql = "DELETE FROM student WHERE id = "+id;
            stmt.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void findByIdStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Student Id :");
        int id = scanner.nextInt();
        try {
            Statement stmt = conn.createStatement();
            String sql = "SELECT " +
                    "student.fname,student.lname," +
                    "teacher.fname,teacher.lname " +
                    "FROM " +
                    "student " +
                    " INNER JOIN teacher ON student.teacher_id = teacher.id " +
                    " WHERE " +
                    "student.id = "+ id;
            ResultSet resultSet = stmt.executeQuery(sql);
            if (resultSet.getRow() > 0) {
                while (resultSet.next()) {
                    System.out.println("FLName Student: " + resultSet.getString("fname") + " " + resultSet.getString("fname") +
                            " " + "FLName Teacher : " + resultSet.getString("LNameTeacher"));
                }
            }else{
                System.out.println("Connot Row Entiry.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void listOfTeacherAndStudent() {

    }



}
