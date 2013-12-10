/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coba.stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author made */
public class Penilaian_Siswa_Stream {

    public static void main(String[] args) throws IOException {
        File fileoutput = new File("streamfile/damn.java");
        FileOutputStream outFile = new FileOutputStream(fileoutput);
        DataOutputStream out = new DataOutputStream(new BufferedOutputStream(outFile));

        String[] kunci_jawaban = {"F", "T", "F", "T", "F", "T", "F", "T", "F", "T", "F", "T", "F", "T", "F"};
        String[] Jawaban_Joe_Jones = {"T", "F", "T", "F", "T", "F", "T", "F", "T", "T", "T", "F", "F", "F", "T"};
        String[] Jawaban_Janet_Jerome = {"T", "F", "T", "F", "T", "F", "T", "F", "T", "T", "T", "F", "F", "F", "F"};
        String[] Jawaban_Jeff_Jubilee = {"T", "F", "T", "F", "T", "F", "T", "F", "T", "T", "T", "F", "F", "F", "T"};

        for (int i = 0; i < kunci_jawaban.length; i++) {
            out.writeChars(kunci_jawaban[i]);
            out.writeChar('\t');
            out.writeChars(Jawaban_Joe_Jones[i]);
            out.writeChar('\t');
            out.writeChars(Jawaban_Janet_Jerome[i]);
            out.writeChar('\t');
            out.writeChars(Jawaban_Jeff_Jubilee[i]);
            out.writeChar('\n');
        }
        out.close();
        //read it in again
//        String fileinput = "streamfile/damn.java";
//        FileInputStream inFile = new FileInputStream(fileinput);
//        DataInputStream in = new DataInputStream(new BufferedInputStream(inFile));
//
//        //DataInputStream in = new DataInputStream(new FileInputStream("streamfile/a.txt"));
//
//        int jojo = 0, jaje = 0, jeju = 0;
//        int totaljojo = 0, totaljaje = 0, totaljeju = 0;
//
//        StringBuffer desc;
//        int total = 0;
//        // try {
//        char chr;
//        desc = new StringBuffer(20);
//        for (int j = 0; j < kunci_jawaban.length; j++) {
//            if (kunci_jawaban[j] == Jawaban_Joe_Jones[j]) {
//                jojo++;
//                totaljojo = totaljojo + jojo;
//            }
//            if (kunci_jawaban[j] == Jawaban_Janet_Jerome[j]) {
//                jaje++;
//                totaljaje = totaljaje + jaje;
//            }
//            if (kunci_jawaban[j] == Jawaban_Jeff_Jubilee[j]) {
//                jeju++;
//                totaljeju = totaljeju + jeju;
//            }
//        }
////        } catch (EOFException e) {
////        }
//        System.out.println("Jumlah jawaban Joe Jones yang benar    : " + totaljojo);
//        System.out.println("Jumlah jawaban Janet Jerome yang benar : " + totaljaje);
//        System.out.println("Jumlah jawaban Jeff Jubilee yang benar : " + totaljeju);
//        out.close();
    }
}
