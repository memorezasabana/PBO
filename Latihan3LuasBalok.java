/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo;

/**
 *
 * @author TUF
 */
public class Latihan3LuasBalok {

    public static void main(String[] args) {
        int p = 5;
        int l = 10;
        int t = 5;
        System.out.println("Nilai Panjang Balok   : " + p);
        System.out.println("Nilai Lebar Balok     : " + l);
        System.out.println("Nilai Tinggi Balok    : " + t);
        System.out.println("===============================");
        System.out.println("Menghitung Luas Permukaan Balok");
        System.out.println("===============================");
        System.out.println("Luas permukaan Balok = " + ((2 * p * l) + (2 * p * t) + (2 * l * t)));

    }
}
