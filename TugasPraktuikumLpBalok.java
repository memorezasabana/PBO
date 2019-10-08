/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo;
import java.util.Scanner;
/**
 *
 * @author TUF
 */
public class TugasPraktuikumLpBalok {
    public static void main(String[] args) {
        Scanner apik = new Scanner(System.in);
        int p;
        System.out.print("Masukkan Nilai Panjang Balok    : ");
        p = apik.nextInt();
        int l;
        System.out.print("Masukkan Nilai Lebar Balok      : ");
        l = apik.nextInt();
        int t;
        System.out.print("Masukkan Nilai Tinggi Balok     : ");
        t = apik.nextInt();
        System.out.println("===============================");
        System.out.println("Menghitung Luas Permukaan Balok");
        System.out.println("===============================");
        System.out.println("Luas permukaan Balok = " + ((2 * p * l) + (2 * p * t) + (2 * l * t)));
       
    }
}
