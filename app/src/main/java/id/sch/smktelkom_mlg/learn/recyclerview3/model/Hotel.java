package id.sch.smktelkom_mlg.learn.recyclerview3.model;

import java.io.Serializable;

/**
 * Created by SMK Telkom SP Malang on 11/4/2016.
 */

public class Hotel implements Serializable {
    public String judul;
    public String deskripsi;
    public String foto;
    public String detail;
    public String lokasi;

    public Hotel(String judul, String deskripsi, String detail, String lokasi, String foto) {
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.detail = detail;
        this.lokasi = lokasi;
        this.foto = foto;
    }
}
