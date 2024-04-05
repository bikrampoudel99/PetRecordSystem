package week21.workshop;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Calculator implements ActionListener {
    JFrame frame;
    JTextField number;
    JTextField numberTF;
    JTextField resultTF;

    public Calculator() {
        this.frame = new JFrame("CASIO");
        frame.setSize(500, 400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setResizable(false);

        JLabel number1 = new JLabel("Number 1:");
        number1.setBounds(40, 50, 120, 25);
        frame.add(number1);

        this.number = new JTextField();
        number.setBounds(120, 50, 120, 25);
        frame.add(number);

        JLabel number2 = new JLabel("Number 2:");
        number2.setBounds(40, 110, 120, 25);
        frame.add(number2);

        this.numberTF = new JTextField();
        numberTF.setBounds(120, 110, 120, 25);
        frame.add(numberTF);

        JLabel result = new JLabel("Result:");
        result.setBounds(40, 180, 120, 25);
        frame.add(result);

        this.resultTF = new JTextField();
        resultTF.setBounds(120, 180, 120, 25);
        resultTF.setEditable(false);
        frame.add(resultTF);

        JButton add = new JButton();
        add.setText("+");
        add.setBounds(40, 240, 50, 30);
        frame.add(add);

        add.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                try {
                    int number1 = getNumberFromTextField(number);
                    int number2 = getNumberFromTextField(numberTF);
                    int sum = number1 + number2;
                    resultTF.setText(String.valueOf(sum));
                } catch (IllegalArgumentException ex) {
                    JOptionPane.showMessageDialog(frame,ex.getMessage(),"EROR",JOptionPane.ERROR_MESSAGE);
                }



            }
        });

        JButton subtract = new JButton();
        subtract.setText("-");
        subtract.setBounds(120, 240, 50, 30);
        frame.add(subtract);

        subtract.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int number1 = Integer.parseInt(number.getText());
                int number2 = Integer.parseInt(numberTF.getText());
                int difference = number1 - number2;
                resultTF.setText(String.valueOf(difference));

            }
        });

        JButton empty = new JButton();
        empty.setText("C");
        empty.setBounds(200, 240, 50, 30);
        frame.add(empty);

        empty.addActionListener(this);

        frame.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equalsIgnoreCase("c")) {
            number.setText("");
            numberTF.setText("");
            resultTF.setText("");
        }
    }

    public int getNumberFromTextField(JTextField textField)
    {
        String value = textField.getText();
        if(value.isEmpty())
        {
            throw new IllegalArgumentException("Fill all the fields");
        }
        int number = Integer.parseInt(value);
        return number;
    }

    public static void main(String[] args)
    {
        new Calculator();
    }
}