/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coba;

import java.awt.HeadlessException;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author made
 */
//contoh menggunakan JRadio Button
public class HelloFrame4 extends JFrame{

    public HelloFrame4() {
    this.setSize(1000,500);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setTitle("Hello World");
    
    JPanel jp=new JPanel();
    //create the button group
    ButtonGroup bg=new ButtonGroup();
    //create the radio button. select the first one
    JRadioButton jrbFrench=new JRadioButton("French",true);
    JRadioButton jrbGerman=new JRadioButton("German");
    JRadioButton jrbChinese=new JRadioButton("Chinese");
    //add the radio buttons to the group
    bg.add(jrbFrench);
    bg.add(jrbGerman);
    bg.add(jrbChinese);
    
    jrbFrench.setEnabled(true);
    jrbGerman.setEnabled(true);
    jrbChinese.setEnabled(true);
    
    jp.add(jrbFrench);
    jp.add(jrbGerman);
    jp.add(jrbChinese);
    this.add(jp);
    this.setVisible(true);
    }
    public static void main(String[] args) {
        HelloFrame4 hf=new HelloFrame4();
    }
    
}
