package petrecordsystem;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PetRecordSystem {

    private JTextField meowTF;
    private JTextField nameTF;
    JTextField meowAgeTF;

    public PetRecordSystem() {
        JFrame pet = new JFrame();
        pet.setLayout(null);
        pet.setBounds(200, 100, 900, 600);
        pet.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Pet Record System");
        label.setBounds(300, 20, 300, 40);
        Font font = new Font("Josefin sans", Font.BOLD, 30);
        label.setFont(font);
        pet.add(label);

        JLabel meow = new JLabel("Cat Info");
        meow.setBounds(80, 70, 100, 20);
        pet.add(meow);

        JLabel meowId = new JLabel("Pet Id");
        meowId.setBounds(20, 100, 100, 20);
        pet.add(meowId);

        meowTF = new JTextField();
        meowTF.setBounds(80, 100, 100, 20);
        pet.add(meowTF);

        JLabel meowName = new JLabel("Name");
        meowName.setBounds(20, 140, 100, 20);
        pet.add(meowName);

        nameTF = new JTextField();
        nameTF.setBounds(80, 140, 100, 20);
        pet.add(nameTF);

        JLabel meowAge = new JLabel("Age");
        meowAge.setBounds(20, 180, 100, 20);
        pet.add(meowAge);

        meowAgeTF = new JTextField();
        meowAgeTF.setBounds(80, 180, 100, 20);
        pet.add(meowAgeTF);

        JLabel detail = new JLabel("Owner");
        detail.setBounds(20, 220, 100, 20);
        pet.add(detail);

        JTextField detailTF = new JTextField();
        detailTF.setBounds(80, 220, 100, 20);
        pet.add(detailTF);

        JButton button1 = new JButton("Add Cat");
        button1.setBounds(60, 260, 120, 30);
        pet.add(button1);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addCat();
            }
        });

        JLabel bhau = new JLabel("Dog Info");
        bhau.setBounds(400, 70, 100, 20);
        pet.add(bhau);

        JLabel bhauId = new JLabel("Pet Id: ");
        bhauId.setBounds(300, 100, 100, 20);
        pet.add(bhauId);

        JTextField bhauTF = new JTextField();
        bhauTF.setBounds(420, 100, 100, 20);
        pet.add(bhauTF);

        JLabel bhauName = new JLabel("Name: ");
        bhauName.setBounds(300, 140, 100, 20);
        pet.add(bhauName);

        JTextField bhauNameTF = new JTextField();
        bhauNameTF.setBounds(420, 140, 100, 20);
        pet.add(bhauNameTF);

        JLabel shepherd = new JLabel("Breed: ");
        shepherd.setBounds(300, 180, 100, 20);
        pet.add(shepherd);

        JTextField shepherdTF = new JTextField();
        shepherdTF.setBounds(420, 180, 100, 20);
        pet.add(shepherdTF);

        JLabel holder = new JLabel("Owner: ");
        holder.setBounds(300, 220, 100, 20);
        pet.add(holder);

        JTextField holderTF = new JTextField();
        holderTF.setBounds(420, 220, 100, 20);
        pet.add(holderTF);

        JLabel date = new JLabel("Vaccination Date: ");
        date.setBounds(300, 260, 120, 20);
        pet.add(date);

        JTextField dateTF = new JTextField();
        dateTF.setBounds(420, 260, 100, 20);
        pet.add(dateTF);

        JButton click = new JButton("Add Dog");
        click.setBounds(350, 300, 120, 30);
        pet.add(click);

        JLabel domestic = new JLabel("Pet Id:");
        domestic.setBounds(120, 400, 100, 20);
        pet.add(domestic);

        JTextField domesticTF = new JTextField();
        domesticTF.setBounds(200, 400, 100, 20);
        pet.add(domesticTF);

        JButton watch = new JButton("Display Info");
        watch.setBounds(60, 450, 120, 30);
        pet.add(watch);

        JButton listen = new JButton("Make Sound");
        listen.setBounds(250, 450, 120, 30);
        pet.add(listen);

        JLabel extraPet = new JLabel("Pet Id: ");
        extraPet.setBounds(600, 160, 100, 20);
        pet.add(extraPet);

        JTextField extraPetTF = new JTextField();
        extraPetTF.setBounds(750, 160, 100, 20);
        pet.add(extraPetTF);

        JLabel Date1 = new JLabel("Vaccination Date: ");
        Date1.setBounds(600, 200, 200, 20);
        pet.add(Date1);

        JTextField newdateTF = new JTextField();
        newdateTF.setBounds(750, 200, 100, 20);
        pet.add(newdateTF);

        JButton enter = new JButton("Vaccinate Dog");
        enter.setBounds(730, 250, 120, 30);
        pet.add(enter);

        pet.setVisible(true);

    }

    public void addCat()
    {
        String petId = getTextFromTextField(meowTF);
        String catName =getTextFromTextField(nameTF);
        String catAge = getTextFromTextField(meowAgeTF);
    }
    public String getTextFromTextField(JTextField textField)
    {
        return textField.getText().trim();
    }
    public static void main(String[] args) {
        new PetRecordSystem();
    }
}