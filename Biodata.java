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
public class Biodata {

    public static void main(String[] args) {
        Biodata biodata = new Biodata();
        biodata.setNama(" ");
        biodata.setNis(" ");
        biodata.setTempatlahir(" ");
        biodata.setTanggallahir(" ");
        biodata.setJeniskelamin(" ");
        biodata.setAlamatdimalang(" ");
        biodata.setMottohidup(" ");
    }

    private void setNama(String nama) {
        nama = "Memoreza Sabana";
        System.out.println("Nama            : " + nama);
    }

    private void setNis(String nis) {
        nis = "6246/2509.065";
        System.out.println("NIS             : " + nis);

    }

    private void setTempatlahir(String tempatlahir) {
        tempatlahir = "Tuban";
        System.out.println("Tempat Lahir    : " + tempatlahir);

    }

    private void setTanggallahir(String tanggallahir) {
        tanggallahir = "16 Oktober 2003";
        System.out.println("Tanggal Lahir   : " + tanggallahir);

    }

    private void setJeniskelamin(String jeniskelamin) {
        jeniskelamin = "Laki-Laki";
        System.out.println("Jenis Kelamin   : " + jeniskelamin);
    }

    private void setAlamatdimalang(String alamat) {
        alamat = "Jl. Danau Laut Tawar G2E23 Sawojajar, Kota Malang";
        System.out.println("Alamat di Malang : " + alamat);
    }

    private void setMottohidup(String motto) {
        motto = "Berhenti bicara, bergerak, dan berjalanlah";
        System.out.println("Motto Hidup       : " + motto);
    }
}
