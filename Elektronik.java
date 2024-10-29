/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.operasihitung;

/**
 *
 * @author asus1
 */
public class Elektronik implements Pembayaran {
    private final double pajak = 0.10;
    
    public Elektronik(){
    }
    @Override
    public double hitungPajak(double harga) {
    return harga + (harga * pajak);
    }
}