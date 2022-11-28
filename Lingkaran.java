/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihan1;
import java.lang.Math;
/**
 *
 * @author hp
 */
public class Lingkaran extends BangunDatar{
    
    int r;
    
    public Lingkaran(int r) {
        this.r = r;
        
    }
    
    @Override
    public float luas (){
        return (float) (Math.PI * r * r);          
    }
    
    @Override
    public void gambar () {
        System.out.println("Menggambar Lingkaran");;          
    }
    
}
