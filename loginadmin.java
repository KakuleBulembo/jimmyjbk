
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.logging.Level;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

//Loginadmin class
public final class loginadmin extends JFrame implements ActionListener{
    Container cont=new Container();
    JLabel usernamelbl=new JLabel("Username: ");
    JTextField username=new JTextField();
    JLabel passwordlbl=new JLabel("Passord: ");
    JPasswordField password=new JPasswordField();
    JCheckBox showpass=new JCheckBox("Show Password");
    JButton login=new JButton("LOGIN");
    JButton clear=new JButton("CLEAR");
// Constructor for loginadmin
    loginadmin(){
    //Calling the methods setLayout
        setLayoutManager();
        setLocationAndSize();
        addComponentToContainer();
        JFrame();
        AddActionEvent();
    }
    public void setLayoutManager(){
    cont.setLayout(null);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        //Coding the clear button
      if (e.getSource()==clear){
          username.setText("");
          password.setText("");
          //coding show pass button
          if(e.getSource()==showpass){
              if(showpass.isSelected()){
              password.setEchoChar((char)0);
              }
              else{
              password.setEchoChar('*');
              }
          }
          
      }
            
                                                                                                                                   
    }
    

   

    public void setLocationAndSize() {
      usernamelbl.setBounds(50,25,100,20);
      username.setBounds(150,25,150,20);
      passwordlbl.setBounds(50,60,100,20);
      password.setBounds(150,60,150,20);
      showpass.setBounds(150,85,150,20); 
      login.setBounds(80,105,100,20);
      clear.setBounds(200,105,100,20);
    }

    public void addComponentToContainer() {
        cont.add(usernamelbl);
        cont.add(username);
        cont.add(passwordlbl);
        cont.add(password);
        cont.add(showpass);
        cont.add(login);
        cont.add(clear);
        cont.setBackground(Color.pink);
    }
     public void JFrame() {
        JFrame myframe=new JFrame("LOGIN");
        myframe.setSize(600,400);
        myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myframe.setVisible(true);
        myframe.setResizable(false);
        myframe.add(cont);
    
    }
    private void AddActionEvent() {
         login.addActionListener(this);
         clear.addActionListener(this);
         showpass.addActionListener(this);
      
    }
 
      public static void main(String[] a){
         new loginadmin();
        
       
        
    } 

    
  
   
   
}
