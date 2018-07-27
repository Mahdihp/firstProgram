package mordad_5.form;

import tamrin_5.dao.StudentDao;
import tamrin_5.model.Student;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddStudent {
    public JTextField txtFirstName;
    public JTextField txtLastName;
    public JTextField txtDept;
    public JTextField txtTeacherId;
    public JButton saveButton;
    public JPanel studentPanel;

    public AddStudent() {
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StudentDao studentDao=new StudentDao();
                Student student=new Student(txtFirstName.getText(),txtLastName.getText(),txtDept.getText(),Integer.valueOf(txtTeacherId.getText()));
                studentDao.addEntity(student);
            }
        });
    }
}
