/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coba.coba_3;

import java.awt.BorderLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;

/**
 *
 * @author made
 */
public class Test extends JFrame{

    public Test(){
        JDesktopPane desk=new JDesktopPane();
        final JInternalFrame inter=new JInternalFrame("My Internal", true, true,true,true);
        inter.setBounds(25,25,100,300);
        desk.add(inter);
        getContentPane().add(desk,BorderLayout.CENTER);
        JButton button=new JButton("Show my Internals");
        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                inter.setVisible(true);
            }
        });
        getContentPane().add(button, BorderLayout.SOUTH);
    }
    public static void main(String[] args) {
        Test t=new Test();
        t.setSize(500,500);
        t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        t.show();
    }
}
