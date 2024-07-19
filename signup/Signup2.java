package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup2 extends JFrame implements ActionListener {
    JComboBox comboBox,comboBox2,comboBox3,comboBox4,comboBox5;
    JTextField textPan,textAadhar;
    JRadioButton r1,r2, e1,e2;
    JButton next;
    String formno;
    Signup2(String formno){
        super("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(45,23,100,100);
        add(image);

        this.formno = formno;

        JLabel l1 = new JLabel("Page 2");
        l1.setFont(new Font("Arial", Font.BOLD,22));
        l1.setBounds(380,70,600,30);
        add(l1);

        JLabel l2 = new JLabel("Additional Details");
        l2.setFont(new Font("Arial", Font.BOLD,22));
        l2.setBounds(330,90,600,40);
        add(l2);

        JLabel l3 = new JLabel("Religion :");
        l3.setFont(new Font("Arial", Font.BOLD,18));
        l3.setBounds(125,190,100,30);
        add(l3);

        String religion[] = {"Hindu","Muslim","Sikh", "Christian", "Other"};
        comboBox = new JComboBox(religion);
        comboBox.setBackground(new Color(252,208,76));
        comboBox.setFont(new Font("Arial",Font.BOLD,14));
        comboBox.setBounds(325,190,320,30);
        add(comboBox);

        JLabel l4 = new JLabel("Category : ");
        l4.setFont(new Font("Arial", Font.BOLD,18));
        l4.setBounds(125,240,100,30);
        add(l4);

        String Category [] = {"General","OBC","SC", "ST", "Other"};
        comboBox2 = new JComboBox(Category);
        comboBox2.setBackground(new Color(252,208,76));
        comboBox2.setFont(new Font("Arial",Font.BOLD,14));
        comboBox2.setBounds(325,240,320,30);
        add(comboBox2);

        JLabel l5 = new JLabel("Income : ");
        l5.setFont(new Font("Arial", Font.BOLD,18));
        l5.setBounds(125,340,100,30);
        add(l5);

        String income [] = {"Null","<1,50,000","<2,50,000", "5,00,000", "Up to 10,00,000","Above 10,00,000"};
        comboBox3 = new JComboBox(income);
        comboBox3.setBackground(new Color(252,208,76));
        comboBox3.setFont(new Font("Arial",Font.BOLD,14));
        comboBox3.setBounds(325,340,320,30);
        add(comboBox3);

        JLabel l6 = new JLabel("Educational : ");
        l6.setFont(new Font("Arial", Font.BOLD,18));
        l6.setBounds(125,290,150,30);
        add(l6);

        String educational [] = {"Non-Graduate","Graduate","Post-Graduate", "Doctorate", "Others"};
        comboBox4 = new JComboBox(educational);
        comboBox4.setBackground(new Color(252,208,76));
        comboBox4.setFont(new Font("Arial",Font.BOLD,14));
        comboBox4.setBounds(325,290,320,30);
        add(comboBox4);


        JLabel l7 = new JLabel("Occupation : ");
        l7.setFont(new Font("Arial", Font.BOLD,18));
        l7.setBounds(125,390,150,30);
        add(l7);

        String Occupation [] = {"Salaried","Self-Employed","Business", "Student", "Retired", "Other"};
        comboBox5 = new JComboBox(Occupation);
        comboBox5.setBackground(new Color(252,208,76));
        comboBox5.setFont(new Font("Arial",Font.BOLD,14));
        comboBox5.setBounds(325,390,320,30);
        add(comboBox5);

        JLabel l8 = new JLabel("PAN Number : ");
        l8.setFont(new Font("Arial", Font.BOLD,18));
        l8.setBounds(125,440,150,30);
        add(l8);

        textPan = new JTextField();
        textPan.setFont(new Font("Arial", Font.BOLD,18));
        textPan.setBounds(325,440,320,30);
        add(textPan);

        JLabel l9 = new JLabel("Aadhaar Number : ");
        l9.setFont(new Font("Arial", Font.BOLD,18));
        l9.setBounds(125,490,180,30);
        add(l9);

        textAadhar = new JTextField();
        textAadhar.setFont(new Font("Arial", Font.BOLD,18));
        textAadhar.setBounds(325,490,320,30);
        add(textAadhar);


        JLabel l10 = new JLabel("Senior Citizen : ");
        l10.setFont(new Font("Arial", Font.BOLD,18));
        l10.setBounds(125,540,180,30);
        add(l10);

        r1 = new JRadioButton("Yes");
        r1.setFont(new Font("Arial", Font.BOLD,14));
        r1.setBackground(new Color(252,208,76));
        r1.setBounds(325,540,100,30);
        add(r1);
        r2 = new JRadioButton("No");
        r2.setFont(new Font("Arial", Font.BOLD,14));
        r2.setBackground(new Color(252,208,76));
        r2.setBounds(435,540,100,30);
        add(r2);

        JLabel l11 = new JLabel("Existing Account : ");
        l11.setFont(new Font("Arial", Font.BOLD,18));
        l11.setBounds(125,590,180,30);
        add(l11);

        e1 = new JRadioButton("Yes");
        e1.setFont(new Font("Arial", Font.BOLD,14));
        e1.setBackground(new Color(252,208,76));
        e1.setBounds(325,590,100,30);
        add(e1);
        e2 = new JRadioButton("No");
        e2.setFont(new Font("Arial", Font.BOLD,14));
        e2.setBackground(new Color(252,208,76));
        e2.setBounds(435,590,100,30);
        add(e2);

        JLabel l12 = new JLabel("Form No : ");
        l12.setFont(new Font("Arial", Font.BOLD,14));
        l12.setBounds(700,10,100,30);
        add(l12);

        JLabel l13 = new JLabel(formno);
        l13.setFont(new Font("Arial", Font.BOLD,14));
        l13.setBounds(760,10,60,30);
        add(l13);

        next = new JButton("Next");
        next.setFont(new Font("Arial",Font.BOLD,14));
        next.setBackground(Color.WHITE);
        next.setForeground(Color.BLACK);
        next.setBounds(620,710,100,30);
        next.addActionListener(this);
        add(next);


        setLayout(null);
        setSize(850,800);
        setLocation(360,40);
        getContentPane().setBackground(new Color(252, 208, 76));
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String rel = (String) comboBox.getSelectedItem();
        String cate = (String) comboBox2.getSelectedItem();
        String inc = (String) comboBox3.getSelectedItem();
        String edu = (String) comboBox4.getSelectedItem();
        String occ = (String) comboBox5.getSelectedItem();

        String pan = textPan.getText();
        String addhar = textAadhar.getText();

        String scitizen = " ";
        if ((r1.isSelected())){
            scitizen = "Yes";
        } else if (r2.isSelected()) {
            scitizen ="No";
        }
        String eAccount = " ";
        if ((r1.isSelected())){
            eAccount = "Yes";
        } else if (r2.isSelected()) {
            eAccount ="No";
        }

        try{
            if (textPan.getText().equals("") || textAadhar.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Fill all the fields");
            }else {
                Connn c = new Connn();
                String q = "insert into Signuptwo values('"+formno+"', '"+rel+"', '"+cate+"','"+inc+"','"+edu+"','"+occ+"','"+pan+"','"+addhar+"','"+scitizen+"','"+eAccount+"')";
                c.statement.executeUpdate(q);
                new Signup3(formno);
                setVisible(false);
            }


        }catch (Exception E){
            E.printStackTrace();
        }


    }

    public static void main(String[] args) {
        new Signup2("");
    }
}
