 
package bank.management;

import javax.swing.*;

import java.awt.*;

import java.awt.event.*;

import java.util.*;

public class SignupThree extends JFrame implements ActionListener{
    
    JRadioButton a1,a2,a3,a4;
    
    JCheckBox b1,b2,b3,b4,b5,b6,b7;
    
    JButton  forsubmit , forcancel;
    String formnumber;

     SignupThree( String formnumber){
         
      this.formnumber = formnumber;
         
         setLayout(null);
         
         
         
         JLabel s1 = new JLabel("Page 3: Account Details");
         s1.setFont (new Font("Raleway" , Font.BOLD, 22));
         s1.setBounds(280,40,400,40);
         add(s1);
         
          JLabel accountType= new JLabel("Account Type");
         accountType.setFont (new Font("Raleway" , Font.BOLD, 22));
         accountType.setBounds(100,140,200,30);    
          add(accountType);
          
          a1 = new JRadioButton("Saving Account");
          a1.setFont(new Font ("Raleway" , Font.BOLD ,16));
          a1.setBackground(Color.WHITE);
          a1.setBounds(100,180,150,20);
          add(a1);
          
          
          a2 = new JRadioButton("Fixed Deposit Account");
          a2.setFont(new Font ("Raleway" , Font.BOLD ,16));
          a2.setBackground(Color.WHITE);
          a2.setBounds(350,180,250,20);
          add(a2);
          
          
           a3 = new JRadioButton("Current Account");
          a3.setFont(new Font ("Raleway" , Font.BOLD ,16));
          a3.setBackground(Color.WHITE);
          a3.setBounds(100,220,250,20);
          add(a3);
          
          
          a4 = new JRadioButton("Recurring Deposit Account");
          a4.setFont(new Font ("Raleway" , Font.BOLD ,16));
          a4.setBackground(Color.WHITE);
          a4.setBounds(350,220,250,20);
          add(a4);
          
            
          
          ButtonGroup groupaccounts  = new ButtonGroup ();
          groupaccounts.add(a1);
          groupaccounts.add(a2);
          groupaccounts.add(a3);
          groupaccounts.add(a4);
          
          
           JLabel cardno= new JLabel("Card Number");
         cardno.setFont (new Font("Raleway" , Font.BOLD, 22));
         cardno.setBounds(100,300,200,30);    
          add(cardno);
          
          
          JLabel numbers= new JLabel("XXXX-XXXX-XXXX-7644");
         numbers.setFont (new Font("Raleway" , Font.BOLD, 22));
         numbers.setBounds(330,300,300,30);    
          add(numbers);
          
          JLabel cardInfo= new JLabel("Your 16 Digit Card Number");
         cardInfo.setFont (new Font("Raleway" , Font.BOLD, 12));
         cardInfo.setBounds(100,330,300,20);    
          add(cardInfo);
          
            
          JLabel pinno= new JLabel("PIN:");
         pinno.setFont (new Font("Raleway" , Font.BOLD, 22));
         pinno.setBounds(100,370,200,30);    
          add(pinno);
          
          
          JLabel pnumbers= new JLabel("XXXX");
         pnumbers.setFont (new Font("Raleway" , Font.BOLD, 22));
         pnumbers.setBounds(330,370,300,30);    
          add(pnumbers);
          
          
          JLabel pinInfo= new JLabel("Your 4 Digit Password");
         pinInfo.setFont (new Font("Raleway" , Font.BOLD, 12));
         pinInfo.setBounds(100,400,300,20);    
          add(pinInfo);
          
          
          
          JLabel service= new JLabel("Services Required:");
         service.setFont (new Font("Raleway" , Font.BOLD, 22));
         service.setBounds(100,450,400,30);    
          add(service);
          
          b1 = new JCheckBox ("ATM CARD");
          b1.setBackground(Color.WHITE);
          b1.setFont(new Font("Raleway" , Font.BOLD , 16));
          b1.setBounds(100,500,200,30);
          add(b1);
          
           b2 = new JCheckBox ("Internet Banking");
          b2.setBackground(Color.WHITE);
          b2.setFont(new Font("Raleway" , Font.BOLD , 16));
          b2.setBounds(350,500,200,30);
          add(b2);
          
           b3 = new JCheckBox ("Mobile Banking");
          b3.setBackground(Color.WHITE);
          b3.setFont(new Font("Raleway" , Font.BOLD , 16));
          b3.setBounds(100,550,200,30);
          add(b3);
          
           b4 = new JCheckBox ("EMAIL & SMS Alerts");
          b4.setBackground(Color.WHITE);
          b4.setFont(new Font("Raleway" , Font.BOLD , 16));
          b4.setBounds(350,550,200,30);
          add(b4);
          
           b5 = new JCheckBox ("Cheque Book");
          b5.setBackground(Color.WHITE);
          b5.setFont(new Font("Raleway" , Font.BOLD , 16));
          b5.setBounds(100,600,200,30);
          add(b5);
          
           b6 = new JCheckBox ("E-Statement");
          b6.setBackground(Color.WHITE);
          b6.setFont(new Font("Raleway" , Font.BOLD , 16));
          b6.setBounds(350,600,200,30);
          add(b6);
          
           b7 = new JCheckBox ("I hereby declares that the above enter details are correct to the best of my knowledge");
          b7.setBackground(Color.WHITE);
          b7.setFont(new Font("Raleway" , Font.BOLD , 12));
          b7.setBounds(100,680,600,30);
          add(b7);
          
          
          forsubmit = new JButton ("Submit");
          forsubmit.setBackground(Color.BLACK);
          forsubmit.setForeground(Color.WHITE);
          forsubmit.setFont(new Font("Raleway" , Font.BOLD,14));
          forsubmit.setBounds(250,720,100,30);
          forsubmit.addActionListener(this);
          add(forsubmit);
          
          
          forcancel = new JButton ("Cancel");
          forcancel.setBackground(Color.BLACK);
          forcancel.setForeground(Color.WHITE);
          forcancel.setFont(new Font("Raleway" , Font.BOLD,14));
          forcancel.setBounds(420,720,100,30);
          forcancel.addActionListener(this);
          add(forcancel);
          getContentPane ().setBackground(Color.WHITE);
          
            
         setSize (850, 820);
         setLocation(350,0);
         setVisible (true);
             
     }
     
     
     public void actionPerformed(ActionEvent ae){
         if(ae.getSource() == forsubmit){
             String accountType = null;
             if(a1.isSelected()){
                 accountType = "Saving Account";
             }else if(a2.isSelected()){
                 accountType = "Fixed Diposit Account";
             }else if(a3.isSelected()){
                 accountType = "Current Account";
             }else if(a4.isSelected()){
                 accountType = "Reccuring Deposit Account";
             } 
             
             Random ran = new Random();
             String cardnumber = "" + Math.abs((ran.nextLong() % 90000000L) + 5040936000000000L);
             String pinnumber = ""  + Math.abs((ran.nextLong()  %  9000L) + 1000L);
             String facilities = "";
             if(b1.isSelected()){
                 facilities = facilities + " ATM card";
             }else if(b2.isSelected()){
                 facilities = facilities + " Internet Banking";
             }else if(b3.isSelected()){
                 facilities = facilities + " Mobile Banking";
             }else if(b4.isSelected()){
                 facilities = facilities + " EMAIL & SMS Alerts";
             }else if(b5.isSelected()){
                 facilities = facilities + " Cheque Book";
             }else if(b6.isSelected()){
                 facilities = facilities + " E-Statement";
             } 
             
             try{
        if(accountType.equals("")){
            JOptionPane.showMessageDialog(null , "Account Type is Required");
        }else {
            Conn connection = new Conn();
            String query1 = "insert into signupthree values('"+formnumber+"' , '"+accountType+"', '"+cardnumber+"'  , '"+pinnumber+"' , '"+facilities+"' )";
                String query2 = "insert into login values('"+formnumber+"' ,  '"+cardnumber+"'  , '"+pinnumber+"' )";
            connection.s.executeUpdate(query1);
            connection.s.executeUpdate(query2);
            
            JOptionPane.showMessageDialog(null, "Card Number:" + cardnumber + "\n Pin: " + pinnumber);
                  setVisible(false);
                  new Deposit(pinnumber).setVisible(false);
        }
         }catch(Exception e){
             System.out.println(e);
         }
             
         }
         else if (ae.getSource() ==  forcancel){
             setVisible(false);
             new Login().setVisible(true);
         }
     }
    public static void main(String args[]) {
         new SignupThree("");
    }
}
