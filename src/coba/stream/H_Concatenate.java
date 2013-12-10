/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coba.stream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

/**
 *
 * @author made
 */
public class H_Concatenate {

    public static void main(String[] args) throws IOException {
        SequenceInputStream instream;
        FileInputStream f1 = new FileInputStream("streamfile/Cat.java");
        FileInputStream f2 = new FileInputStream("streamfile/Cat1.java");

        instream = new SequenceInputStream(f1, f2);
        boolean eof = false;
        int byteCount = 0;

        while (!eof) {
            int c = instream.read();
            if (c == -1) {
                eof = true;
            }
            else{
                System.out.println((char)c);
                byteCount++;
            }
        }
        System.out.println(byteCount+"byte were read");
        instream.close();
        f1.close();
        f2.close();
    }
}
