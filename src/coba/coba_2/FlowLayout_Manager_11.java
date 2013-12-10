/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coba.coba_2;

import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTree;
import javax.swing.SwingUtilities;

/**
 *
 * @author made
 */
public class FlowLayout_Manager_11 extends JFrame{

    public FlowLayout_Manager_11() {
        initUI();
    }

    private void initUI() {
        JPanel panel=new JPanel();
        
        JTextArea area=new JTextArea("Text Area");
        area.setPreferredSize(new Dimension(100,100));
        
        JButton button=new JButton("Button");
        panel.add(button);
        
        JTree tree=new JTree();
        panel.add(tree);
        
        panel.add(area);
        
        add(panel);
        
        pack();
        
        setTitle("FlowLayout Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                FlowLayout_Manager_11 f=new FlowLayout_Manager_11();
                f.setVisible(true);
            }
        });
    }
    
}
