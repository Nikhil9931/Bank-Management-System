 
package bank.management;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;


 
  public class SignupOne extends JFrame implements  ActionListener{
    long ran;
     JTextField  personnameTextField , nameofFatherTextField, dateofbirthTextField, personemailTextField, personaddressTextField, personscityTextField, PersonstateTextField,personpincodeTextField; 
    JButton interfacesecond;
    JRadioButton gender,genderr,othercategory,personismarried,personisunmarried;
    JDateChooser chooserofdate;
    SignupOne(){
        setLayout(null);
        
        
        Random num = new Random();
        ran =Math.abs((num.nextLong()%9000L)+1000L);
        
        
        JLabel formnumber = new JLabel("APPLICATION FORM NO. "+ ran  );
        formnumber.setFont(new Font("Raleway", Font.BOLD,38));
        formnumber.setBounds(140,20,600,40);
        add(formnumber);
        
        
         JLabel DetailsofPerson = new JLabel("Page 1: Personal Details" );
        DetailsofPerson.setFont(new Font("Raleway", Font.BOLD,22));
       DetailsofPerson.setBounds(290,80,400,30);
        add(DetailsofPerson);
        
        JLabel  Personname = new JLabel(" Name:" );
        Personname.setFont(new Font("Raleway", Font.BOLD,20));
       Personname.setBounds(100,140,100,30);
        add(Personname);
        
          personnameTextField = new JTextField();
        personnameTextField.setFont(new Font("Raieway", Font.BOLD, 14));
        personnameTextField.setBounds(300 , 140 , 400 , 30);
        add(personnameTextField);
        
        
         JLabel   nameofFather = new JLabel(" Father's Name:" );
        nameofFather.setFont(new Font("Raleway", Font.BOLD,20));
       nameofFather.setBounds(100,190,200,30);
        add(nameofFather);
        
         nameofFatherTextField = new JTextField();
        nameofFatherTextField.setFont(new Font("Raieway", Font.BOLD, 14));
        nameofFatherTextField.setBounds(300 , 190 , 400 , 30);
        add(nameofFatherTextField);
        
                  
         JLabel   dateofbirth = new JLabel(" Date of Birth:" );
        dateofbirth.setFont(new Font("Raleway", Font.BOLD,20));
       dateofbirth.setBounds(100,240,200,30);
        add(dateofbirth);
        
          chooserofdate = new JDateChooser();
        chooserofdate.setBounds(300,240,400,30);
         
        //chooserofdate.setForeground(new Color(105,105,105));
        add(chooserofdate);
        
          
        
         JLabel   persongender = new JLabel(" Gender:" );
        persongender.setFont(new Font("Raleway", Font.BOLD,20));
       persongender.setBounds(100,290,200,30);
        add(persongender);
        
         gender = new JRadioButton("Male");
        gender.setBounds(300,290,60,30);
        gender.setBackground(Color.WHITE);
        add(gender);
        
        
         genderr = new JRadioButton("Female");
        genderr.setBounds(450,290,120,30);
        genderr.setBackground(Color.WHITE);
        add(genderr);
        
        ButtonGroup groupofgender = new ButtonGroup();
        groupofgender.add(gender);
        groupofgender.add(genderr);
        
        JLabel   personemail = new JLabel(" Email Address:" );
        personemail.setFont(new Font("Raleway", Font.BOLD,20));
       personemail.setBounds(100,340,200,30);
        add(personemail);
        
         personemailTextField = new JTextField();
        personemailTextField.setFont(new Font("Raieway", Font.BOLD, 14));
        personemailTextField.setBounds(300 , 340 , 400 , 30);
        add(personemailTextField);
        
        
        JLabel   statusofmarital = new JLabel("Marital Status:" );
        statusofmarital.setFont(new Font("Raleway", Font.BOLD,20));
       statusofmarital.setBounds(100,390,200,30);
        add(statusofmarital);
        
         personismarried = new JRadioButton("Married");
        personismarried.setBounds(300,390,100,30);
        personismarried.setBackground(Color.WHITE);
        add(personismarried);
        
        
        personisunmarried = new JRadioButton("Unmarried");
        personisunmarried.setBounds(450,390,100,30);
        personisunmarried.setBackground(Color.WHITE);
        add(personisunmarried);
        
         othercategory = new JRadioButton("Other");
        othercategory.setBounds(630,390,100,30);
        othercategory.setBackground(Color.WHITE);
        add(othercategory);
        
        ButtonGroup marriedornot = new ButtonGroup();
        marriedornot.add(personismarried);
        marriedornot.add(personisunmarried);
        marriedornot.add(othercategory);
        
         
        
        JLabel   personaddress = new JLabel("Address:" );
        personaddress.setFont(new Font("Raleway", Font.BOLD,20));
       personaddress.setBounds(100,440,200,30);
        add(personaddress);
        
         personaddressTextField = new JTextField();
        personaddressTextField.setFont(new Font("Raieway", Font.BOLD, 14));
        personaddressTextField.setBounds(300 , 440 , 400 , 30);
        add(personaddressTextField);
        
        
        JLabel   personscity = new JLabel("City:" );
        personscity.setFont(new Font("Raleway", Font.BOLD,20));
       personscity.setBounds(100,490,200,30);
        add(personscity);
        
         personscityTextField = new JTextField();
        personscityTextField.setFont(new Font("Raieway", Font.BOLD, 14));
        personscityTextField.setBounds(300 , 490 , 400 , 30);
        add(personscityTextField);
        
        
                 
        JLabel   Personstate = new JLabel("State:" );
        Personstate.setFont(new Font("Raleway", Font.BOLD,20));
       Personstate.setBounds(100,540,200,30);
        add(Personstate);
        
        
         PersonstateTextField = new JTextField();
        PersonstateTextField.setFont(new Font("Raieway", Font.BOLD, 14));
        PersonstateTextField.setBounds(300 , 540 , 400 , 30);
        add(PersonstateTextField);
        
        
        
        JLabel   personpincode = new JLabel("Pin Code:" );
        personpincode .setFont(new Font("Raleway", Font.BOLD,20));
      personpincode .setBounds(100,590,200,30);
        add(personpincode );
        
         personpincodeTextField = new JTextField();
        personpincodeTextField.setFont(new Font("Raieway", Font.BOLD, 14));
        personpincodeTextField.setBounds(300 , 590 , 400 , 30);
        add(personpincodeTextField);
        
        interfacesecond = new JButton("Next");
        interfacesecond.setBackground(Color.BLACK);
        interfacesecond.setForeground(Color.WHITE);
        interfacesecond.setFont(new Font("Raleway",Font.BOLD,14));
        interfacesecond.setBounds(620,660,80,30);
        interfacesecond.addActionListener(this);
        add(interfacesecond);
        
        
        

        
        
        getContentPane().setBackground(Color.WHITE);
        
        
        setSize (850,800);
        setLocation(350,10);
        setVisible(true);
    }
    public void actionPerformed (ActionEvent ae) {
        String formnumber = "" +  ran;
        String Personname = personnameTextField.getText () ;
        String nameofFather = nameofFatherTextField.getText();
        String dateofbirth = ((JTextField)chooserofdate.getDateEditor().getUiComponent()).getText();
        String persongender = null;
        if(gender.isSelected()){
            persongender = "Male";
            }else if(genderr.isSelected()){
                persongender = "Female";
            }
        String personemail = personemailTextField.getText();
        String statusofmarital = null;
        if(personismarried.isSelected()){
            statusofmarital = "Married";
        }else if(personisunmarried.isSelected()){
            statusofmarital = "Unmarried";
        }else if(othercategory.isSelected()){
            statusofmarital = "Other";
        }
        String personaddress = personaddressTextField.getText();
        String personscity =personscityTextField.getText();
        String Personstate = PersonstateTextField.getText();
        String personpincode= personpincodeTextField.getText();
        
        
        try{
            if(Personname.equals("")){
                JOptionPane.showMessageDialog(null, "Name is Required");
            }else {
                Conn c = new Conn ();
                String query = "insert into signup values('"+formnumber+"' , '"+Personname+"' , '"+nameofFather+"' ,'"+dateofbirth+"', '"+persongender+"' ,'"+personemail+"', '"+statusofmarital+"','"+personaddress+"','"+personscity+"','"+Personstate+"','"+personpincode+"')";
                c.s.executeUpdate(query);
                
                
                setVisible(false);
                new SignupTwo( formnumber).setVisible(true);
                
            }
        } catch (Exception e){
           System.out.println(e);
        }
         
    }

     
    public static void main(String args[]) {
        new SignupOne();
        
    }
}
