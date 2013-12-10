/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coba.coba_3;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.beans.PropertyVetoException;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingUtilities;

/**
 *
 * @author made
 */
public class JInternalFrameDemo {
    JDesktopPane jdpdesktop;
    static int openFrameCount=0;

    public JInternalFrameDemo() {
        JFrame frame=new JFrame("JInternalFrame Usage Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jdpdesktop=new JDesktopPane(){
            public Dimension getPreferredSize(){
                return new Dimension(600,600);
            }
        };
        createFrame(); //create first windows
        frame.setContentPane(jdpdesktop);
        frame.setJMenuBar(createMenuBar());
        jdpdesktop.putClientProperty("JDesktopPane.dragMode", "Outline");
        frame.pack();
        frame.setVisible(true);
    }

    private void createFrame() {
        MyInternalFrame frame=new MyInternalFrame();
        frame.setVisible(true);
        //every JINternalFrame must be added to content pane using JDesktopPanel
        jdpdesktop.add(frame);
        try{
            frame.setSelected(true);
            
        }
        catch(java.beans.PropertyVetoException e){
        }
    }   

    protected JMenuBar createMenuBar() {
        JMenuBar menubar=new JMenuBar();
        JMenu menu=new JMenu("Frame");
        menu.setMnemonic(KeyEvent.VK_N);
        JMenuItem menuitem=new JMenuItem("New IFrame");
        menuitem.setMnemonic(KeyEvent.VK_N);
        menuitem.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                createFrame();
            }
        });
        menu.add(menuitem);
        menubar.add(menu);
        return menubar;
    }    
    private class MyInternalFrame extends JInternalFrame{
        static final int xPosition=30, yPosition=30;

        public MyInternalFrame() {
            super("IFrame #"+(++openFrameCount), true, //resizeable
                    true, //closeable
                    true, //maximizable
                    true); //iconifiable
            setSize(300,300);
            //set the window's location
            setLocation(xPosition*openFrameCount, yPosition*openFrameCount);
        }
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                new JInternalFrameDemo();
            }
        });
    }
}
