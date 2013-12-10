/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coba.coba_1;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author made
 */
public class Buku extends JDialog implements ActionListener{
    private JLabel teballabel,isbnlabel, pengaranglabel;
    private JTextField tebalfield, isbnfield,pengarangfield;
    JButton simpan, keluar, reset;
    public Buku() {
    this.setTitle("Keterangan Buku");
    this.setLayout(new GridLayout(6,2));
    this.setLocationRelativeTo(null);
    this.setSize(400, 200);
    teballabel=new JLabel("Tebal Buku");
    isbnlabel=new JLabel("ISBN");
    pengaranglabel=new JLabel("Pengarang");
    tebalfield=new JTextField();
    isbnfield=new JTextField();
    pengarangfield=new JTextField();
    simpan=new JButton("simpan");
    simpan.addActionListener(this);
    reset=new JButton("reset");
    reset.addActionListener(this);
    keluar=new JButton("keluar");
    keluar.addActionListener(this);
    this.add(teballabel);
    this.add(tebalfield);   
    this.add(isbnlabel);
    this.add(isbnfield);
    this.add(pengaranglabel);
    this.add(pengarangfield);
    this.add(simpan);
    this.add(keluar);
    this.add(reset);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource()==reset){
            tebalfield.setText(" ");
            isbnfield.setText(" ");
            pengarangfield.setText(" ");
        }
        else if (ae.getSource()==keluar){
            this.dispose();
        }else if(ae.getSource()==simpan){
            JOptionPane.showMessageDialog(null, "Tebal Buku "+tebalfield.getText()
                    +"\nISBN"+isbnfield.getText()+"\nPengarang"
                    +pengarangfield.getText(),"Keterangan Buku"
                    ,JOptionPane.PLAIN_MESSAGE);
        }
    }
}
