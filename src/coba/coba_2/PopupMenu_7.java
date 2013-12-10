//popupmenu masih belum jalan
//silahkan mencari tutorial lain
package coba.coba_2;

import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.SwingUtilities;

/**
 *
 * @author made
 */
public class PopupMenu_7 extends JFrame{
    private JPopupMenu menu;
    private Toolkit toolkit;

    public PopupMenu_7(String title) {
        super(title);
        this.initUI();
    }

    private void initUI() {
        toolkit=this.getToolkit();
        menu=new JPopupMenu();
        JMenuItem menuItemBeep=new JMenuItem("Beep");
        
        menuItemBeep.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                toolkit.beep();
            }
        });
        menu.add(menuItemBeep);
        
        JMenuItem menuItemClose=new JMenuItem("Close");
        menuItemClose.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });
        menu.add(menuItemClose);
        this.addMouseListener(new MouseAdapter() {
        public void mouseReleased(MouseEvent e){
            if (e.getButton()==MouseEvent.BUTTON3){
                menu.show(e.getComponent(), e.getX(), e.getY());
            }
        }
        
        });
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(250,200);
        this.setLocationRelativeTo(null);
    }
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                PopupMenu_7 pm=new PopupMenu_7("JPopupMenu");
                pm.setVisible(true);
            }
        });
    }
}
