package com.pbo.rendi;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    int lastFakturNumber = 0;
    //Melakukan sebuah inisiasi try untuk percobaan terhadap statement yang ada dalam blok kode try
        Scanner scanner = new Scanner(System.in);

        boolean inginTransaksi = true;

        while (inginTransaksi) {
            
            Integer nomorFaktur = ++lastFakturNumber;
            System.out.println();
            System.out.println("Faktur No.\t: " + nomorFaktur);

            System.out.print("Nama Customer\t: ");
            String namaCustomer = scanner.next();
            
            System.out.print("Nomor HP\t: ");
            String nomorHP = scanner.next();
            
            System.out.print("Alamat\t\t: ");
            String alamat = scanner.next();

            System.out.print("Kode Item\t: ");
            String kodeItem = scanner.next();

            System.out.print("Nama Item\t: ");
            String namaItem = scanner.next();
             
            
            boolean hargaValid = false;
            double hargaItem = 0;
            while (!hargaValid) {
                try {
                    System.out.print("Harga Item\t: ");
                    hargaItem = scanner.nextDouble();
                    hargaValid = true;
                } catch (InputMismatchException e) {
                    System.out.println("Error: Harga item tidak valid. Silakan coba lagi.");
                    scanner.next();
                }
            }

            int jumlahItem = 0;
            boolean jumlahValid = false;
            while (!jumlahValid) {
                try {
                    System.out.print("Jumlah Item\t: ");
                    jumlahItem = scanner.nextInt();
                    if (jumlahItem <= 0) {
                        throw new ArithmeticException("Jumlah item harus lebih dari 0.");
                    }
                    jumlahValid = true;
                } catch (InputMismatchException e) {
                    System.out.println("Error: Jumlah item tidak valid. Silakan coba lagi.");
                    scanner.next();
                } catch (ArithmeticException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }

            System.out.print("Kasir\t\t: ");
            String namaKasir = scanner.next();

            Transaksi transaksi = new Transaksi(nomorFaktur, namaCustomer, nomorHP, alamat, kodeItem, namaItem, hargaItem, jumlahItem, namaKasir);
            System.out.println();
            transaksi.tampilkanDetailTransaksi();

            System.out.println(); 
            System.out.print("Mau lanjut transaksi? (ya/tidak): ");
            

            String pilihan = scanner.next().toLowerCase();
            inginTransaksi = pilihan.equals("ya");

    // Melakukan penangkapan error yang membaca kesalahan input, kondisi dimana tipe data yang disimpan tidak sesuai yang diinputkan
   
    // Apabila mekanisme try-catch telah dilakukan maka program menutup scanner agar tidak terjadi kebocoran memori
    }
    scanner.close();
    }
}