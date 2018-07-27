package mordad_5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm {
    public JTextField textField1;
    public JTextField textField2;
    public JButton loginButton;
    public JPanel loginPanel;
    public static JFrame loginFrame;
    public LoginForm() {
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                if (textField1.getText().equals("ali") && textField2.getText().equals("110")) {
                    JFrame jFrame = new JFrame("Java calculator");
                    jFrame.setSize(new Dimension(300, 100));

                    jFrame.setContentPane(new SwingApp().mainPanel);
//                    jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    jFrame.pack();
                    jFrame.setVisible(true);

                    loginFrame.dispose();

                }


            }
        });
    }

    public static void main(String[] args) {
        loginFrame = new JFrame("Java calculator");
        loginFrame.setSize(new Dimension(300, 100));

        loginFrame.setContentPane(new LoginForm().loginPanel);
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginFrame.pack();
        loginFrame.setVisible(true);

    }

}
