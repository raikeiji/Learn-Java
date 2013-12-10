/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coba;

import java.awt.HeadlessException;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author made
 */
//mecoba checkbox
public class HelloFrame3 extends JFrame{

    public HelloFrame3() {
    this.setSize(1000,500);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setTitle("Hello World");
    this.setVisible(true);
    
    JPanel jp=new JPanel();
    //make check box
    JCheckBox jcbTranslate=new JCheckBox("Indonesia");
    JCheckBox jcbFrench=new JCheckBox("French");
    JCheckBox jcbGerman=new JCheckBox("German");
    JCheckBox jcbChinese=new JCheckBox("Chinese");
    jcbTranslate.setEnabled(true);
    jcbFrench.setEnabled(true);
    jcbGerman.setEnabled(true);
    jcbChinese.setEnabled(true);
    jp.add(jcbTranslate);
    jp.add(jcbFrench);
    jp.add(jcbGerman);
    jp.add(jcbChinese);
    
    this.add(jp);
    }
    public static void main(String[] args) {
        HelloFrame3 hf=new HelloFrame3();
    }
    
}
