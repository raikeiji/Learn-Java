/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coba;

import java.awt.HeadlessException;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author made
 */
//contoh penggunaan jcombobox, hanya memilih satu dari menu yang diesdiakan
//menu dalam bentuk dropdown menu
public class HelloFrame5 extends JFrame{

    public HelloFrame5() {
    String languages[]={"Java","Perl","Phyton","C++","Basic","C#"};
    this.setSize(1000,500);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setTitle("Hello World");
    
    JPanel jp=new JPanel();
    JComboBox jcb=new JComboBox(languages);
    jp.add(jcb);
    this.add(jp);
    this.setVisible(true);
    }
    public static void main(String[] args) {
        HelloFrame5 hf=new HelloFrame5();
    }
}
