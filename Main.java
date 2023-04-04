/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uts;
import java.util.Scanner;
/**
 *
 * @author ADELIA
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int jumlahPenumpang, penumpangPorong, turunPorong,turunGresik, naikPorong, penumpangSurabaya,turunSurabaya, naikSurabaya;
       
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah penumpang di awal: ");
        jumlahPenumpang = input.nextInt();
        Bus bus = new Bus(jumlahPenumpang);
        System.out.println("----------------------------------------------------------");
        System.out.println("PORONG :");
        System.out.print("Penumpang yang menunggu di Halte Porong = ");
        penumpangPorong = input.nextInt();
        System.out.print("Penumpang yang turun  di Halte Porong   = ");
        turunPorong = input.nextInt();
        System.out.print("Penumpang yang naik  di Halte Porong    = ");
        naikPorong = input.nextInt();
        System.out.println("----------------------------------------------------------");
        System.out.println("SURABAYA :");
        System.out.print("Penumpang yang menunggu  di Halte Surabaya = ");
        penumpangSurabaya = input.nextInt();
        System.out.print("Penumpang yang turun  di Halte Surabaya   = ");
        turunSurabaya = input.nextInt();
        System.out.print("Penumpang yang naik  di Halte Surabaya     = ");
        naikSurabaya = input.nextInt();
        System.out.println("----------------------------------------------------------");
        System.out.println("GRESIK :");
        System.out.print("Penumpang yang turun  di Halte Gresik = ");
        turunGresik = input.nextInt();
        System.out.println("----------------------------------------------------------");
        
        Halte porong = new Halte(penumpangPorong);
        System.out.println("-> Bus Berangkat dari PULL/Kantor:");
        System.out.println("    - jumlah penumpang : " + bus.getJumlahPenumpang() + " penumpang");
        System.out.println("    - "+turunPorong+" penumpang turun di Halte Porong");
        System.out.println("    - "+turunGresik+" penumpang turun di Halte Gresik");
        System.out.println("----------------------------------------------------------");
        
        System.out.println("-> Halte Porong : " + porong.getPenumpangMenunggu() + " Penumpang menunggu");
        System.out.println("-> Bus Sampai di Halte PORONG:");
        System.out.println("    - " + turunPorong + " penumpang turun");
        System.out.println("    - " + naikPorong + " penumpang naik :");
        bus.turun(turunPorong);
        bus.naik(naikPorong);
        porong.setPenumpangMenunggu(penumpangPorong - naikPorong);
        System.out.println("        - tujuan Surabaya ");
        System.out.println("        - tujuan Gresik ");
        System.out.println("- jumlah penumpang : " + bus.getJumlahPenumpang() + " penumpang");
        System.out.println("-> Halte Porong : " + porong.getPenumpangMenunggu() + " Penumpang menunggu");
        System.out.println("----------------------------------------------------------");
       
        Halte surabaya = new Halte(penumpangSurabaya);
        System.out.println("-> Halte Surabaya : " + surabaya.getPenumpangMenunggu() + " Penumpang menunggu");
        
        System.out.println("-> Bus Sampai di Halte SURABAYA :");
        System.out.println("    - " + turunSurabaya + " penumpang turun");
        System.out.println("    - " + naikSurabaya + " penumpang naik");
        bus.turun(turunSurabaya);
        bus.naik(naikSurabaya);
        surabaya.setPenumpangMenunggu(penumpangSurabaya - naikSurabaya);
        System.out.println("        - " + naikSurabaya + " penumpang tujuan Gresik");
        System.out.println("- jumlah penumpang : " + bus.getJumlahPenumpang() + " penumpang");
        System.out.println("-> Halte Surabaya : " + surabaya.getPenumpangMenunggu() + " Penumpang menunggu");
    }
}