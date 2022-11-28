/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihan1;

/**
 *
 * @author hp
 */
public class Persegi extends BangunDatar{
    
    private float panjang;
    private float lebar;
    
    public Persegi(float panjang, float lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    @Override
    public float luas (){
        return (float) (panjang*lebar);          
    }
    
    @Override
    public void gambar (){
        System.out.println("Menggambar Persegi");;          
    }
    
}
