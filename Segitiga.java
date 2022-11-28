/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihan1;

/**
 *
 * @author hp
 */
public class Segitiga extends BangunDatar {
    
    private int alas;
    private int tinggi;
    
    public Segitiga(int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }
  
    
    @Override
    public float luas (){
        return (float) (0.5 * this.alas * this.tinggi);          
    }
    
    @Override          
    public void gambar() {
        System.out.println("Menggambar Segitiga");
    }   
    
}
