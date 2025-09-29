package bank.management.system;
import com.toedter.calendar.JDateChooser;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup extends JFrame implements ActionListener {

    JRadioButton radioButton1,radioButton2,m1,m2,m3;
    JButton next;
    JTextField textName, textFName , textEmail,textADD,textCity,textPin,textState;
    JDateChooser dateChooser;
    Random ran = new Random();
    long first4 =(ran.nextLong() % 9000L) + 1000L;
    String first = " " + Math.abs(first4);

    Signup(){

        super("APPLICATION FORM");
        ImageIcon icon1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image icon2 = icon1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon icon3 = new ImageIcon(icon2);
        JLabel image = new JLabel(icon3);
        image.setBounds(25,10,100,100);
        add(image);

        JLabel label1= new JLabel("APPLICATION FORM NO :" + first);
        label1.setBounds(160,20,600,40);
        label1.setFont(new Font("Raleway",Font.BOLD,38));
        add(label1);

        JLabel label2= new JLabel("Page 1");
        label2.setFont(new Font("Ralway",Font.BOLD,22));
        label2.setBounds(330,70,600,30);
        add(label2);

        JLabel label3= new JLabel("Personal Details");
        label3.setFont(new Font("Raleway",Font.BOLD,22));
        label3.setBounds(290,100,600,30);
        add(label3);

        JLabel labelName = new JLabel("Name :");
        labelName.setFont(new Font("Raleway",Font.BOLD,20));
        labelName.setBounds(100,190,100,30);
        add(labelName);

        textName = new JTextField();
        textName.setFont(new Font("Raleway",Font.BOLD,14));
        textName.setBounds(300,190,400,30);
        add(textName);

        JLabel labelFName = new JLabel("Father's Name :");
        labelFName.setFont(new Font("Raleway",Font.BOLD,20));
        labelFName.setBounds(100,240,200,30);
        add(labelFName);

        textFName = new JTextField();
        textFName.setFont(new Font("Raleway",Font.BOLD,14));
        textFName.setBounds(300,240,400,30);
        add(textFName);

        JLabel DOB = new JLabel("Date Of Birth :");
        DOB.setFont(new Font("Raleway",Font.BOLD,20));
        DOB.setBounds(100,340,200,30);
        add(DOB);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(300,340,400,30);
        add(dateChooser);

        JLabel labelGender = new JLabel("Gender :");
        labelGender.setFont(new Font("Raleway",Font.BOLD,20));
        labelGender.setBounds(100,290,200,30);
        add(labelGender);

        radioButton1 = new JRadioButton("Male");
        radioButton1.setFont(new Font("Raleway",Font.BOLD,14));
        radioButton1.setBounds(300,290,90,30);
        add(radioButton1);

        radioButton2 = new JRadioButton("Female");
        radioButton2.setFont(new Font("Raleway",Font.BOLD,14));
        radioButton2.setBounds(450,290,90,30);
        add(radioButton2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(radioButton1);
        buttonGroup.add(radioButton2);

        JLabel labelEmail = new JLabel("Email address :");
        labelEmail.setFont(new Font("Raleway",Font.BOLD,20));
        labelEmail.setBounds(100,390,200,30);
        add(labelEmail);

        textEmail = new JTextField();
        textEmail.setFont(new Font("Raleway",Font.BOLD,14));
        textEmail.setBounds(300,390,400,30);
        add(textEmail);

        JLabel labelMs = new JLabel("Marital Status :");
        labelMs.setFont(new Font("Raleway",Font.BOLD,20));
        labelMs.setBounds(100,440,200,30);
        add(labelMs);

        m1 = new JRadioButton("Married");
        m1.setFont(new Font("Raleway",Font.BOLD,14));
        m1.setBounds(300,440,100,30);
        add(m1);

        m2 = new JRadioButton("Unmarried");
        m2.setFont(new Font("Raleway",Font.BOLD,14));
        m2.setBounds(430,440,150,30);
        add(m2);

        m3 = new JRadioButton("Other");
        m3.setFont(new Font("Raleway",Font.BOLD,14));
        m3.setBounds(580,440,100,30);
        add(m3);

       ButtonGroup buttonGroup2 = new ButtonGroup();
       buttonGroup2.add(m1);
       buttonGroup2.add(m2);
       buttonGroup2.add(m3);


        JLabel labelADD = new JLabel("Address :");
        labelADD.setFont(new Font("Raleway",Font.BOLD,20));
        labelADD.setBounds(100,490,200,30);
        add(labelADD);

        textADD = new JTextField();
        textADD.setFont(new Font("Raleway",Font.BOLD,14));
        textADD.setBounds(300,490,400,30);
        add(textADD);

        JLabel labelCity = new JLabel("City :");
        labelCity.setFont(new Font("Raleway",Font.BOLD,20));
        labelCity.setBounds(100,540,200,30);
        add(labelCity);

        textCity = new JTextField();
        textCity.setFont(new Font("Raleway",Font.BOLD,14));
        textCity.setBounds(300,540,400,30);
        add(textCity);

        JLabel labelPin = new JLabel("Pin Code :");
        labelPin.setFont(new Font("Raleway",Font.BOLD,20));
        labelPin.setBounds(100,590,200,30);
        add(labelPin);

        textPin = new JTextField();
        textPin.setFont(new Font("Raleway",Font.BOLD,14));
        textPin.setBounds(300,590,400,30);
        add(textPin);

        JLabel labelState = new JLabel("State :");
        labelState.setFont(new Font("Raleway",Font.BOLD,20));
        labelState.setBounds(100,640,200,30);
        add(labelState);

        textState = new JTextField();
        textState.setFont(new Font("Raleway",Font.BOLD,14));
        textState.setBounds(300,640,400,30);
        add(textState);

        next = new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setForeground(Color.black);
        next.setBounds(620,710,80,30);
        next.addActionListener(this);
        add(next);


        getContentPane().setBackground(new Color(222,255,228));
        setLayout(null);
        setSize(850,800);
        setLocation(360,60);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String formno= first;
        String name=textName.getText();
        String fathername = textFName.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(radioButton1.isSelected()){
            gender = "Male";
        }
        else if(radioButton2.isSelected()){
            gender = "Female";
        }
        String email=textEmail.getText();
        String martial = null;
        if (m1.isSelected()) {
            martial = "Married";
        }
        else if (m2.isSelected()) {
            martial = "Unmarried";
        }
        else if (m3.isSelected()) {
            martial = "Other";
        }
        String address = textADD.getText();
        String city = textCity.getText();
        String pincode = textPin.getText();
        String state = textState.getText();

        try {
            if(textName.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Please enter your name");

            }else {
                Con con1 = new Con();
                String q = "insert into sign_up values('"+formno+"','"+name+"', '"+fathername+"','"+dob+"','"+gender+"','"+email+"','"+martial+"','"+address+"','"+city+"','"+pincode+"','"+state+"')";
                con1.statement.executeUpdate(q);
                new signup2(formno);
                setVisible(false);
            }

        }
        catch (Exception E) {
            E.printStackTrace();
        }



    }

    public static void main(String[] args) {
        new Signup();
    }
}
