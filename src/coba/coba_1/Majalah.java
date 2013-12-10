/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coba.coba_1;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author made
 */
public class Majalah extends JDialog implements ActionListener{
    private JLabel ISSNJLabel, volumeJLabel, seriLabel;
    private JTextField ISSNField, volumeField,seriField;
    private JButton simpan, keluar, reset;
    public Majalah() {
        this.setTitle("Keterangan Majalah");
        this.setSize(400, 200);
        this.setLocationRelativeTo(null);
        this.setLayout(new GridLayout(6, 2));
        ISSNJLabel=new JLabel("ISSN");
        volumeJLabel=new JLabel("Volume");
        seriLabel=new JLabel("Seri");
        ISSNField=new JTextField();
        volumeField=new JTextField();
        seriField=new JTextField();
        simpan=new JButton("simpan");
        simpan.addActionListener(this);
        keluar=new JButton("keluar");
        keluar.addActionListener(this);
        reset=new JButton("reset");
        reset.addActionListener(this);
        this.add(ISSNJLabel);
        this.add(ISSNField);
        this.add(volumeJLabel);
        this.add(volumeField);
        this.add(seriLabel);
        this.add(seriField);
        this.add(simpan);
    this.add(keluar);
    this.add(reset);
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource()==simpan){
            JOptionPane.showMessageDialog(null, "ISSN"+ISSNField.getText()
                    +"Volume"+volumeField.getText()
                    +"Seri"+seriField.getText(), "Keterangan Majalah", 
                    JOptionPane.PLAIN_MESSAGE);
        }
        else if (ae.getSource()==keluar){
            this.dispose();
        }
        else if (ae.getSource()==reset){
            ISSNField.setText(" ");
            volumeField.setText(" ");
            seriField.setText("");
        }
    }
}
