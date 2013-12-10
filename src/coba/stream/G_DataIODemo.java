/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coba.stream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author made */
public class G_DataIODemo {

    public static void main(String[] args) throws IOException {
        //write the data output
        DataOutputStream out = new DataOutputStream(new FileOutputStream("streamfile/a.txt"));

        double[] prices = {19.99, 9.99, 15.99, 3.99, 4.99};
        int[] units = {12, 8, 13, 29, 50};
        String[] descs = {"Java T-Shirt", "Java Mug", "Duke Juggling Dolls", "Java Pin", "Java Key Chain"};
        
        for (int i = 0; i < prices.length; i++) {
            out.writeDouble(prices[i]);
            out.writeChar('\n');
            out.writeInt(units[i]);
            out.writeChar('\n');
            out.writeChars(descs[i]);
            out.writeChar('\n');
        }
        out.close();
        //read it in again
        DataInputStream in=new DataInputStream(new FileInputStream("streamfile/a.txt"));
        
        double price;
        int unit;
        StringBuffer desc;
        double total=0.0;
        try{
            price=in.readDouble();
            in.readChar();
            unit=in.readInt();
            in.readChar();
            char chr;
            desc=new StringBuffer(20);
            while((chr=in.readChar())!='\t'){
                desc.append(chr);
                System.out.println("You've order "+unit+" units of "+desc+"at $"+price);
                total=total+unit+price;
            }
        }catch(EOFException e){
            
        }
        System.out.println("For a TOTAL of : $"+total);
        in.close();
    }
}
