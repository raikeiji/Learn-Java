//program cobacoba menggunakan submenu dengan tambahan icon-icon
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
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;

/**
 *
 * @author made
 */
public class SimpleSubMenu_5 extends JFrame{

    public SimpleSubMenu_5() {
        initUI();
    }

    private void initUI() {
        JMenuBar menubar=new JMenuBar();
        ImageIcon iconNew=new ImageIcon("image/new.png");
        ImageIcon iconOpen=new ImageIcon("image/open.png");
        ImageIcon iconSave=new ImageIcon("image/save.png");
        ImageIcon iconExit=new ImageIcon("image/exit.png");
       // ImageIcon iconimport=new ImageIcon("image/download.png");
        
        JMenu file=new JMenu("File");
        file.setMnemonic(KeyEvent.VK_F);
        
        JMenu imp=new JMenu("Import");
        imp.setMnemonic(KeyEvent.VK_M);
        
        
        JMenuItem newsf=new JMenuItem("Import newsfeed list...");
        JMenuItem bookm=new JMenuItem("Import bookmarks...");
        JMenuItem mail=new JMenuItem("Import mail...");
        
        imp.add(newsf);
        imp.add(bookm);
        imp.add(mail);
        
        JMenuItem filenew=new JMenuItem("New", iconNew);
        filenew.setMnemonic(KeyEvent.VK_N);
        
        JMenuItem fileopen=new JMenuItem("Open", iconOpen);
        fileopen.setMnemonic(KeyEvent.VK_O);
        
        JMenuItem filesave=new JMenuItem("save", iconSave);
        filesave.setMnemonic(KeyEvent.VK_S);
        
        JMenuItem fileexit=new JMenuItem("exit", iconExit);
        fileexit.setMnemonic(KeyEvent.VK_E);
        fileexit.setToolTipText("Exit Apllication");
        fileexit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W
                , ActionEvent.CTRL_MASK));
        
        fileexit.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });
        file.add(filenew);
        file.add(fileopen);
        file.add(filesave);
        file.addSeparator();
        file.add(imp);
        file.addSeparator();
        file.add(fileexit);
        
        menubar.add(file);
        
        setJMenuBar(menubar);
        
        setTitle("SubMenu cobacoba");
        setSize(360,250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                SimpleSubMenu_5 ex=new SimpleSubMenu_5();
                ex.setVisible(true);
            }
        });
    }
    
}
