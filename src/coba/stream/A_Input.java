/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coba.stream;

import java.io.IOException;

/**
 *
 * @author made
 */
public class A_Input {
    public static void main(String[] args ) throws IOException {
        char i;
        System.out.println("Masukkan Karakter : ");
        i=(char)System.in.read();
        System.out.println("Anda memasukkan : "+i);
    }
}
