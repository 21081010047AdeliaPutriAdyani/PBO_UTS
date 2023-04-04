/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;

/**
 *
 * @author ADELIA
 */
public class Bus {

    private int jumlahPenumpang;

    public Bus(int jumlahPenumpang) {
        this.jumlahPenumpang = jumlahPenumpang;
    }

    public void turun(int jumlahTurun) {
        this.jumlahPenumpang -= jumlahTurun;
    }

    public void naik(int jumlahNaik) {
        this.jumlahPenumpang += jumlahNaik;
    }

    public int getJumlahPenumpang() {
        return jumlahPenumpang;
    }

}
