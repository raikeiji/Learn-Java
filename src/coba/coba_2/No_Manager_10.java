/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coba.coba_2;

import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author made
 */
public class No_Manager_10 extends JFrame{

    public No_Manager_10(){
        initUI();
    }

    private void initUI() {
        setLayout(null);
        JButton ok=new JButton("OK");
        ok.setBounds(50,50,80,25);
        
        JButton close=new JButton("Close");
        close.setBounds(150, 50, 80, 25);
        
        add(ok);
        add(close);
        
        setTitle("Absolutely Positioning");
        setSize(300, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                No_Manager_10 n=new No_Manager_10();
                n.setVisible(true);
            }
        });
    }
}
