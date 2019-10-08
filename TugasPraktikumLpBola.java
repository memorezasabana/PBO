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
public class TugasPraktikumLpBola {
    public static void main(String[] args) {
        Scanner apik = new Scanner(System.in);
        double phi= 3.14;
        int r;
        System.out.println("=======Menghitung Luas Bola=======");
        System.out.println("Masukkan Nilai jari-jari   : ");
        r = apik.nextInt();
        System.out.println("Nilai phi yang digunakan   : "+phi);
        System.out.println("==================================");
        System.out.println("Menghitung Luas Permukaan Bola  : "+ 4*phi*r*r);
    }
}
