/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihan1;

/**
 *
 * @author hp
 */
public class Utama {    
    public static void main(String[] args){
        
         //Membuat objek BangunDatar
        BangunDatar lingkaran = new Lingkaran(10);
        BangunDatar segitiga = new Segitiga(10,10);
        BangunDatar persegi = new Persegi(10,10);
        
    
        lingkaran.gambar();
        System.out.println("Luas lingkaran : " + lingkaran.luas());
        
        segitiga.gambar();
        System.out.println("Luas segitiga : " + segitiga.luas());
        
        persegi.gambar();
        System.out.println("Luas persegi : " + persegi.luas());
        
      
    }
    
}
