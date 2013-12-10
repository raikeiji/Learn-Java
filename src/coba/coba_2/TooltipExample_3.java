// program yang menjelaskan tentang pemberian tombol
package coba.coba_2;

import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author made
 */
public class TooltipExample_3 extends JFrame{

    public TooltipExample_3() {
        initUI();
        
    }

    private void initUI() {
        JPanel panel=new JPanel();
        getContentPane().add(panel);
        
        panel.setLayout(null);
        panel.setToolTipText("A Panel Container");
        
        JButton btn=new JButton("Button");
        btn.setBounds(100, 60, 100, 30);
        btn.setToolTipText("A Button Component");
        
        panel.add(btn);
        
        setTitle("Tooltip");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                TooltipExample_3 ex=new TooltipExample_3();
                ex.setVisible(true);
            }
        });
    }
    
}
