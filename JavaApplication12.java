/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author chris
 */
public class JavaApplication12 {    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame myframe= new JFrame("My Program");
        
        myframe.setSize(800, 500);
        myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myframe.setVisible(true);
        JPanel mypanel= new JPanel();
        myframe.add(mypanel);
        JLabel usernamelabel= new JLabel("Username:");
        JTextField username=new JTextField();
        username.setColumns(10);
        mypanel.add(usernamelabel);
        mypanel.add(username);
        JLabel passwordlabel=new JLabel("Password:");
        JPasswordField password= new JPasswordField();
        password.setColumns(10);
        mypanel.add(passwordlabel);
        mypanel.add(password);
        JPanel mypanel2=new JPanel();
        myframe.add(mypanel2);
        JButton login=new JButton("LOGIN");
        JButton clear=new JButton("CLEAR");
        mypanel.add(login);
        mypanel.add(clear);
        
        
        
        
        
        
        
        // TODO code application logic here
    }
    
}
