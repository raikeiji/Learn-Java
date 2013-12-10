/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
//cara menggunakan jframe
package coba;

import java.awt.HeadlessException;
import javax.swing.JFrame;

/**
 *
 * @author made
 */
public class HelloFrame extends JFrame{

    public HelloFrame() throws HeadlessException {
        this.setSize(200,100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Hello world");
        this.setVisible(true);
    }
    public static void main(String[] args) {
        new HelloFrame();
    }
    
}
