 
package bank.management;

import javax.swing.*;
import java.awt.*;
 
import java.awt.event.*;


 
  public class SignupTwo extends JFrame implements  ActionListener{
    
     JTextField  panno,aadharno;
    JButton interfacesecond;
    JRadioButton yes,no,ecyes,ecno;
     
    JComboBox religionselection, Categoryselection,Incomes ,Eduaction,Occupations; 
    String  formnumber;
    
    
    SignupTwo(String  formnumber){
        this. formnumber =  formnumber;
        setLayout(null);
        
        setTitle ("NEW ACCOUNT APPLICATION FORM - PAGE 2");
        
        
        
         JLabel NextDetails  = new JLabel("Page 2: Additional Details" );
        NextDetails.setFont(new Font("Raleway", Font.BOLD,22));
       NextDetails.setBounds(290,80,400,30);
        add(NextDetails);
        
        JLabel  Personname = new JLabel(" Religion:" );
        Personname.setFont(new Font("Raleway", Font.BOLD,20));
       Personname.setBounds(100,140,100,30);
        add(Personname);
        
        String religionVal [] = {"Hindu", "Muslim ", "Sikh", "Christian", "Other"};
          religionselection= new JComboBox(religionVal );
        religionselection.setBounds(300 , 140 , 400 , 30);
       religionselection.setBackground(Color.WHITE);
        add(religionselection);
        
        
        
       JLabel   nameofFather = new JLabel(" Category:" );
       nameofFather.setFont(new Font("Raleway", Font.BOLD,20));
       nameofFather.setBounds(100,190,200,30);
        add(nameofFather);
        
          String  CategoryVal   [] = {"General", "OBC", "SC", "ST", "Other"};
           Categoryselection= new JComboBox(CategoryVal  );
        Categoryselection.setBounds(300 , 190 , 400 , 30);
       Categoryselection.setBackground(Color.WHITE);
        add(Categoryselection);
        
                  
         JLabel   dateofbirth = new JLabel(" Income:" );
        dateofbirth.setFont(new Font("Raleway", Font.BOLD,20));
       dateofbirth.setBounds(100,240,200,30);
        add(dateofbirth);
        
        String  CategoryofIncome   [] = {"Null", "<1,50,000", "<2,50,000", "<5,00,000", "Upto 10,00,000"};
            Incomes= new JComboBox(CategoryofIncome  );
        Incomes.setBounds(300 , 240 , 400 , 30);
       Incomes.setBackground(Color.WHITE);
        add(Incomes);
        
          
          
        
         JLabel   persongender = new JLabel(" Educational" );
        persongender.setFont(new Font("Raleway", Font.BOLD,20));
       persongender.setBounds(100,290,200,30);
        add(persongender);
        
          
        JLabel   personemail = new JLabel(" Qualification:" );
        personemail.setFont(new Font("Raleway", Font.BOLD,20));
       personemail.setBounds(100,315,200,30);
        add(personemail);
        
          String  EducationVal   [] = {"Non-Graduation", "Graduation", "Post-Graduation", "Doctrate", "Other"};
         Eduaction= new JComboBox(EducationVal );
        Eduaction.setBounds(300 , 315 , 400 , 30);
       Eduaction.setBackground(Color.WHITE);
        add(Eduaction);
        
         
        
        JLabel   statusofmarital = new JLabel("Occupation:" );
        statusofmarital.setFont(new Font("Raleway", Font.BOLD,20));
       statusofmarital.setBounds(100,390,200,30);
        add(statusofmarital);
        
          String  OccupationVal [] = {"Salaried", "Self-Employed", "Bussiness", "Student", "Retired","Others"};
            Occupations= new JComboBox(OccupationVal );
        Occupations.setBounds(300 , 390 , 400 , 30);
       Occupations.setBackground(Color.WHITE);
        add(Occupations);
        
         
        
         
        
        JLabel   personaddress = new JLabel("PAN Number:" );
        personaddress.setFont(new Font("Raleway", Font.BOLD,20));
       personaddress.setBounds(100,440,200,30);
        add(personaddress);
        
         panno  = new JTextField();
        panno .setFont(new Font("Raieway", Font.BOLD, 14));
       panno .setBounds(300 , 440 , 400 , 30);
        add(panno );
        
        
        JLabel  personscity = new JLabel("Aadhar Number:" );
        personscity.setFont(new Font("Raleway", Font.BOLD,20));
       personscity.setBounds(100,490,200,30);
        add(personscity);
        
        aadharno = new JTextField();
        aadharno.setFont(new Font("Raieway", Font.BOLD, 14));
        aadharno.setBounds(300 , 490 , 400 , 30);
        add(aadharno);
        
        
                 
        JLabel   Personstate = new JLabel("Senior Citizen:" );
        Personstate.setFont(new Font("Raleway", Font.BOLD,20));
       Personstate.setBounds(100,540,200,30);
        add(Personstate);
        
        
          yes = new JRadioButton("Yes");
        yes.setBounds(300,540,100,30);
        yes.setBackground(Color.WHITE);
        add(yes);
        
        
        no = new JRadioButton("No");
        no.setBounds(450,540,100,30);
        no.setBackground(Color.WHITE);
        add(no);
        
        
        
        ButtonGroup marriedornot = new ButtonGroup();
        marriedornot.add(yes);
        marriedornot.add(no);
        
        
         
        
        JLabel   personpincode = new JLabel("Existing Account:" );
        personpincode .setFont(new Font("Raleway", Font.BOLD,20));
      personpincode .setBounds(100,590,200,30);
        add(personpincode );
        
         ecyes = new JRadioButton("Yes");
        ecyes.setBounds(300,590,100,30);
        ecyes.setBackground(Color.WHITE);
        add(ecyes);
        
        
        ecno = new JRadioButton("No");
        ecno.setBounds(450,590,100,30);
        ecno.setBackground(Color.WHITE);
        add(ecno);
        
        
        
        ButtonGroup ecmarriedornot = new ButtonGroup();
        ecmarriedornot.add(ecyes);
        ecmarriedornot.add(ecno);
        
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
        String sreligionselection = (String) religionselection.getSelectedItem() ;
        String sCategoryselection = (String)Categoryselection.getSelectedItem();
        String sIncomes = (String)Incomes.getSelectedItem();
        String sEduaction =(String)Eduaction.getSelectedItem();
        String sOccupations =(String)Occupations.getSelectedItem();
        String seniorcitizen = null;
        if(yes.isSelected()){
            seniorcitizen = "Yes";
            }else if(no.isSelected()){
               seniorcitizen = "No";
            }
        
        String existingaccount = null;
        if(ecyes.isSelected()){
            existingaccount= "Yes";
        }else if(ecno.isSelected()){
           existingaccount= "No";
        } 
        String spanno = panno.getText();
        String saadharno =aadharno.getText();
         
        
        try{
            
                Conn c = new Conn ();
                String query = "insert into signuptwo values('"+formnumber+"' , '"+sreligionselection+"' , '"+sCategoryselection+"' ,'"+sIncomes+"', '"+sEduaction+"' ,'"+sOccupations+"', '"+spanno+"','"+saadharno+"','"+seniorcitizen+"','"+existingaccount+"')";
                c.s.executeUpdate(query);
                
                //SignupThree 
                setVisible(false);
                new SignupThree(formnumber).setVisible(true);
                
                
                
                
             } catch (Exception e){
           System.out.println(e);
        }
         
    }

     
    public static void main(String args[]) {
        new SignupTwo("");
        
    }
}
