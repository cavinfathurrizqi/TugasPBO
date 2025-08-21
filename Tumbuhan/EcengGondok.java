/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tumbuhan;

/**
 *
 * @author LENOVO
 */
public class EcengGondok extends monokotil{
    public static void main(String[] args) {
        EcengGondok air = new EcengGondok();
        air.setBentukDaun("Terapung membentuk Bantal");
        air.setBentukbatang("Lunak tidak menopang");
        air.setHabitat("Sepenuhnya di Air");
        air.setPertumbuhan(" sangat cepat secara Vegetatif");
        System.out.println("Bentuk daun Eceng Gondok : " + air.getBentukDaun());
        System.out.println("Bentuk Batang Eceng Gondok : " + air.getBentukbatang());
       System.out.println("Habitat Eceng Gondok : " + air.getHabitat());
       System.out.println("Pertumbuhan Eceng Gondok : " + air.getPertumbuhan());
       
        System.out.println(" ");
        
         monokotil tum = new monokotil();
        tum.setBentukDaun("sempit dan memanjang");
        tum.setHabitatTumbuhan("Tanah ladang atau kebun");
        tum.setJenisAkar("Serabut");
        tum.setJenisbatang("Tidak Bercabang");
        System.out.println("Bentuk Daun Monokotil : " + tum.getBentukDaun());
        System.out.println("Habitat Tumbuhan Monokotil : " + tum.getHabitatTumbuhan());
        System.out.println("Jenis Akar Monokotil : " + tum.getJenisAkar());
        System.out.println("Jenis Batang Monokotil : " + tum.getJenisbatang());
    }
            
    
}
