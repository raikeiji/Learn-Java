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
public class CD extends JDialog implements ActionListener{
    JLabel isbnlabel, jumlah_halLabel;
    JTextField isbnField,jumlah_halField;
    JButton simpan, keluar, reset;
    public CD() {
        this.setTitle("Keterangan CD");
        this.setLayout(new GridLayout(5, 2));
        this.setLocationRelativeTo(null);
        this.setSize(400, 200);
        isbnlabel=new JLabel("ISBN");
        isbnField=new JTextField();
        jumlah_halLabel=new JLabel("Jumlah Halaman");
        jumlah_halField=new JTextField();
        simpan=new JButton("simpan");
        simpan.addActionListener(this);
        keluar=new JButton("keluar");
        keluar.addActionListener(this);
        reset=new JButton("reset");
        reset.addActionListener(this);
        this.add(isbnlabel);
        this.add(isbnField);
        this.add(jumlah_halLabel);
        this.add(jumlah_halField);
        this.add(simpan);
    this.add(keluar);
    this.add(reset);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==simpan){
            JOptionPane.showMessageDialog(null, "ISBN"+isbnField.getText()
                    +"Jumlah Halaman "+jumlah_halField.getText(), "Keterangan CD"
                    , JOptionPane.PLAIN_MESSAGE);
        }
        else if(ae.getSource()==keluar){
            this.dispose();
        }
        else if (ae.getSource()==reset){
            isbnField.setText(" ");
            jumlah_halField.setText(" ");
        }
    }
}
