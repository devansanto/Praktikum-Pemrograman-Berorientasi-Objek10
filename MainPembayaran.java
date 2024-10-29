/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.operasihitung;

/**
 *
 * @author asus1
 */
public class MainPembayaran {
    public static void main(String[] args) {
        Elektronik elektronik = new Elektronik();
        Makanan makanan = new Makanan();
        
        double hargaElektronik = 3500000;
        double hargaMakanan = 80000;      

        double pajakElektronik = elektronik.hitungPajak(hargaElektronik);
        double pajakMakanan = makanan.hitungPajak(hargaMakanan);

        System.out.println("Harga Elektronik: " + hargaElektronik);
        System.out.println("Pajak Elektronik (10%): " + pajakElektronik);
        
        System.out.println("Harga Makanan: " + hargaMakanan);
        System.out.println("Pajak Makanan (5%): " + pajakMakanan);
    }
}