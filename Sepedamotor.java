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
public class Sepedamotor {

    public static void main(String[] args) {
        Sepedamotor motor = new Sepedamotor();
        motor.setMerk(" ");
        motor.setNama(" ");
    }

    private void setMerk(String merk) {
        merk = "honda";
        System.out.println("Merk motor adalah :" + merk);
    }

    private void setNama(String nama) {
        nama = "beat";
        System.out.println("Nama motor adalah :" + nama);
    }
}
