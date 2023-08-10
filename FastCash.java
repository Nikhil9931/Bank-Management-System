 
package bank.management;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Date;
 
public class FastCash extends JFrame implements ActionListener {
    
    JButton depositing,cashwithdraw,fastcashes,ministatements,pinchanging,enquiryofbalance,exiting;
    String pinnumber;
    
  FastCash(String pinnumber){
      this.pinnumber = pinnumber;
      setLayout(null);
      ImageIcon image1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
      Image image2 = image1.getImage().getScaledInstance(900,900, Image.SCALE_DEFAULT);
      ImageIcon image3 = new ImageIcon(image2);
      JLabel images = new JLabel (image3);
      images.setBounds(0,0,900,900);
       add(images);
    
       JLabel text1 = new JLabel("SELECT WITHDRAWL AMOUNT");
       text1.setBounds(220,300,700,35);
       text1.setForeground(Color.WHITE);
       text1.setFont(new Font("System" , Font.BOLD,16));
       images.add(text1); 
       
       
         depositing = new JButton("RS 100");
       depositing.setBounds(170,417,150,30);
       depositing.addActionListener(this);
       images.add(depositing);
       
          cashwithdraw = new JButton("Rs 500");
       cashwithdraw.setBounds(350,417,150,30);
         cashwithdraw.addActionListener(this);
           images.add(cashwithdraw);
       
          fastcashes = new JButton("Rs 1000");
       fastcashes.setBounds(170,451,150,30);
       fastcashes.addActionListener(this);
       images.add(fastcashes);
       
            ministatements = new JButton("Rs 2000");
       ministatements.setBounds(350,451,150,30);
       ministatements.addActionListener(this);
       images.add(ministatements);
       
           pinchanging = new JButton("Rs 5000");
       pinchanging.setBounds(170,486,150,30);
       pinchanging.addActionListener(this);
       images.add(pinchanging);
       
          enquiryofbalance = new JButton("Rs 10000");
       enquiryofbalance.setBounds(350,486,150,30);
       enquiryofbalance.addActionListener(this);
       images.add(enquiryofbalance);
       
         exiting = new JButton("BACK");
       exiting.setBounds(350,520,150,30);
       exiting.addActionListener(this);
       images.add(exiting);
       
       
             
      setSize(900,900);
    setLocation(300,0);
     setUndecorated(true);
    setVisible(true);
}
  
  public void actionPerformed(ActionEvent ae){
      if(ae.getSource() == exiting){
         setVisible(false);
         new Transactions(pinnumber).setVisible(true);
      }else { 
          String amount = ((JButton)ae.getSource()).getText().substring(3);
          Conn conn = new Conn();
          try{
            ResultSet rs = conn.s.executeQuery("select * from bank where pin = '"+pinnumber+"'")  ;
            int balance = 0;
            while(rs.next()){
                if(rs.getString("type").equals("Deposit")){
                    balance += Integer.parseInt( rs.getString("amount"));
                    
                }else{
                    balance -= Integer.parseInt( rs.getString("amount"));
                }
            }
            
            if(ae.getSource() != exiting && balance < Integer.parseInt(amount)){
                JOptionPane.showMessageDialog(null, "Insufficient Balance");
                return;
            }
            
            Date date = new Date();
            String query = "insert into bank values('"+pinnumber+"' , '"+date+"' , 'Withdraw'  , '"+amount+"' )";
            conn.s.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "RS " + amount + "Debited Sucessfully");
                   setVisible(false);
                   new Transactions(pinnumber).setVisible(true);
          }catch(Exception e){
              System.out.println(e);
          }
      } 
  }
     
    public static void main(String args[]) {
         new FastCash("");
    }
}
