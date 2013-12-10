/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
//cara menggunakan jframe
package coba;

import javax.swing.JFrame;

/**
 *
 * @author made
 */
public class TryWindows {
    public static void main(String[] args) {
        JFrame awindows=new JFrame("this is the windows title");
        int windowwidth=400;
        int windowheight=150;
        awindows.setBounds(50,100,windowwidth,windowheight);
        awindows.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        awindows.setVisible(true);
    }
}
