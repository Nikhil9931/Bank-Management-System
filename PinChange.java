 
 package bank.management;
 
 
 import javax.swing.*;
 import java.awt.*;
 import java.awt.event.*;
 
public class PinChange extends JFrame implements ActionListener{
    
    JPasswordField  pinenter, repinenter;
    JButton  changing , backing;
    String pinnumber;

    PinChange(String pinnumber){
        this.pinnumber = pinnumber;
        setLayout(null);
        
        ImageIcon i11 = new ImageIcon (ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i12 = i11.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i13 =  new ImageIcon(i12);
        JLabel image = new JLabel(i13);
        image.setBounds(0,0,900,900);
        add(image);
        
        JLabel text1 =  new JLabel("CHANGE YOUR PIN");
        text1.setForeground(Color.WHITE);
        text1.setFont(new Font ("System" , Font.BOLD , 16));
        text1.setBounds(250,280,500,35);
        image.add(text1); 
        
        
        JLabel textpin =  new JLabel("New PIN:");
        textpin.setForeground(Color.WHITE);
        textpin.setFont(new Font ("System" , Font.BOLD , 16));
        textpin.setBounds(165,320,180,25);
        image.add(textpin);
        
          pinenter = new JPasswordField();
        pinenter.setFont(new Font("Raleway" , Font.BOLD,25));
        pinenter.setBounds(330,320 , 180 , 25);
        image.add(pinenter);
        
        
         JLabel retextpin =  new JLabel("Re-Enter New PIN:");
        retextpin.setForeground(Color.WHITE);
        retextpin.setFont(new Font ("System" , Font.BOLD , 16));
        retextpin.setBounds(165,360,180,25);
        image.add(retextpin);
        
             repinenter = new JPasswordField();
        repinenter.setFont(new Font("Raleway" , Font.BOLD,25));
        repinenter.setBounds(330,360 , 180 , 25);
        image.add(repinenter);
        
          changing = new JButton("CHANGE");
        changing.setBounds(355, 485 , 150 , 30);
        changing.addActionListener(this);
        image.add(changing);
        
           backing = new JButton("BACK");
        backing.setBounds(355, 520 , 150 , 30);
        backing.addActionListener(this);
        image.add(backing);
        
        
        
        
        setSize(900,900);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
    }
        
        public void actionPerformed(ActionEvent ae){
            if(ae.getSource() == changing){
            try{
                String newpin = pinenter.getText();
                String repin = repinenter.getText();
                if(!newpin.equals(repin)){
                    JOptionPane.showMessageDialog(null, "Entered PIN does not match");
                    return;
                }
                
                if(newpin.equals("")){
                     JOptionPane.showMessageDialog(null, "Please enter new PIN");
                    return;
                }
                
                if(repin.equals("")){
                    JOptionPane.showMessageDialog(null, "Please re-enter new PIN");
                    return;
                }
                
                Conn conn = new Conn();
                String query1 = "update bank set pin = '"+repin+"' where pin=  '"+pinnumber+"'";
                String query2 = "update login set pin = '"+repin+"' where pin = '"+pinnumber+"'";
                String query3 = "update signupthree set pin = '"+repin+"' where pin = '"+pinnumber+"'";
                
                conn.s.executeUpdate(query1);
                conn.s.executeUpdate(query2);
                conn.s.executeUpdate(query3);
                JOptionPane.showMessageDialog(null, "PIN changed successfully");
                
                setVisible(false);
                new Transactions(repin).setVisible(true);
            
              } catch(Exception e){
                System.out.println(e);
            }
            } else {
                setVisible(false);
                new Transactions(pinnumber).setVisible(true);
            }
        }
    public static void main(String args[]) {
         new PinChange("").setVisible(true);
    }
}

