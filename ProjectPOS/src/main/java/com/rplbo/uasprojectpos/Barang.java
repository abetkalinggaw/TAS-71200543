package com.rplbo.uasprojectpos;

public class Barang {
    private String kode;
    private int stok;
    private static int nextNum = 1;
    private String nama;
    private long harga;

    public Barang(String nama, int stok, long harga) {
        this.stok = stok;
        this.nama = nama;
        this.harga = harga;
        String[] names = nama.split(" ");
        for (int j = names.length - 1; j >= 0; j--) {
            String i = names[j];
            String huruf;
            huruf = i.toLowerCase();
            switch (huruf) {
                case "keyboard":
                    this.kode = "KB00" + nextNum++;
                    break;
                case "mouse":
                    this.kode = "MS00" + nextNum++;
                    break;
                case "headset":
                    this.kode = "HS00" + nextNum++;
                    break;
            }
        }
    }


    public void setStok(int stok) {
        this.stok = stok;
    }

    public String getKode() {
        return kode;
    }

    public int getStok() {
        return stok;
    }

    public String getNama() {
        return nama;
    }

    public long getHarga() {
        return harga;
    }
}
