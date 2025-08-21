/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hewan;

/**
 *
 * @author LENOVO
 */
public class Buaya extends Reptil {

    public static void main(String[] args) {
        Buaya muarai = new Buaya();
        muarai.setKulit(" Bersisik tebal tulang didalamnya");
        muarai.setPernafasan("Valvula nasi (tutup Hidung)");
        muarai.setJumlahGigi(60);
        muarai.setKecepatanRenang("24 - 29 km/jam");
        System.out.println("Kulit  Buaya : " + muarai.getKulit());
        System.out.println("Pernafasan Buaya : " + muarai.getPernafasan());
        System.out.println("Jumlah Gigi Buaya: " + muarai.getJumlahGigi());
        System.out.println("Kecepatan Renang Buaya : " + muarai.getKecepatanRenang());
        
        System.out.println(" ");
        
        Reptil buas = new Reptil();
        buas.setCaraberkebangbiak("Bertelur");
        buas.setCarabernafas("Dengan Paru-paru");
        buas.setJenisKulit("lebih tipis dan bersisik");
        buas.setJumlahkaki(4);

        System.out.println("Cara berkebangbiak Reptil : " + buas.getCaraberkebangbiak());
        System.out.println("Cara bernafas Reptil : " + buas.getCarabernafas());
        System.out.println("Jenis Kulit Reptil : " + buas.getJenisKulit());
        System.out.println("Jumlah Kaki Reptil : " + buas.getJumlahkaki());

    }

}
