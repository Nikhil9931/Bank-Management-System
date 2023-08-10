 
package bank.management;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
 
public class MiniStatement extends JFrame  {
    
    MiniStatement(String pinnumber) {
        
        setTitle("Mini Statement");
        
        setLayout(null);
        
        JLabel ministatement = new JLabel();
        add(ministatement);
        
        JLabel bankname = new JLabel("Indian Bank");
        bankname.setBounds(150,20,100,20);
        add(bankname);
        
        JLabel cardno = new JLabel( );
        cardno.setBounds(20,80,300,20);
        add(cardno);
        
        JLabel totalbalance  =  new JLabel();
        totalbalance.setBounds(20,400,300,20);
        add(totalbalance);
        
        
          try{
             Conn conn = new Conn();
             ResultSet rs = conn.s.executeQuery("Select * from login where pin  = '"+pinnumber+"'");
              while(rs.next()){
                cardno.setText("Card Number: " + rs.getString("cardnumber").substring(0, 4) + "XXXXXXXX" + rs.getString("cardnumber").substring(12));
            }
             
        } catch(Exception e){
            System.out.println(e);
        }
        
        try{
            Conn conn = new Conn();
            int balances = 0;
            ResultSet rs = conn.s.executeQuery("Select * from bank where pin  = '"+pinnumber+"'");
            while(rs.next()){
                ministatement.setText(ministatement.getText() + "<html>" + rs.getString("date") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("type") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("amount") + "<br><br><html>"); 
                if(rs.getString("type").equals("Deposit")){
                    balances += Integer.parseInt( rs.getString("amount"));
                    
                }else{
                    balances -= Integer.parseInt( rs.getString("amount"));
                }
            }
            totalbalance.setText("Your current account balance is Rs " + balances);
        } catch(Exception e){
            System.out.println(e);
        }
        
       
        
        ministatement.setBounds(20,140,400,200);
        
        
        
        
        
        
        
        setSize(400,600);
        setLocation(20,20);
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);
    }
     public static void main(String args[]) {
        new MiniStatement("");
    }
}
