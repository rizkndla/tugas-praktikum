/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polymorph;

/**
 *
 * @author Rizka Nadila
 */
public class Hitung {

    void volume(int sisi){
        int hv = sisi * sisi * sisi;
        System.out.println("Volume Kubus = " + hv);
    }
    
     void luasPermukaan(int sisi){
        int hp = 6 * (sisi * sisi);
        System.out.println("Luas Permukaan Kubus = " + hp);
    }

    void volume(int panjang, int lebar, int tinggi){
        int hv = panjang * lebar * tinggi;
        System.out.println("Volume Balok = " + hv);
    }

    void luasPermukaan(int panjang, int lebar, int tinggi){
        int hp = 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
        System.out.println("Luas Permukaan Balok = " + hp);
    }
}
