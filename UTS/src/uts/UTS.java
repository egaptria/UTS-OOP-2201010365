/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uts;

import java.util.Scanner;

/**
 *
 * @author I Gusti Ngurah Agus Ega Patria Pramudita (2201010365)
 * 14-05-2024
 */
public class UTS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Perpustakaan perpustakaan = new Perpustakaan();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Tampilkan Koleksi Buku");
            System.out.println("3. Ubah Buku");
            System.out.println("4. Hapus Buku");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            int pilihan = scanner.nextInt();
            System.out.println("\n");
            scanner.nextLine(); // untuk membersihkan newline di buffer

            switch (pilihan) {
                case 1:
                    System.out.println("Tambah Buku: ");
                    System.out.print("Judul: ");
                    String judul = scanner.nextLine();
                    System.out.print("Pengarang: ");
                    String pengarang = scanner.nextLine();
                    System.out.print("Tahun Terbit: ");
                    int tahunTerbit = scanner.nextInt();
                    perpustakaan.tambahBuku(new Buku(judul, pengarang, tahunTerbit));
                    System.out.println("\n");
                    break;
                case 2:
                    perpustakaan.tampilkanKoleksi();
                    System.out.print("\n");
                    break;
                case 3:
                    System.out.print("Masukkan indeks buku yang akan diubah: ");
                    int indeksUbah = scanner.nextInt();
                    scanner.nextLine(); // membersihkan newline
                    System.out.print("Judul: ");
                    String newJudul = scanner.nextLine();
                    System.out.print("Pengarang: ");
                    String newPengarang = scanner.nextLine();
                    System.out.print("Tahun Terbit: ");
                    int newTahunTerbit = scanner.nextInt();
                    perpustakaan.ubahBuku(indeksUbah, new Buku(newJudul, newPengarang, newTahunTerbit));
                    System.out.println("\n");
                    break;
                case 4:
                    System.out.print("Masukkan indeks buku yang akan dihapus: ");
                    int indeksHapus = scanner.nextInt();
                    perpustakaan.hapusBuku(indeksHapus);
                    System.out.println("\n");
                    break;
                case 5:
                    System.out.println("Terima kasih!");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid");
                    System.out.println("\n");
            }
        }
    }
}
