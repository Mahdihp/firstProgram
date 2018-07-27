package mordad_5.form;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainForm {
    public JButton addTeacherButton;
    public JButton button2;
    public JButton addStudentButton;
    public JPanel mainPanel;
    public JButton teacherListButton;
    public static JFrame mainFrame;


    public MainForm() {
        addTeacherButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame jFrame = new JFrame("Java calculator");
                jFrame.setSize(new Dimension(300, 100));

                jFrame.setContentPane(new AddTeacher().addPanel);
                jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                jFrame.pack();
                jFrame.setVisible(true);

            }
        });
        addStudentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame jFrame = new JFrame("Java calculator");
                jFrame.setSize(new Dimension(300, 100));

                jFrame.setContentPane(new AddStudent().studentPanel);
                jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                jFrame.pack();
                jFrame.setVisible(true);
            }
        });
        teacherListButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame jFrame = new JFrame("Java calculator");
                jFrame.setSize(new Dimension(300, 100));

                jFrame.setContentPane(new TeacherList().teacherListPanel);
                jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                jFrame.pack();
                jFrame.setVisible(true);
            }
        });
    }
}
