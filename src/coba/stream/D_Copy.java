/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coba.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author made
 */
public class D_Copy {
    public static void main(String[] args) throws IOException {
        String fileinput="streamfile/Copy.java";
        String fileoutput="streamfile/Output.txt";
        FileInputStream inFile=new FileInputStream(fileinput);
        FileOutputStream outFile=new FileOutputStream(fileoutput);
        int c;
        while ((c=inFile.read())!=-1){
            outFile.write(c);
        }
        inFile.close();
        outFile.close();
        System.out.println("File "+fileinput+" sukses di copy ke file "+fileoutput);
    }
}
