/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coba;

import java.awt.Dimension;
import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

/**
 *
 * @author made
 */
public class HelloFrame6 extends JFrame{
    String languages[] ={"Java", "Perl","Phyton","C++","Basic","C#"};

    public HelloFrame6() {
    this.setSize(1000,500);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setTitle("Hello World");
    
    JPanel jp=new JPanel();
    JList jlist=new JList(languages);
    JScrollPane jsp=new JScrollPane(jlist);
    jsp.setPreferredSize(new Dimension(100,74));
    jlist.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    jp.add(jsp);
    this.add(jp);
    this.setVisible(true);
    }
    public static void main(String[] args) {
        HelloFrame6 hf=new HelloFrame6();
    }
}
