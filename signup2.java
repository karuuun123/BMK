package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class signup2 extends JFrame implements ActionListener {

    JComboBox comboBox,comboBox1,comboBox2,comboBox3,comboBox4;
    JTextField textPan ,textAadhar;
    JRadioButton r1,r2,e1,e2;
    JButton next;
    String formno;
    signup2(String formno) {
        super("APPLICATION FORM");

        ImageIcon icon1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image icon2 = icon1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon icon3 = new ImageIcon(icon2);
        JLabel image = new JLabel(icon3);
        image.setBounds(150,5,100,100);
        add(image);

        this.formno = formno;

        JLabel l1 = new JLabel("Page 2 :");
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        l1.setBounds(300,30,600,40);
        add(l1);

        JLabel l2 = new JLabel("Additional details");
        l2.setFont(new Font("Raleway",Font.BOLD,22));
        l2.setBounds(300,60,600,40);
        add(l2);

        JLabel l3 = new JLabel("Religion : ");
        l3.setFont(new Font("Raleway",Font.BOLD,18));
        l3.setBounds(100,120,100,30);
        add(l3);

        String religion[] = {"Hindu","Muslim","Sikh","Christain","Others"};
        comboBox = new JComboBox(religion);
        comboBox.setBackground(Color.orange);
        comboBox.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox.setBounds(350,120,320,30);
        add(comboBox);

        JLabel l4 = new JLabel("Category :");
        l4.setFont(new Font("Raleway",Font.BOLD,18));
        l4.setBounds(100,170,100,30);
        add(l4);

        String Category[] = {"General","OBC","SC","ST","Others"};
        comboBox1 = new JComboBox(Category);
        comboBox1.setBackground(Color.orange);
        comboBox1.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox1.setBounds(350,170,320,30);
        add(comboBox1);

        JLabel l5 = new JLabel("Income :");
        l5.setFont(new Font("Raleway",Font.BOLD,18));
        l5.setBounds(100,220,100,30);
        add(l5);

        String income[] = {"Null","<1,50,000","<2,50,000","5,00,00","Upto 10,00,000","Above 10,00,000"};
        comboBox2 = new JComboBox(income);
        comboBox2.setBackground(Color.orange);
        comboBox2.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox2.setBounds(350,220,320,30);
        add(comboBox2);

        JLabel l6 = new JLabel("Educational :");
        l6.setFont(new Font("Raleway",Font.BOLD,18));
        l6.setBounds(100,270,150,30);
        add(l6);

        String educational[] = {"Non-Graduate","Graduate","Post-Graduate","Doctrate","Others"};
        comboBox3 = new JComboBox(educational);
        comboBox3.setBackground(Color.orange);
        comboBox3.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox3.setBounds(350,270,320,30);
        add(comboBox3);

        JLabel l7 = new JLabel("Occupation");
        l7.setFont(new Font("Raleway",Font.BOLD,18));
        l7.setBounds(100,340,150,30);
        add(l7);

        String occupation[] = {"Salaried","Self-Employer","Business","Student","Retired","Others"};
        comboBox4 = new JComboBox(occupation);
        comboBox4.setBackground(Color.orange);
        comboBox4.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox4.setBounds(350,340,320,30);
        add(comboBox4);

        JLabel l8 = new JLabel("PAN Number :");
        l8.setFont(new Font("Raleway",Font.BOLD,18));
        l8.setBounds(100,390,150,30);
        add(l8);

        textPan = new JTextField();
        textPan.setFont(new Font("Raleway",Font.BOLD,14));
        textPan.setBounds(350,390,320,30);
        add(textPan);

        JLabel l9 = new JLabel("Aadhar Number :");
        l9.setFont(new Font("Raleway",Font.BOLD,18));
        l9.setBounds(100,440,180,30);
        add(l9);

        textAadhar = new JTextField();
        textAadhar.setFont(new Font("Raleway",Font.BOLD,14));
        textAadhar.setBounds(350,440,320,30);
        add(textAadhar);

        JLabel l10 = new JLabel("Senior Citizen :");
        l10.setFont(new Font("Raleway",Font.BOLD,18));
        l10.setBounds(100,490,180,30);
        add(l10);

        r1 = new JRadioButton("Yes");
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        r1.setBounds(350,490,100,30);
        add(r1);

        r2 = new JRadioButton("No");
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        r2.setBounds(460,490,100,30);
        add(r2);

        JLabel l11 = new JLabel("Existing Account :");
        l11.setFont(new Font("Raleway",Font.BOLD,18));
        l11.setBounds(100,540,180,30);
        add(l11);

        e1 = new JRadioButton("Yes");
        e1.setFont(new Font("Raleway",Font.BOLD,14));
        e1.setBounds(350,540,100,30);
        add(e1);

        e2 = new JRadioButton("No");
        e2.setFont(new Font("Raleway",Font.BOLD,14));
        e2.setBounds(460,540,100,30);
        add(e2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(e1);
        buttonGroup.add(e2);


        JLabel l12 = new JLabel("Form No : ");
        l12.setFont(new Font("Raleway",Font.BOLD,14));
        l12.setBounds(690,10,100,30);
        add(l12);

        JLabel l13 = new JLabel(formno);
        l13.setFont(new Font("Raleway",Font.BOLD,18));
        l13.setBounds(760,10,60,30);
        add(l13);

        next = new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,18));
        next.setForeground(Color.black);
        next.setBounds(570,640,100,30);
        next.addActionListener(this);
        add(next);

        setLayout(null);
        setSize(850,750);
        setLocation(450,80);
       getContentPane().setBackground(Color.orange);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String rel =(String) comboBox.getSelectedItem();
        String cate =(String) comboBox1.getSelectedItem();
        String income =(String) comboBox2.getSelectedItem();
        String education =(String) comboBox3.getSelectedItem();
        String occ =(String) comboBox4.getSelectedItem();

        String pan = textPan.getText();
        String aadhar = textAadhar.getText();

        String SeniorCitizen = null;
        if(r1.isSelected()){
            SeniorCitizen = "Yes";
        } else if(r2.isSelected()){
            SeniorCitizen = "No";
        }

        String eAccount = null;
        if(e1.isSelected()){
            eAccount= "Yes";
        } else if(e2.isSelected()){
            eAccount = "No";
        }
        try {
            if(textAadhar.getText().equals("") || textPan.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Please Fill All Fields");
            }else {
                Con c1 = new Con();
                String q = "insert into signuptwo values('"+formno+"','"+rel+"','"+cate+"','"+income+"','"+education+"','"+occ+"','"+pan+"','"+aadhar+"','"+SeniorCitizen+"','"+eAccount+"')";
                c1.statement.executeUpdate(q);
                new signup3(formno);
                setVisible(false);
            }
        }
        catch(Exception E) {
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new signup2("");
    }
}
