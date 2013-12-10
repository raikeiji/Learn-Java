//contoh program membuat sebuh menu dengan menggunakan tombol
// dan memberikan sebuah perintah pada program dengan memberi masukkan tombol keyboard
package coba.coba_2;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingUtilities;

/**
 *
 * @author made
 */
public class SimpleMenu_4 extends JFrame{

    public SimpleMenu_4() {
        initUI();
    }

    private void initUI() {
        JMenuBar menubar=new JMenuBar();
        ImageIcon icon=new ImageIcon("exit.png");
        //ImageIcon icon=new ImageIcon();
        JMenu file=new JMenu("File");
        file.setMnemonic(KeyEvent.VK_F);
        
        JMenuItem eMenuItem=new JMenuItem("Exit",icon);
        eMenuItem.setMnemonic(KeyEvent.VK_E);
        eMenuItem.setToolTipText("Exit Application");
        eMenuItem.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });
        
        file.add(eMenuItem);
        
        menubar.add(file);
        
        setJMenuBar(menubar);
        
        setTitle("Simple Menu");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
  
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                SimpleMenu_4 ex=new SimpleMenu_4();
                ex.setVisible(true);
            }
        });
    }
}
