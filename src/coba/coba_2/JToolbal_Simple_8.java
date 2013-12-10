/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coba.coba_2;

import java.awt.BorderLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JToolBar;
import javax.swing.SwingUtilities;

/**
 *
 * @author made
 */
public class JToolbal_Simple_8 extends JFrame{

    public JToolbal_Simple_8() {
        initUI();
    }

    private void initUI() {
        JMenuBar menubar=new JMenuBar();
        JMenu file=new JMenu("File");
        menubar.add(file);
        setJMenuBar(menubar);
        
        JToolBar toolbar=new JToolBar();
        
        ImageIcon icon=new ImageIcon("image/exit.png");
        
        JButton exitbutton=new JButton(icon);
        toolbar.add(exitbutton);
        exitbutton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });
        
        add(toolbar, BorderLayout.NORTH);
        
        setTitle("Simple toolbar");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                JToolbal_Simple_8 ex=new JToolbal_Simple_8();
                ex.setVisible(true);
            }
        });
    }
    
}
