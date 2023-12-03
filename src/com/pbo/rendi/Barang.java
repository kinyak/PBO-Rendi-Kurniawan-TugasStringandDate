package com.pbo.rendi;
// Deklarasi kelas barang

    public class Barang {
        private String namaItem;
        private double hargaItem;
    
        public Barang(String namaItem, double hargaItem) {
            this.namaItem = namaItem;
            this.hargaItem = hargaItem;
        }
    
        public String getNamaItem() {
            return namaItem;
        }
    
        public void setNamaItem(String namaItem) {
            this.namaItem = namaItem;
        }
    
        public double getHargaItem() {
            return hargaItem;
        }
    
        public void setHargaItem(double hargaItem) {
            this.hargaItem = hargaItem;
        }
    }
    