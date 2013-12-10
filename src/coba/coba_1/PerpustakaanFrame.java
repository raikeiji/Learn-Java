/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coba.coba_1;

import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author made
 */
public class PerpustakaanFrame extends JFrame implements ActionListener{
    private JMenuBar bar;
    private JMenu arsip;
    private JMenu other;
    private JMenuItem arsiplain, exit;
    private JMenuItem tambahbuku;
    private JMenuItem tambahcd;
    private JMenuItem tambahmajalah;

    public PerpustakaanFrame() {
    this.setTitle("Perpustakaanku");
    this.setSize(1000, 500);
    this.setLocationRelativeTo(null);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    bar=new JMenuBar();
    arsip=new JMenu("Arsip Buku");
    arsip.setMnemonic(KeyEvent.VK_A);
    other=new JMenu("Barang lain ");
    tambahbuku=new JMenuItem("Bagian Buku");
    tambahcd=new JMenuItem("Bagian CD");
    tambahmajalah=new JMenuItem("Bagian Majalah");
    arsiplain=new JMenuItem("Buka Arsip");
    exit=new JMenuItem("exit");
    other.add(tambahbuku);
    other.add(tambahcd);
    other.add(tambahmajalah);
    arsip.add(arsiplain);
    arsip.add(exit);
    bar.add(arsip);
    bar.add(other);
    arsiplain.addActionListener(this);
    exit.addActionListener(this);
    tambahbuku.addActionListener(this);
    tambahcd.addActionListener(this);
    tambahmajalah.addActionListener(this);
    this.setJMenuBar(bar);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==arsiplain){
            Arsip ar=new Arsip();
            ar.setVisible(true);
        }       
        else if (ae.getSource()==tambahbuku){
            Buku bu=new Buku();
            bu.setVisible(true);
            
        }
        else if (ae.getSource()==tambahcd){
            CD cd=new CD();
            cd.setVisible(true);
        }
        else if (ae.getSource()==tambahmajalah){
            Majalah ma=new Majalah();
            ma.setVisible(true);
        }
        else if (ae.getSource()==exit){
            //this.dispose();
            System.exit(0);
        }
    }
    
}
