/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coba.coba_2;

import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author made
 */
public class GridLayout_12 extends JFrame{

    public GridLayout_12(){
        initUI();
    }

    private void initUI() {
        JPanel panel=new JPanel();
        
        panel.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        panel.setLayout(new GridLayout(5,4));
        
        String[] buttons={
         "Cls", "Bck", "", "Close", "7", "8", "9", "/", "4",
            "5", "6", "*", "1", "2", "3", "-", "0", ".", "=", "+"};
        for (int i = 0; i < buttons.length; i++) {
            if(i==2){
                panel.add(new JLabel(buttons[i]));
            }
            else{
                panel.add(new JButton(buttons[i]));
            }
            
        }
        add(panel);
        setTitle("GridLayout");
        setSize(350,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                GridLayout_12 g=new GridLayout_12();
                g.setVisible(true);
            }
        });
    }
    
}
