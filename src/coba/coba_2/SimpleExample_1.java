//berikut merupakan program simpel
package coba.coba_2;

import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author made
 */
public class SimpleExample_1 extends JFrame{

    public SimpleExample_1() {
        setTitle("simple example");
        setSize(300,200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                SimpleExample_1 ex=new SimpleExample_1();
                ex.setVisible(true);
            }
        });
    }
    
}
