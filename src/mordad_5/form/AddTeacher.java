package mordad_5.form;

import tamrin_5.dao.TeacherDao;
import tamrin_5.model.Teacher;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddTeacher {
    public JTextField txtFirstName;
    public JTextField txtLastName;
    public JTextField txtDept;
    public JButton saveButton;
    public JPanel addPanel;
    public static JFrame addFrame;


    public AddTeacher() {
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TeacherDao teacherDao=new TeacherDao();
                Teacher teacher=new Teacher(txtFirstName.getText(),txtLastName.getText(),txtDept.getText());
                teacherDao.addEntity(teacher);
//                addFrame.dispose();

            }
        });
    }

    public static void main(String[] args) {
        addFrame = new JFrame("Java calculator");
        addFrame.setSize(new Dimension(300, 100));

        addFrame.setContentPane(new LoginForm().loginPanel);
        addFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addFrame.pack();
        addFrame.setVisible(true);

    }
}
