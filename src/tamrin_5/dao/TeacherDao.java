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

public class TeacherDao extends AbstractPersonDao<Teacher> {

    public TeacherDao() {

    }

    @Override
    public void addEntity(Teacher person) {
        Teacher teacher = (Teacher) person;
        try {
            String sql = "INSERT INTO teacher(fname,lname,address) VALUES (?,?,?)";
            PreparedStatement preparedStatement = null;
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, teacher.getFname());
            preparedStatement.setString(2, teacher.getLname());
            preparedStatement.setString(3, teacher.getAddress());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteEntity(Teacher person) {

    }


    @Override
    public Teacher findByIdEntity(Teacher person) {
        return null;
    }

    @Override
    public List<Teacher> getAllEntity() {
        List<Teacher> teacherList = new ArrayList<>();

        try {
            PreparedStatement preparedStatement = null;
            String sql = "SELECT * FROM teacher;";
            preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {

                teacherList.add(new Teacher(rs.getString("fname")
                        , rs.getString("lname"), rs.getString("address")));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return teacherList;
    }
}