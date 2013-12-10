// program yang menjalankan perintah exit / close
package coba.coba_2;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author made
 */
public class QuitButtonExample_2 extends JFrame{

    public QuitButtonExample_2(){
        initUI();
    }

    private void initUI() {
        JPanel panel=new JPanel();
        getContentPane().add(panel);
        
        panel.setLayout(null);
        
        JButton quitButton=new JButton("Quit");
        quitButton.setBounds(50, 60, 80, 30);
        
        quitButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent event) {
                System.exit(0);
            }
        });
        panel.add(quitButton);
        
        setTitle("Quit button");
        setSize(300,200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
               
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                QuitButtonExample_2 ex=new QuitButtonExample_2();
                ex.setVisible(true);
            }
        });
    }
    
}
