package week19.workshop;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

public class Registration {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500,400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        Font font = new Font("Josefin sans",Font.BOLD,25);

        JLabel title = new JLabel("Registration Form");
        title.setBounds(150,25,300,30);
        title.setFont(font);
        frame.add(title);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(10,100,500,500);
        panel.setBackground(Color.GRAY);
        frame.add(panel);

        // JLabel nameLbl =  new JLabel("Name");
        // panel.add(nameLbl);

        // JTextField nameTF = new JTextField();
        // panel.add(nameTF);

        // JLabel nameLbl2 =  new JLabel("Name");
        // panel.add(nameLbl2);

        // JTextField nameTF2 = new JTextField();
        // panel.add(nameTF2);

        JTextArea textArea = new JTextArea();
        textArea.setBounds(20,100,400,200);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        panel.add(textArea);


        Integer[] days = new Integer[32];
        // for(int i = 1;i<=32;i++)
        // {
        //     days[i]=i;
        // }
        JComboBox<Integer> dayCB = new JComboBox<Integer>(days);
        dayCB.setBounds(10,20,50,20);
        panel.add(dayCB);





        frame.setVisible(true);






    }
}
