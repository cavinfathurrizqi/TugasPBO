/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kendaraan;

/**
 *
 * @author LENOVO
 */
public class MobilListrik extends mobil{
    public static void main(String[] args) {
        kendaraan mobil = new kendaraan ();
        mobil.setJenisBahanbakar("Bensin Dan solar");
        mobil.setJumlahRoda(4);
        mobil.setKapasitas(7);
        mobil.setWarna("Hitam dan putih");
        mobil.setKecepatan("20 - 200 km/j");
        System.out.println("Jenis Bahan Bakar Mobil : " +mobil.getJenisBahanbakar());
        System.out.println("Jumlah Roda mobil : " + mobil.getJumlahRoda());
        System.out.println("Kapasitas Mobil : " + mobil.getKapasitas());
        System.out.println("Warna Mobil : " +mobil.getWarna());
        System.out.println(" ");
        
       
        MobilListrik tesla = new MobilListrik();
        tesla.setFiturMobil("Autopilot");
        tesla.setModeMobil("Norma,Eco,dan Sport");
        tesla.setSumberEnergi("Baterai");
        tesla.setKapasitasBaterai("75 kWh");
        System.out.println("Fitur Mobil Listrik : " + tesla.getFiturMobil());
        System.out.println("Mode Mobi Listrik : " + tesla.getModeMobil());
        System.out.println("Sumber Energi Mobil Listrik : " + tesla.getSumberEnergi());
        System.out.println("Kapasitas Baterai Mobil Listrik : " + tesla.getKapasitasBaterai());
        
    }
}
