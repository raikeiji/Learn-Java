//program cobacoba menggunakan submenu dengan tambahan icon-icon, toolbar
package coba.coba_2;

import java.awt.BorderLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;
import javax.swing.border.EtchedBorder;

/**
 *
 * @author Rai Keiji
 */
//JMenuItem < JMenu < JMenuBar
//imageicon < JButton < JToolBar < Panel
public class Jajal extends JFrame{
private JLabel statusbar;
    public Jajal() {
        initUI();
    }

    private void initUI() {
        JToolBar toolbar1=new JToolBar();
        JToolBar toolbar2=new JToolBar();
        
        JPanel panel=new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        //show vertically
        JMenuBar menubar=new JMenuBar();
        //<editor-fold defaultstate="collapsed" desc="imageicon">
        ImageIcon iconNew=new ImageIcon("image/new.png");
        ImageIcon iconOpen=new ImageIcon("image/open.png");
        ImageIcon iconSave=new ImageIcon("image/save.png");
        ImageIcon iconExit=new ImageIcon("image/exit.png");
        //</editor-fold>
       // ImageIcon iconimport=new ImageIcon("image/download.png");
        
        //<editor-fold defaultstate="collapsed" desc="JMenu">
        JMenu file=new JMenu("File");
        file.setMnemonic(KeyEvent.VK_F);
        JMenu view=new JMenu("View");
        view.setMnemonic(KeyEvent.VK_V);
        JMenu imp=new JMenu("Import");
        imp.setMnemonic(KeyEvent.VK_M);
        //</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc="JButton">
        
        JButton newb=new JButton(iconNew);
        JButton openb=new JButton(iconOpen);
        JButton saveb=new JButton(iconSave);
        JButton exitb=new JButton(iconExit);
        //</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc="implement toolbar">
        toolbar1.add(newb);
        toolbar1.add(openb);
        toolbar1.add(saveb);
        toolbar1.setAlignmentX(0); //The toolbar is left aligned.
        
        toolbar2.add(exitb);
        toolbar2.setAlignmentX(0);
        exitb.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });
        //</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc="JCheckBox">
        JCheckBoxMenuItem sbar=new JCheckBoxMenuItem("Show statusbar");
        sbar.setState(true);
        sbar.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (statusbar.isVisible()){
                    statusbar.setVisible(false);
                }
                else{
                    statusbar.setVisible(true);
                }
            }
        });
        //</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc="JMenuItem for Imp">
        JMenuItem newsf=new JMenuItem("Import newsfeed list...");
        JMenuItem bookm=new JMenuItem("Import bookmarks...");
        JMenuItem mail=new JMenuItem("Import mail...");
        
        imp.add(newsf);
        imp.add(bookm);
        imp.add(mail);
        //</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc="JManuItem for file">
        JMenuItem filenew=new JMenuItem("New", iconNew);
        filenew.setMnemonic(KeyEvent.VK_N);
        filenew.setToolTipText("Make a new file");
        
        JMenuItem fileopen=new JMenuItem("Open", iconOpen);
        fileopen.setMnemonic(KeyEvent.VK_O);
        fileopen.setToolTipText("Open a file in directory");
        
        JMenuItem filesave=new JMenuItem("save", iconSave);
        filesave.setMnemonic(KeyEvent.VK_S);
        filesave.setToolTipText("Save a file");
        
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
        //</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc="implement file and view in menubar">
        file.add(filenew);
        file.add(fileopen);
        file.add(filesave);
        file.addSeparator();
        file.add(imp);
        file.addSeparator();
        file.add(fileexit);
        view.add(sbar);
        menubar.add(file);
        menubar.add(view);
        //</editor-fold>
        panel.add(toolbar1);
        panel.add(toolbar2);
        add(panel, BorderLayout.NORTH);
        
        setJMenuBar(menubar);
        
        statusbar=new JLabel("StatusBar");
        statusbar.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED));
        add(statusbar, BorderLayout.SOUTH);
        setTitle("Rancangan Program");
        setSize(400,200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    //<editor-fold defaultstate="collapsed" desc="main program">
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            
            @Override
            public void run() {
                Jajal ex=new Jajal();
                ex.setVisible(true);
            }
        });
        //</editor-fold>
    }
}
