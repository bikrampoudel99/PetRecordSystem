package week20.workshop;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Assignment implements ActionListener{

    JFrame frame;
     JTextField nameText;
     JComboBox<String> year;
     JRadioButton male;
    JRadioButton female;



    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getActionCommand().equals("Submit"))
        {
            String name =  nameText.getText();
            String selectedYear = year.getSelectedItem().toString();
            String gender;
            if(male.isSelected())
            {
                gender="Male";
            }
            else
            {
                gender = "Female";
            }

            String message = name+" "+selectedYear+" "+gender;
            JOptionPane.showMessageDialog(frame,message,"Info",JOptionPane.ERROR_MESSAGE);
        }
        else if(e.getActionCommand().equals("Reset"))
        {
            nameText.setText("");
            year.setSelectedIndex(0);
            male.setSelected(true);
        }




    }

    public Assignment(){
        this.frame = new JFrame("Student register form");
        frame.setSize(650,650);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);


        JPanel panel = new JPanel();
        panel.setBounds(20, 20, 545, 520);
        panel.setLayout(null);
        //panel.setBackground(Color.GRAY);
        frame.add(panel);

        JLabel registerText = new JLabel("Register a new Student");
        registerText.setBounds(60, 30, 250, 25);
        registerText.setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(registerText);


        JLabel name = new JLabel("Name");
        name.setBounds(60, 77, 40, 10);
        panel.add(name);


        this.nameText = new JTextField();
        nameText.setBounds(140, 70, 170, 25);
        panel.add(nameText);

        JLabel DOB = new JLabel("DOB");
        DOB.setBounds(60, 120, 40, 10);
        panel.add(DOB);

        String[] years = new String[100];
        for (int i = 0; i < 100; i++)
        {
            years[i] = String.valueOf(1920 + i);
        }

        year = new JComboBox<String>(years);
        year.setBounds(140, 115, 100, 25);
        panel.add(year);

        JComboBox<String> month = new JComboBox<String>();
        month.addItem("JAN");
        month.addItem("FEB");
        month.addItem("MAR");
        month.addItem("APR");
        month.addItem("MAY");
        month.addItem("JUN");
        month.addItem("JUL");
        month.addItem("AUG");
        month.addItem("SEP");
        month.addItem("OCT");
        month.addItem("NOV");
        month.addItem("DEC");
        month.setBounds(228, 115, 100, 25);
        panel.add(month);

        String[] days = new String[31];
        for (int a = 0; a < 31; a++)
        {
            days[a] = String.valueOf(a + 1);
        }

        JComboBox<String> day = new JComboBox<String>(days);
        day.setBounds(297, 115, 100, 25);
        panel.add(day);

        JLabel gender = new JLabel("Gender");
        gender.setBounds(60, 160, 50, 10);
        panel.add(gender);

        male = new JRadioButton("male");
        panel.add(male);
        male.setBounds(140, 160, 70, 25);
        male.setSelected(true);

        female = new JRadioButton("female");
        female.setBounds(228, 160, 80, 25);
        panel.add(female);

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);

        JLabel address = new JLabel("Address");
        address.setBounds(60, 210, 50, 10);
        panel.add(address);

        JTextArea addressTextArea = new JTextArea();
        addressTextArea.setBounds(143, 210, 190, 53);
        addressTextArea.setLineWrap(true);
        addressTextArea.setWrapStyleWord(true);
        panel.add(addressTextArea);

        JLabel MobileNum = new JLabel("Mobile No");
        MobileNum.setBounds(60,287,70,10);
        panel.add(MobileNum);

        JTextField  mobileField = new JTextField();
        mobileField.setBounds(153, 283, 170, 25);
        panel.add(mobileField);

        JLabel password = new JLabel("Password");
        password.setBounds(60,329,70,10);
        panel.add(password);

        JTextField passworField = new JTextField();
        passworField.setBounds(153, 327, 170, 25);
        panel.add(passworField);

        JLabel rePassword = new JLabel("Re-Password");
        rePassword.setBounds(60,375,90,10);
        panel.add(rePassword);

        JTextField rePassworField = new JTextField();
        rePassworField.setBounds(153, 370, 170, 25);
        panel.add(rePassworField);

        JLabel courses = new JLabel("Courses");
        courses.setBounds(60, 415, 90, 10);
        panel.add(courses);

        JComboBox<String> courTextField = new JComboBox<String>();
        courTextField.addItem("BSC hons Computing");
        courTextField.addItem("BBA");
        courTextField.setBounds(153, 410, 170, 25);
        panel.add(courTextField);

        JLabel college = new JLabel("College");
        college.setBounds(60, 443, 90, 20);
        panel.add(college);

        JComboBox<String> collegeBox = new JComboBox<String>();
        collegeBox.addItem("Itahari International Collage");
        collegeBox.setBounds(153, 448, 190, 25);
        panel.add(collegeBox);

        JLabel semester = new JLabel("semester");
        semester.setBounds(60, 479, 90, 20);
        panel.add(semester);

        JComboBox<String> semesterBox = new JComboBox<String>();
        semesterBox.addItem("1");
        semesterBox.setBounds(153, 482, 100, 25);
        panel.add(semesterBox);

        JButton submitButton = new JButton();
        submitButton.setText("Submit");
        submitButton.setBounds(153, 525, 110, 25);
        panel.add(submitButton);
        submitButton.addActionListener(this);

        // submitButton.addActionListener(
        //     new ActionListener()
        //     {
        //         public void actionPerformed(ActionEvent e)
        //         {
        //             System.out.println("Hello");
        //         }
        //     }
        // );


        JButton resetButton = new JButton();
        resetButton.setText("Reset");
        resetButton.setBounds(285, 525, 110, 25);
        resetButton.addActionListener(this);
        panel.add(resetButton);

        frame.setVisible(true);



    }
    public static void main(String[] args) {
        new Assignment();
    }

}