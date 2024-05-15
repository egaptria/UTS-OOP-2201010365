/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;

/**
 *
 * @author I Gusti Ngurah Agus Ega Patria Pramudita (2201010365)
 * 14-05-2024
 */
class Buku {
    private String judul;
    private String pengarang;
    private int tahunTerbit;

    public Buku(String judul, String pengarang, int tahunTerbit) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
    }

    public String getJudul() {
        return judul;
    }

    public String getPengarang() {
        return pengarang;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    @Override
    public String toString() {
        return "Judul: " + judul + "\nPengarang: " + pengarang + "\nTahun Terbit: " + tahunTerbit;
    }
}

class Perpustakaan {
    private Buku[] koleksi;
    private int jumlahBuku;
    private static final int KAPASITAS_DEFAULT = 100;

    public Perpustakaan() {
        this.koleksi = new Buku[KAPASITAS_DEFAULT];
        this.jumlahBuku = 0;
    }

    public void tambahBuku(Buku buku) {
        if (jumlahBuku < koleksi.length) {
            koleksi[jumlahBuku++] = buku;
            System.out.println("Buku berhasil ditambahkan");
        } else {
            System.out.println("Koleksi sudah penuh, tidak bisa menambahkan buku lagi");
        }
    }


    public void tampilkanKoleksi() {
        if (jumlahBuku == 0) {
            System.out.println("Koleksi kosong");
            return;
        }
        System.out.println("Daftar Buku:");
        for (int i = 0; i < jumlahBuku; i++) {
            System.out.println((i + 1) + ". " + koleksi[i]);
        }
    }

    public void ubahBuku(int indeks, Buku bukuBaru) {
        if (indeks >= 1 && indeks <= jumlahBuku) {
            koleksi[indeks - 1] = bukuBaru;
            System.out.println("Buku pada indeks " + indeks + " berhasil diubah");
        } else {
            System.out.println("Indeks tidak valid");
        }
    }


    public void hapusBuku(int indeks) {
        if (indeks >= 1 && indeks <= jumlahBuku) {
            for (int i = indeks - 1; i < jumlahBuku - 1; i++) {
                koleksi[i] = koleksi[i + 1];
            }
            jumlahBuku--;
            System.out.println("Buku pada indeks " + indeks + " berhasil dihapus");
        } else {
            System.out.println("Indeks tidak valid");
        }
    }
}