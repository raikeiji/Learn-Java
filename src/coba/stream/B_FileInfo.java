/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coba.stream;

import java.io.File;

/**
 *
 * @author made
 */
public class B_FileInfo {
    public static void main(String[] args) {
        String fileName="B_FileInfo.java";
        File file=new File(fileName);
        //periksa apakah file ada atau tidak
        if(file.exists()){
            //menampilkan sejumlah informasi file
            System.out.println("File Name   : "+file.getName());
            System.out.println("Path        : "+file.getPath());
            System.out.println("Abs.Path    : "+file.getAbsolutePath());
            System.out.println("Writable    : "+file.canWrite());
            System.out.println("Readable    : "+file.canRead());
            System.out.println("lenght      : "+(file.length())+"Byte");
        }
        System.out.println("Sorry, file "+fileName+" not found");
    }
}
