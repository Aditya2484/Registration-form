import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
//import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

class Registrationform{
    public static void main(String[] args) {
        Myframe frame=new Myframe();
    }
}
class Myframe extends JFrame{
    JLabel label1,label2,father ,mother;
    JLabel label3,cata,corres,perma,stat,dist,posta,fatno;
    JLabel label4,abc;
    JLabel course;
    JLabel rollno;
    JLabel mobno;
    JLabel aadhar;
    JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17;
    JRadioButton male;
    JRadioButton female;
    JComboBox day;
    JComboBox month,year;
    JComboBox branch;
    JComboBox nums;
    JComboBox nums1;
    JComboBox category;
    JComboBox state;
    JTextArea ta1;
    JCheckBox terms;
    JButton submit;
    JButton cancel;

   Myframe(){
    setTitle("STUDENTS REGISTRATION FORM");
    setSize(800,800);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    Container c=getContentPane();
    Color color=new Color(255,0,0);
      c.setBackground(color.PINK);
    ImageIcon icon =new ImageIcon("krishana.jpg");
    setIconImage(icon.getImage());
     Font font =new Font("ARIAL",Font.BOLD,15);
     Font fonts =new Font("ARIAL",Font.BOLD,20);
    c.setLayout(null);
    label1=new JLabel("NAME -");
    label1.setBounds(20,50,75,30);
    label1.setFont(fonts);
    c.add(label1);
    t1=new JTextField();
    t1.setBounds(170,55,200,20);
    t1.setFont(font);
    c.add(t1);
    // t1.setBackground(Color.red);  
    label3=new JLabel("Gender -");
    label3.setBounds(380,55,100,20);
    label3.setFont(fonts);
    c.add(label3);
    ButtonGroup gen=new ButtonGroup();
    gen.add(male);
    gen.add(female);
    // t3=new JTextField();
    // t3.setBounds(130,100,100,20);
    //  c.add(t3);
    male =new JRadioButton("MALE");
    female= new JRadioButton("FEMALE");
    male.setBounds(490,55,80,20);
    female.setBounds(610,55,100,20);
    male.setSelected(true);
    male.setFont(font);
    female.setFont(font);
    c.add(male);
    c.add(female);
    father=new JLabel("FATHER'S NAME  -");
    father.setBounds(20,80,200,30);
    father.setFont(fonts);
    c.add(father);
    t8=new JTextField();
    t8.setBounds(220,85,400,20);
    t8.setFont(font);
    c.add(t8);
    mother=new JLabel("MOTHER'S NAME -");
    mother.setBounds(20,110,200,30);
    mother.setFont(fonts);
    c.add(mother);
    t9=new JTextField();
    t9.setBounds(220,115,400,20);
    t9.setFont(font);
    c.add(t9);
    cata=new JLabel("CATAGORY  -");
    cata.setBounds(20,140,200,30);
    cata.setFont(fonts);
    c.add(cata);
    String cat[]={"GENERAL","OBC","SC","ST","OTHERS"};
    category=new JComboBox(cat);
    category.setEditable(true);
    category.setBounds(170,145,150,20);
    category.setFont(font);
    c.add(category);
    label4=new JLabel("D.O.B -");
    label4.setBounds(380,145,100,20);
    label4.setFont(fonts);
    c.add(label4);
    String days[]={ "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "10",
            "11", "12", "13", "14", "15",
            "16", "17", "18", "19", "20",
            "21", "22", "23", "24", "25",
            "26", "27", "28", "29", "30",
            "31" };
     String months[]
        = { "Jan", "feb", "Mar", "Apr",
            "May", "Jun", "July", "Aug",
            "Sup", "Oct", "Nov", "Dec" };
     String years[]
        = { "1995", "1996", "1997", "1998",
            "1999", "2000", "2001", "2002",
            "2003", "2004", "2005", "2006",
            "2007", "2008", "2009", "2010",
            "2011", "2012", "2013", "2014",
            "2015", "2016", "2017", "2018",
            "2019" };
    day=new JComboBox(days);
    month=new JComboBox(months);
    year=new JComboBox(years);
    day.setBounds(450,145,80,20);
    day.setEditable(true);
    month.setBounds(550,145,80,20);
    month.setEditable(true);
    year.setBounds(650,145,80,20);
    year.setEditable(true);
    day.setFont(font);
    month.setFont(font);
    year.setFont(font);
    c.add(day);
    c.add(month);
    c.add(year);
    corres=new JLabel("Corresponding Address  -");
    corres.setBounds(20,175,300,30);
    corres.setFont(fonts);
    c.add(corres);
    t10=new JTextField();
    t10.setBounds(280,175,500,20);
    t10.setFont(font);
    c.add(t10);
    perma=new JLabel("Permanent Address         -");
    perma.setBounds(20,210,300,20);
    perma.setFont(fonts);
    c.add(perma);
    t11=new JTextField();
    t11.setBounds(280,210,500,20);
    t11.setFont(font);
    c.add(t11);
    stat=new JLabel("State             -");
    stat.setBounds(20,240,130,20);
    stat.setFont(fonts);
    c.add(stat);
    String s[]={"Andhra Pradesh","Arunachal","Assam","Bihar","Chattisgarh","Delhi",
                "Goa","Gujarat","Harayana","Himachal Pradesh","Jammu Kashmir",
                 "Jharkhand","Karanatak","Kerala","Madhya Pradesh","Maharastra",
                 "Manipur","Meghalaya","Mizoram","Nagaland","Orissa","Punjab",
                 "Rajasthan","Sikkim","Tamil Nadu","Tripura","Uttarakhand",
                 "Uttar Pradesh","West Bengal","A&N Islands"};
    state=new JComboBox(s); 
    state.setEditable(true);
    state.setBounds(170,243,200,20);
    state.setFont(font);
    c.add(state);   
    dist=new JLabel("District       -");
    dist.setBounds(380,243,130,20);
    dist.setFont(fonts);
    c.add(dist);   
    t12=new JTextField();
    t12.setBounds(510,243,270,20);
    t12.setFont(font);
    c.add(t12);
    posta=new JLabel("Postal Code -");
    posta.setBounds(20,275,150,20);
    posta.setFont(fonts);
    c.add(posta);   
    t13=new JTextField();
    t13.setBounds(170,275,200,20);
    t13.setFont(font);
    c.add(t13);
     mobno=new JLabel("Mobile NO. -");
    mobno.setBounds(380,275,130,20);
    mobno.setFont(fonts);
    c.add(mobno);
    String num[]={"+91","+92"};
    nums=new JComboBox(num);
    nums.setEditable(true);
    nums.setBounds(510,275,50,20);
    nums.setFont(font);
    c.add(nums);
    t6=new JTextField();
    t6.setBounds(560,275,220,20);
    t6.setFont(font);
     c.add(t6);
    fatno=new JLabel("Father's M.no. -");
    fatno.setBounds(20,310,150,20);
    fatno.setFont(fonts);
    c.add(fatno);
    String numa[]={"+91","+92"};
    nums1=new JComboBox(numa);
    nums1.setEditable(true);
    nums1.setBounds(180,310,50,20);
    nums1.setFont(font);
    c.add(nums1);
    t14=new JTextField();
    t14.setBounds(230,310,220,20);
    t14.setFont(font);
    c.add(t14);
    label2=new JLabel("EMAIL-ID    -");
    label2.setBounds(20,340,150,20);
    label2.setFont(fonts);
    c.add(label2);
    t2=new JTextField();
    t2.setBounds(180,340,270,20);
    t2.setFont(font);
     c.add(t2);
    rollno=new JLabel("University Roll NO. -");
    rollno.setBounds(20,370,200,20);
    rollno.setFont(fonts);
    c.add(rollno);
    t5=new JTextField();
    t5.setBounds(220,370,230,20);
    t5.setFont(font);
    c.add(t5);
    course=new JLabel("Course       -");
    course.setBounds(20,400,200,20);
    course.setFont(fonts);
    c.add(course);
    //  t4=new JTextField();
    // t4.setBounds(130,50,100,20);
    //  c.add(t4);
     String branchs[]={"CIVIL","CSE","IT","ECE","EE","ME","CHEMICAL"};
     branch=new JComboBox(branchs);
     branch.setEditable(true);
     branch.setBounds(170,400,200,20);
     branch.setFont(font);
     c.add(branch);
     aadhar=new JLabel("Aadhar No.  -");
    aadhar.setBounds(380,400,130,20);
    aadhar.setFont(fonts);
    c.add(aadhar);
    t7=new JTextField();
    t7.setBounds(510,400,270,20);
    t7.setFont(font);
     c.add(t7);
     abc=new JLabel("ABC ID       -");
    abc.setBounds(20,440,130,20);
    abc.setFont(fonts);
    c.add(abc);
    t15=new JTextField();
    t15.setBounds(180,440,270,20);
    t15.setFont(font);
     c.add(t15);
    // //  JLabel label8=new JLabel("PASSWORD");
    // // label8.setBounds(20,125,100,20);
    // // label8.setFont(fonts);
    // // c.add(label8);
    // // JPasswordField t6=new JPasswordField();
    // // t6.setBounds(130,125,100,20);
    // // t6.setEchoChar('*');
    // // t6.setFont(font);
    // // t6.setFont(fonts);
    // //  c.add(t6);
    submit=new JButton("SUBMIT");
    submit.setBounds(20,600,200,30);
    cancel=new JButton("CANCEL");
    cancel.setBounds(400,600,200,30);
    submit.setFont(fonts);
    cancel.setFont(fonts);
    c.add(submit);
    c.add(cancel);
        submit.addActionListener(ae -> {
            System.out.println("Name : "+t1.getText());
            System.out.println("Gender : "+((male.isSelected())?"Male":"Female"));
            System.out.println("Father's Name : "+t8.getText());
            System.out.println("Mother's Name : "+t9.getText());
            System.out.println("category :"+cat[category.getSelectedIndex()]);
            System.out.println("Corresponding Address : "+t10.getText());
            System.out.println("Permanent Address : "+t11.getText());
            System.out.println("State :"+s[state.getSelectedIndex()]);
            System.out.println("District : "+t12.getText());
            System.out.println("Postal Code : "+t13.getText());
            System.out.println("Mobile No. : "+num[nums.getSelectedIndex()]+t6.getText());
            System.out.println("Father's Mobile No. : "+numa[nums1.getSelectedIndex()]+t14.getText());
            System.out.println("E-MAIL : "+t2.getText());
            System.out.println("University Roll Number : "+t5.getText());
            //c.setBackground(Color.PINK);
            // System.out.println("Name : "+t6.getText());
            System.out.println("Branch :"+branchs[branch.getSelectedIndex()]);
            System.out.println("Aadhar No. : "+t7.getText());
            System.out.println("ABC ID : "+t15.getText());
        });
        cancel.addActionListener(ae -> {
            t1.setText("");
            t2.setText("");
            t5.setText("");
            male.setSelected(false);
            female.setSelected(false);
        });
    setVisible(true);
   }
}



