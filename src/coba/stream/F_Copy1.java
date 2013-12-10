/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coba.stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author made
 */
public class F_Copy1 {
    public static void main(String[] args) throws IOException {
        String fileinput="streamfile/Copy1.java";
        String fileoutput="streamfile/Output.txt";
        
        FileInputStream inFile=new FileInputStream(fileinput);
        FileOutputStream outFile=new FileOutputStream(fileoutput);
        
        BufferedInputStream inBuffer=new BufferedInputStream(inFile);
        BufferedOutputStream outBuffer=new BufferedOutputStream(outFile);
        
        byte buffer[]=new byte[3000];
        
        inBuffer.read(buffer);
        outBuffer.write(buffer);
        
        inFile.close();
        outFile.close();
        
        System.out.println("File "+fileinput+" sukses dicopy ke file "+fileoutput);
    }
}
