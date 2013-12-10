/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coba.coba_3;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.beans.PropertyVetoException;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import sun.tools.jar.resources.jar;

/**
 *
 * @author made
 */
public class InternalTest extends JFrame{
    JInternalFrame f;
    public static void main(String[] args) {
        new InternalTest();
    }

    public InternalTest(){
        JDesktopPane dp=new JDesktopPane();
        setContentPane(dp);
        f=new JInternalFrame("test", true, true, true, true);
        JPanel p=new JPanel();
        JButton close=new JButton("Close Me!");
        close.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                try{
                    f.setClosed(true);
                }
                catch(PropertyVetoException x){
                    System.err.println("Close Exception!");
                }
            }
        });
        p.add(close);
        f.getContentPane().add(p);
        dp.add(f);
        f.setBounds(10,10,180,100);
        f.setVisible(true);
        setSize(400,400);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowAdapter e){
                System.exit(0);
            }
        });
        setVisible(true);
    }
    
}
