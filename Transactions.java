 
package bank.management;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 
public class Transactions extends JFrame implements ActionListener {
    
    JButton depositing,cashwithdraw,fastcashes,ministatements,pinchanging,enquiryofbalance,exiting;
    String pinnumber;
    
  Transactions(String pinnumber){
      this.pinnumber = pinnumber;
      setLayout(null);
      ImageIcon image1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
      Image image2 = image1.getImage().getScaledInstance(900,900, Image.SCALE_DEFAULT);
      ImageIcon image3 = new ImageIcon(image2);
      JLabel images = new JLabel (image3);
      images.setBounds(0,0,900,900);
       add(images);
    
       JLabel text1 = new JLabel("Please Select Your Transaction");
       text1.setBounds(220,300,700,35);
       text1.setForeground(Color.WHITE);
       text1.setFont(new Font("System" , Font.BOLD,16));
       images.add(text1); 
       
       
         depositing = new JButton("Deposit");
       depositing.setBounds(170,417,150,30);
       depositing.addActionListener(this);
       images.add(depositing);
       
          cashwithdraw = new JButton("Cash Withdraw");
       cashwithdraw.setBounds(350,417,150,30);
         cashwithdraw.addActionListener(this);
           images.add(cashwithdraw);
       
          fastcashes = new JButton("Fast Cash");
       fastcashes.setBounds(170,451,150,30);
       fastcashes.addActionListener(this);
       images.add(fastcashes);
       
            ministatements = new JButton("Mini Statement");
       ministatements.setBounds(350,451,150,30);
       ministatements.addActionListener(this);
       images.add(ministatements);
       
           pinchanging = new JButton("Pin Change");
       pinchanging.setBounds(170,486,150,30);
       pinchanging.addActionListener(this);
       images.add(pinchanging);
       
          enquiryofbalance = new JButton("Balance Enquiry");
       enquiryofbalance.setBounds(350,486,150,30);
       enquiryofbalance.addActionListener(this);
       images.add(enquiryofbalance);
       
         exiting = new JButton("Exit");
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
          System.exit(0);
      }else if(ae.getSource() == depositing){
          setVisible ( false);
          new Deposit(pinnumber).setVisible(true);
      }else if(ae.getSource()==cashwithdraw){
          setVisible(false);
          new Withdraw(pinnumber).setVisible(true);
      }else if(ae.getSource()==fastcashes){
          setVisible(false);
          new FastCash(pinnumber).setVisible(true);
      }else if(ae.getSource() == pinchanging){
          setVisible(false);
          new PinChange(pinnumber).setVisible(true);
      }else if(ae.getSource() == enquiryofbalance){
          setVisible(false);
          new BalanceEnquiry(pinnumber).setVisible(true);
      }else if(ae.getSource() == ministatements){
            new MiniStatement(pinnumber).setVisible(true);
      }
  }
     
    public static void main(String args[]) {
         new Transactions("");
    }
}
