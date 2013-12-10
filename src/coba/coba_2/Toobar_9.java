//contoh program menggunakan toolbar
//berikut ulasan 
//imageicon < JButton < JToolBar < Panel
package coba.coba_2;

import java.awt.BorderLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.SwingUtilities;

/**
 *
 * @author made
 */
public class Toobar_9 extends JFrame{

    public Toobar_9() {
        initUI();
    }

    private void initUI() {
        JToolBar toolbar1=new JToolBar();
        JToolBar toolbar2=new JToolBar();
        
        JPanel panel=new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        
        ImageIcon newi=new ImageIcon("image/new.png");
        ImageIcon open=new ImageIcon("image/open.png");
        ImageIcon save=new ImageIcon("image/save.png");
        ImageIcon exit=new ImageIcon("image/exit.png");
        
        JButton newb=new JButton(newi);
        JButton openb=new JButton(open);
        JButton saveb=new JButton(save);
        
        toolbar1.add(newb);
        toolbar1.add(openb);
        toolbar1.add(saveb);
        toolbar1.setAlignmentX(0); //The toolbar is left aligned. 
        
        JButton exitb=new JButton(exit);
        toolbar2.add(exitb);
        toolbar2.setAlignmentX(0);
        
        exitb.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });
        
        panel.add(toolbar1);
        panel.add(toolbar2);
        
        add(panel, BorderLayout.NORTH);
        
        setTitle("Toolbars");
        setSize(360, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                Toobar_9 ex=new Toobar_9();
                ex.setVisible(true);
            }
        });
    }
    
}
