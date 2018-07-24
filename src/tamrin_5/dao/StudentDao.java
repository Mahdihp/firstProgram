package tamrin_5.dao;

import tamrin_5.dao.AbstractPersonDao;
import tamrin_5.model.Student;
import tamrin_5.model.Teacher;

import java.sql.PreparedStatement;
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
        Student student = (Student) person;
        try {
            String sql = "INSERT INTO student(fname,lname,department,teacher_id) VALUES (?,?,?,?)";
            PreparedStatement preparedStatement = null;
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, student.getFname());
            preparedStatement.setString(2, student.getLname());
            preparedStatement.setString(3, student.getDepartment());
            preparedStatement.setInt(4, student.getTeacher_id());

            System.out.println(student.getDepartment());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteEntity(int id) {
        try {
            Statement stmt = connection.createStatement();
            String sql = "DELETE From student where id =" + id;
            stmt.executeUpdate(sql);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteEntity(Student person) {
        Student student = (Student) person;
        try {
            Statement stmt = connection.createStatement();
            String sql = "DELETE From student where id = " + student.getId();
            stmt.executeQuery(sql);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Teacher findByIdEntity(int id) {
        Teacher stud = null;
        try {
            Statement stmt = connection.createStatement();
            String sql = "SELECT * From student where id = " + id;
            ResultSet resultSet = stmt.executeQuery(sql);
            resultSet.next();
            int teacherId= resultSet.getInt("teacher_id");
            sql = "SELECT * FROM teacher where id ="+ teacherId;
            resultSet = stmt.executeQuery(sql);
            resultSet.next();
            stud =new Teacher(resultSet.getString("fname"),resultSet.getString("lname"),resultSet.getString("address"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return stud;
    }

    @Override
    public Student findByIdEntity(Student person) {
        Student student = (Student) person;
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
