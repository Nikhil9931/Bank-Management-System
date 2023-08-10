 package bank.management;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
  
public class Withdraw extends JFrame implements ActionListener{
    
    JTextField amounts;
    JButton withdrawl,forBack;
    String pinnumber;
    
    Withdraw(String pinnumber){
        this.pinnumber = pinnumber;
        
        setLayout (null);
        
        
        ImageIcon ia = new ImageIcon (ClassLoader.getSystemResource("icons/atm.jpg"));
        Image ib = ia.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon ic = new ImageIcon(ib);
        JLabel images = new JLabel(ic); 
        images.setBounds(0,0,900,900);
        add(images);
        
        JLabel text1 = new JLabel("Enter the amount you want to Withdraw");
        text1.setForeground(Color.white);
        text1.setFont(new Font("System" , Font.BOLD,16));
        text1.setBounds(195,300,400,20);
        images.add(text1);
        
          amounts = new  JTextField();
        amounts.setFont(new Font("Raleway" , Font.BOLD , 22));
        amounts.setBounds(178,350, 320,25);
        images.add(amounts);
        
          withdrawl = new JButton("Withdraw");
        withdrawl.setBounds(355,486,150,30);
        withdrawl.addActionListener(this);
        images.add(withdrawl);
        
           forBack = new JButton("Back");
        forBack.setBounds(355,520,150,30);
         forBack.addActionListener(this);
        images.add(forBack);
        
        
        
        
        
        
        setSize(900,900);
        setLocation(300,0);
        setVisible(true);
        
    }
    
    public void actionPerformed (ActionEvent ae){
        if(ae.getSource()== withdrawl){
        String numbers  = amounts.getText();
       Date date = new Date();
       if(numbers.equals("")){
           JOptionPane.showMessageDialog(null , "Please enter the amount you want to Withdraw");
       }else {
           try{
           Conn connection = new Conn();
           String query = "insert into bank values('"+pinnumber+"' , '"+date+"' , 'Withdraw' , '"+numbers+"')";
       connection.s.execute(query);
       JOptionPane.showMessageDialog(null, "Rs "+numbers+" Withdraw Successfully");
         setVisible(false);
       new Transactions(pinnumber).setVisible(true);
           }catch (Exception e){
           System.out.println(e);
       }
       }
    }else if (ae.getSource() == forBack) {
        setVisible(false);
            new Transactions(pinnumber).setVisible(true);
            }
        
    }
     public static void main(String args[]) {
         
         new Withdraw ("");
        
    }
}
