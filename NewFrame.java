/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginProject;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
/**
 *
 * @author Administrator
 */
public class NewFrame extends JFrame{
    
        private Container c;
  private JTextArea ta;
    private JLabel label;
    private JScrollPane scroll;
    
    
    
    NewFrame(){
      
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(700,350,620,650);
        this.setTitle("Log in demo");
        c= this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.GRAY);
        
        ta = new JTextArea();
        ta.setBounds(200,100,100,100);
        ta.setBackground(Color.MAGENTA);
//        c.add(ta);
        
        
        
        scroll = new JScrollPane(ta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scroll.setBounds(50,50,200,300);
        scroll.setBackground(Color.yellow);
        c.add(scroll);
        
        label = new JLabel();
        label.setBounds(100,100,420,350);
        label.setVisible(true);
        c.add(label);
        
        
        
        
    }
    
    public static void main(String[] args) {
        
        NewFrame frame= new NewFrame();
        frame.setTitle("2nd Frame");
        frame.setVisible(true);
        
        
    }
    
    
    
}
