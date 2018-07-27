package mordad_5;

import com.sun.deploy.uitoolkit.impl.fx.ui.FXMessageDialog;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class GUITest {

    static JButton jButton1;
    static TextField txtNum1;
    static TextField txtNum2;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Salam Azizam");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(new Dimension(300, 100));

        jButton1 = new JButton("Sum");
        txtNum1 = new TextField();
        txtNum2 = new TextField();


        GridLayout gridBagLayout = new GridLayout(1, 5);

        jFrame.setLayout(gridBagLayout);
        jButton1.setSize(new Dimension(20, 30));
        jButton1.addActionListener(new ClickEvent());
        jFrame.add(jButton1);
        jFrame.add(txtNum1);
        jFrame.add(txtNum2);
       // jFrame.setVisible(true);
        SwingApp swingApp=new SwingApp();

    }

    public static class ClickEvent implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int num1 = Integer.valueOf(txtNum1.getText());
            int num2 = Integer.valueOf(txtNum2.getText());
            JOptionPane.showMessageDialog(null,  num1 + num2 );
        }
    }
}
