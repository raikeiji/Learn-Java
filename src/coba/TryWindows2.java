/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
//mencoba content pane
package coba;

import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author made
 */
public class TryWindows2 {
    //the windows onject
    public static void main(String[] args) {
        JFrame awindow=new JFrame("this is the window title");
        Container content=awindow.getContentPane(); //ini bisa dihilangkna
        JButton but1=new JButton();
        but1.setText("Cancel");
        
        //jika container dihilangkna makan gunakan langsung awindows
        content.add(but1); // awindow.add(but1)
        int windowWidth=400;
        int windowHeight=150;
        awindow.setBounds(50,100,windowWidth,windowHeight);
        awindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        awindow.setVisible(true); //display the windows
    }
}
