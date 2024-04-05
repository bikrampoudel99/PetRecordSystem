package week18.tutorial;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GUIDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Login");

        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setLocation(300,150);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setLayout(null);

        JLabel userLbl = new JLabel();
        userLbl.setText("User");
        // userLbl.setSize(30,20);
        // userLbl.setLocation(20,20);

        userLbl.setBounds(20,20,30,20);
        frame.add(userLbl);


        JTextField userTF = new JTextField();
        userTF.setSize(80,20);
        userTF.setLocation(70,20);
        frame.add(userTF);


        JButton loginBtn = new JButton("Login");
        loginBtn.setBounds(60,100,80,30);
        loginBtn.setBackground(Color.CYAN);
        frame.add(loginBtn);








        frame.setVisible(true);
    }
}
