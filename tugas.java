package TUGAS2;

import java.util.Scanner;

/**ini adalah program untuk mencari kata dlm kalimat
 *
 */

public class PencarianKata {

    /**
     * @param args adalah bagian dari Main Utama dalam program ini
     * scanner input digunakan utk inputan user
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

/**
 * input.nextLine digunakan untuk melanjutkan inputan user
 */
        // Memasukkan teks
        System.out.print("Masukkan teks: ");
        String teks = input.nextLine();



        // Memasukkan kata yang ingin dicari
        System.out.print("Masukkan kata yang ingin Anda cari: ");
        String kataCari = input.next();
/**
 * if adalah kondisi jika kata yang ingin dicari tersedia
 * else adalah kondisi jika kata yang ingin dicari tidak tersedia
 */
        // Mencari kata dalam teks
        if (teks.contains(kataCari)) {
            System.out.println("Kata '" + kataCari + "' ditemukan dalam teks.");
        } else {
            System.out.println("Kata '" + kataCari + "' tidak ditemukan dalam teks.");
        }
    }
}


