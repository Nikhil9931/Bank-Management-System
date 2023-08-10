
package bank.management;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

 
public class BalanceEnquiry extends JFrame implements ActionListener{
    JButton backing ;
    String pinnumber;
     BalanceEnquiry (String pinnumber){
         this.pinnumber = pinnumber;
         setLayout(null);
         
         
         
         ImageIcon image1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
         Image image2 =  image1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
         ImageIcon image3 = new ImageIcon (image2);
         JLabel images  = new JLabel (image3);
         images.setBounds(0,0,900,900);
         add(images);
         
         
         backing = new JButton ("Back");
         backing.setBounds(355,520,150,30);
         backing.addActionListener(this);
         images.add(backing);
         
          Conn conn = new Conn();
          int balance = 0;
          try{
            ResultSet rs = conn.s.executeQuery("select * from bank where pin = '"+pinnumber+"'")  ;
               while(rs.next()){
                if(rs.getString("type").equals("Deposit")){
                    balance += Integer.parseInt( rs.getString("amount"));
                    
                }else{
                    balance -= Integer.parseInt( rs.getString("amount"));
                }
            }
          }catch(Exception e){
              System.out.println(e);
          }
          
          JLabel l1 = new JLabel("Your Current Account balance is Rs " + balance);
          l1.setForeground(Color.WHITE);
          l1.setBounds(170,300,400,30);
          images.add(l1);
         
         setSize(900,900);
         setLocation(300,0);
         setUndecorated ( true);
         setVisible(true);
         
        }
     
     public void actionPerformed (ActionEvent ae){
         setVisible(false);
         new Transactions(pinnumber).setVisible(true);
     }
    public static void main(String args[]) {
        new BalanceEnquiry("");
    }
}
