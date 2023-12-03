package com.pbo.rendi;
// Deklarasi kelas transaksi yang mewariskan kelas Barang dan mengimplementasikan interface TotalBayar
import java.text.SimpleDateFormat;
import java.util.Date;

public class Transaksi extends Barang implements TotalBayar {
    public Integer nomorFaktur;
    public String namaCustomer;
    public int jumlahItem;
    public double totalBayar;
    public String nomorHP;
    public String alamat;
    public String namaKasir;
    public String kodeItem;

    public Transaksi(Integer nomorFaktur, String namaCustomer, String nomorHP, String alamat, String kodeItem, String namaItem,
                     double hargaItem, int jumlahItem, String namaKasir) {
        super(namaItem, hargaItem);
        this.nomorFaktur = nomorFaktur;
        this.namaCustomer = namaCustomer;
        this.nomorHP = nomorHP;
        this.alamat = alamat;
        this.kodeItem = kodeItem;
        this.jumlahItem = jumlahItem;
        this.namaKasir = namaKasir;
    }

    @Override
    public double hitungTotalBayar(double harga, int jumlah) {
        return harga * jumlah;
    }

    public void tampilkanDetailTransaksi() {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("'Tanggal Transaksi\t: 'EEEE',' dd MMMM yyyy");
        SimpleDateFormat timeFormat = new SimpleDateFormat("'Waktu\t\t\t: 'hh:mm:ss a zzz");
        String dataCustomer = "Data Customer";
        String dataPembelian = "Data Pembelian";
        String totalPembayaran = "Total Bayar\t: ";
        String namaToko = "\t\tIndomaret";
        String namaKasirString = "Kasir\t\t: ";

        System.out.println(namaToko.toUpperCase());
        System.out.println(dateFormat.format(date));
        System.out.println(timeFormat.format(date));
        System.out.println("===============================================");

        System.out.println(dataCustomer.toUpperCase());
        System.out.println("-----------------------------------------------");
        System.out.println("No. Faktur\t: " + nomorFaktur);
        System.out.println("Nama Customer\t: " + namaCustomer.toUpperCase());
        System.out.println("Nomor HP\t: " + nomorHP);
        System.out.println("Alamat\t\t: " + alamat);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");

        System.out.println(dataPembelian.toUpperCase());
        System.out.println("-----------------------------------------------");
        System.out.println("Kode Item\t: " + kodeItem);
        System.out.println("Nama Item\t: " + getNamaItem().toUpperCase());
        System.out.println("Harga Item\t: " + getHargaItem());
        System.out.println("Jumlah Item\t: " + jumlahItem);
        totalBayar = hitungTotalBayar(getHargaItem(), jumlahItem);
        System.out.println(totalPembayaran.toUpperCase() + totalBayar);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");

        System.out.println(namaKasirString.toUpperCase() + namaKasir);
    }

    @Override
    public double hitungTotalBayar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'hitungTotalBayar'");
    }

}
