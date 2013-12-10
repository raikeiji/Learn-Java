/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coba.coba_1;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.*;

/**
 *
 * @author made
 */
public class Arsip extends JDialog implements ActionListener{
    private JLabel id_koleksilabel;
    private JTextField id_koleksifield;
    private JLabel judullabel;
    private JTextField judulfield;
    private JLabel penerbitlabel;
    private JComboBox penerbitcombo;
    private JLabel tahunlebel;
    private JList tahunlist;
    String daftarpenerbit[]={"Erlangga","Intan Pariwara","Tiga Serangkai"};
    String daftartahun[]={"1991","1992","1993","1994"};
    JButton reset, simpan, keluar;
    
    public Arsip() {
    this.setTitle("Arsip");
    this.setSize(400, 200);
    this.setLocationRelativeTo(null);
    this.setLayout(new GridLayout(6, 2));
    id_koleksilabel=new JLabel("ID Koleksi");
    judullabel=new JLabel("Judul");
    penerbitlabel=new JLabel("Penerbit");
    tahunlebel=new JLabel("Tahun");
    reset=new JButton("Reset");
    reset.addActionListener(this);
    simpan=new JButton("simpan");
    simpan.addActionListener(this);
    keluar=new JButton("keluar");
    keluar.addActionListener(this);
    id_koleksifield=new JTextField();
    judulfield=new JTextField();
    penerbitcombo=new JComboBox(daftarpenerbit);
    tahunlist=new JList(daftartahun);
    JScrollPane jsp=new JScrollPane(tahunlist);
    this.add(id_koleksilabel);
    this.add(id_koleksifield);
    this.add(judullabel);
    this.add(judulfield);
    this.add(penerbitlabel);
    this.add(penerbitcombo);
    this.add(tahunlebel);
    this.add(jsp);
    this.add(reset);
    this.add(simpan);
    this.add(keluar);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource()==reset){
            id_koleksifield.setText(" ");
            judulfield.setText(" ");
            
        }
        else if (ae.getSource()==simpan){
            JOptionPane.showMessageDialog(null, "ID Koleksi  : "+id_koleksifield.getText()
                                                +"\nJudul: "+judulfield.getText());
//            for (int i = 0; i < daftarpenerbit.length; i++) {
//                if (daftarpenerbit[i]==penerbitcombo){
//                    JOptionPane.showMessageDialog(null, "Penerbit : "+daftarpenerbit[i]);
//                }
//                
//                
//            }
//            for (int i = 0; i < daftartahun.length; i++) {
//                JOptionPane.showMessageDialog(null, "Tahun : "+daftartahun[i]);
//                
//            }
            
        }
        else if(ae.getSource()==keluar){
            JOptionPane.showMessageDialog(null,
    "Anda telah keluar dari Arsip Buku",
    "Pesan",
    JOptionPane.PLAIN_MESSAGE);
            this.dispose();
        }
    }
}
