package coba.stream;

import java.io.Serializable;

public class DataSiswa implements Serializable {

    private String nama, jawaban;

    public DataSiswa() {
    }
    
    
    public DataSiswa(String jawaban) {
        this.jawaban = jawaban;
    }

    public DataSiswa(String nama, String jawaban) {
        this.nama = nama;
        this.jawaban = jawaban;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJawaban() {
        return jawaban;
    }

    public void setJawaban(String jawaban) {
        this.jawaban = jawaban;
    }
}
