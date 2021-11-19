/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginProject;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
/**
 *
 * @author Administrator
 */
public class LoginFrame extends JFrame {
    private final Container c;
    private final JLabel userlabel;
    private final JLabel passwordlabel;
    private JPasswordField passlabel;
    private final JButton btn1;
    private final JButton btn2;
    private final Font f;
    private JTextField tf1,tf2;
    private final ImageIcon img1;
    
    private JLabel imglabel;
    
    
    private ImageIcon backimg; 
    private Image img;
    
    
    
//    private final ImageIcon img2;
    private JTextArea ta;
    
    
    LoginFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100,50,420,350);
        this.setTitle("Log in demo");
        c= this.getContentPane();
        c.setLayout(null);
        
        c.setForeground(Color.WHITE);
         
          
        
        backimg = new ImageIcon(getClass().getResource("pic4.jpg"));
        
        
        imglabel = new JLabel(backimg);
        
        imglabel.setSize(420,350);
        c.add(imglabel);
       
        
  
        
        img1= new ImageIcon(getClass().getResource("sub2.jpg"));
//         img2= new ImageIcon(getClass().getResource("del.jpg"));
        
        f= new Font("Arial",Font.BOLD,19);
        
        userlabel = new JLabel("Username: ");
        userlabel.setBounds(50,50,150,50);
        userlabel.setFont(f);
        userlabel.setForeground(Color.magenta);
        c.add(userlabel);
        
        passwordlabel = new JLabel("Password: ");
        
        passwordlabel.setBounds(50,100,150,50);
        passwordlabel.setFont(f);
        passwordlabel.setForeground(Color.magenta);
        c.add(passwordlabel);
       
        
        
        tf1= new JTextField();
        tf1.setFont(f);
        tf1.setBounds(160,50,200,50);
        tf1.setForeground(Color.BLACK);
       
        tf1.setBackground(Color.GREEN);
        c.add(tf1);
         
        passlabel = new JPasswordField();
        passlabel.setFont(f);
        passlabel.setBounds(160,110,150,50);
        passlabel.setBackground(Color.GREEN);
        passlabel.setForeground(Color.BLACK);
        passlabel.setEchoChar('*');
        
        c.add(passlabel);
         
        ta = new JTextArea();
        ta.setFont(f);
        ta.setBounds(70,250,250,30);
        ta.setForeground(Color.BLACK);
        ta.setBackground(Color.GREEN);
        ta.setLineWrap(true);
        ta.setWrapStyleWord(true);
        c.add(ta);
        
        btn1= new JButton("LOG IN");
        btn1.setBounds(70,200,100,30);
        btn1.setBackground(Color.cyan);
        
        c.add(btn1);
        
         btn2= new JButton("SIGN UP");
        btn2.setBounds(180,200,100,30);
//        btn2.setIcon(img2);
        
        c.add(btn2);
       
        btn2.addActionListener((ActionEvent a) -> {
            passlabel.setText("");
            tf1.setText("");
        });
        
         btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent a) {
                String username=tf1.getText();
                String password= String.valueOf(passlabel.getPassword());
                
                
                
                String query =  "SELECT * FROM worker.user where username= '" +username+"' ";
                
                String passwordInuser="";
                
                
                
                try{
                    ResultSet rs= DBUTILS.queryExecute(query);
                    if(rs.next()){
                        passwordInuser = rs.getString("password");
                    }}
                
                
                
                catch(Exception e)
                {
                    e.printStackTrace();
                }
                
                
                if(password.equals(passwordInuser))
                {
                    
                    dispose();
                    
                    new NewFrame().setVisible(true);
                }
                else {
                      
                       ta.setText("Incorrect password or username");
                    
                
                }
            }
        });
    
        
        
    
    }
//    public void initComponent(){
//        
//    
//    }
    
    public static void main(String[] args) {
        
        LoginFrame frame= new LoginFrame();
        frame.setVisible(true);
       frame.setIconImage(new ImageIcon("pic.jpg").getImage());
        
    }
    
}
    

