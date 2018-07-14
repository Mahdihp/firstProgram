package tamrin_in_class_2.dao;

import tamrin_in_class_2.model.Student;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentDao extends AbstractPersonDao<Student> {

    public StudentDao() {

    }


    @Override
    public void addEntity(Student person) {
        Student student = (Student)person;
        try {
            Statement stmt = connection.createStatement();
            String sql = "INSERT INTO student(fname,lname,address,teacher_id) VALUES " +
                    "('" + student.getFname() + "','" + student.getLname() +
                    "','" + student.getAddress() + "'," + student.getTeacher_id()+");";
            stmt.executeQuery(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    @Override
    public void deleteEntity(Student person) {
        Student student = (Student)person;
        try {
            Statement stmt = connection.createStatement();
            String sql = "DELETE From student where id = " + student.getId();
            stmt.executeQuery(sql);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateEntity(Student person) {
        Student student = (Student)person;
        try {
            Statement stmt = connection.createStatement();
            String sql = "SELECT * From student where id = " + student.getId();
            ResultSet resultSet = stmt.executeQuery(sql);
            Student stud = new Student(resultSet.getInt("id"),
                    resultSet.getString("fname"),
                    resultSet.getString("lname"),
                    resultSet.getString("address"), resultSet.getInt("teacher_id"));
            if (stud != null) {
                sql = "UPDATE student SET fname='" + student.getFname() + "',lname=" + student.getLname() +
                        "',address='" + student.getAddress() + "',teacher_id='" + student.getTeacher_id() + "' where id = " + student.getId();
                stmt.executeQuery(sql);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Student findByIdEntity(Student person) {
        Student student = (Student)person;
        Student stud = null;
        try {
            Statement stmt = connection.createStatement();
            String sql = "SELECT * From student where id = " + student.getId();
            ResultSet resultSet = stmt.executeQuery(sql);
            stud = new Student(resultSet.getInt("id"),
                    resultSet.getString("fname"),
                    resultSet.getString("lname"),
                    resultSet.getString("address"), resultSet.getInt("teacher_id"));

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return stud;
    }

    @Override
    public List<Student> getAllEntity() {
        List<Student> list = new ArrayList<>();
        try {
            Statement stmt = connection.createStatement();
            String sql = "SELECT * From student";
            ResultSet resultSet = stmt.executeQuery(sql);
            while (resultSet.next()) {
                list.add(new Student(resultSet.getInt("id"),
                        resultSet.getString("fname"),
                        resultSet.getString("lname"),
                        resultSet.getString("address"), resultSet.getInt("teacher_id")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
