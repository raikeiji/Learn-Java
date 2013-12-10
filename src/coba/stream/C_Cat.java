/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coba.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author made
 */
public class C_Cat {

    public static void main(String[] args) throws IOException {
        File inputfile = new File("streamfile/Input.txt");

        FileInputStream in = new FileInputStream(inputfile);
        int c;
        while ((c = in.read()) != -1) {
            System.out.print((char) c);
        }
        System.out.println("");
        in.close();
    }
}
