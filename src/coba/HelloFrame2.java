/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
//cara menggunakan Jpanel
package coba;

import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author made
 */
public class HelloFrame2 extends JFrame{

    public HelloFrame2() throws HeadlessException {
        this.setSize(1000,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Hello World");
        this.setVisible(true);
        
        JPanel jp=new JPanel();
        JButton but1=new JButton();
        but1.setText("Okay");
        jp.add(but1);
        this.add(jp);
    }
    public static void main(String[] args) {
        HelloFrame2 hf=new HelloFrame2();
    }
    
}
