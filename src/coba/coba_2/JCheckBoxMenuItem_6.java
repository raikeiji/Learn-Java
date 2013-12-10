/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coba.coba_2;

import java.awt.BorderLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.BorderFactory;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.SwingUtilities;
import javax.swing.border.EtchedBorder;

/**
 *
 * @author made
 */
public class JCheckBoxMenuItem_6 extends JFrame{
    private JLabel statusbar;

    public JCheckBoxMenuItem_6() {
        initUI();
    }

    private void initUI() {
        JMenuBar menubar=new JMenuBar();
        JMenu file=new JMenu("File");
        file.setMnemonic(KeyEvent.VK_F);
        
        JMenu view=new JMenu("View");
        view.setMnemonic(KeyEvent.VK_V);
        
        JCheckBoxMenuItem sbar=new JCheckBoxMenuItem("Show StatusBar");
        sbar.setState(true);
        
        sbar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                if (statusbar.isVisible()){
                    statusbar.setVisible(false);
                }
                else{
                    statusbar.setVisible(true);
                }
            }
        });
        
        view.add(sbar);
        menubar.add(file);
        menubar.add(view);
        
        setJMenuBar(menubar);
        
        statusbar=new JLabel("Statusbar");
        statusbar.setBorder(BorderFactory.createEtchedBorder(
                EtchedBorder.RAISED));
        add(statusbar, BorderLayout.SOUTH);
        
        setTitle("JcheckBoxMenuItem");
        setSize(360, 270);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                JCheckBoxMenuItem_6 ex=new JCheckBoxMenuItem_6();
                ex.setVisible(true);
            }
        });
    }
    
}
