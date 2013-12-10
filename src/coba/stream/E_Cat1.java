/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coba.stream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author made
 */
public class E_Cat1 {
    public static void main(String[] args) throws IOException {
        FileInputStream myfile=new FileInputStream("streamfile/Input.txt");
        BufferedInputStream myStreambuffer=new BufferedInputStream(myfile);
        byte buffer[]=new byte[3000];
        int bufsize=0;
        bufsize=myStreambuffer.read(buffer);
        myfile.close();
        String s=new String(buffer,0,bufsize);
        System.out.println(s);
    }
}
