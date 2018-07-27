package mordad_5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingApp {

    public JPanel mainPanel;
    private JLabel lbl1;
    private JTextField textField1;
    private JTextField textField2;
    private JButton sumButton;
    private JButton multButton;
    private JButton minesButton;
    private JButton divButton;
    private JLabel lblReult;

    public SwingApp() {
        sumButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.valueOf(textField1.getText());
                int num2 = Integer.valueOf(textField2.getText());
                lblReult.setText(num1 + num2 + "");
            }
        });
        minesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.valueOf(textField1.getText());
                int num2 = Integer.valueOf(textField2.getText());
                lblReult.setText(num1 - num2 + "");
            }
        });
        multButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.valueOf(textField1.getText());
                int num2 = Integer.valueOf(textField2.getText());
                lblReult.setText(num1 / num2 + "");
            }
        });
        divButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.valueOf(textField1.getText());
                int num2 = Integer.valueOf(textField2.getText());
                lblReult.setText(num1 * num2 + "");
            }
        });
    }

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Java calculator");
        jFrame.setSize(new Dimension(300, 100));

        jFrame.setContentPane(new SwingApp().mainPanel);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.pack();
        jFrame.setVisible(true);

    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

}
