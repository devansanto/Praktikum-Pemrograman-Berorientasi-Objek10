/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.operasihitung;

/**
 *
 * @author asus1
 */
public class Makanan implements Pembayaran{
    private final double pajak = 0.05;
    
    public Makanan(){
    }
    
    @Override 
    public double hitungPajak(double harga){
    return harga * pajak;
    } 
}