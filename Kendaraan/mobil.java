/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kendaraan;

/**
 *
 * @author LENOVO
 */
public class mobil extends kendaraan {

    /**
     * @return the SumberEnergi
     */
    protected String getSumberEnergi() {
        return SumberEnergi;
    }

    /**
     * @param SumberEnergi the SumberEnergi to set
     */
    protected void setSumberEnergi(String SumberEnergi) {
        this.SumberEnergi = SumberEnergi;
    }

    /**
     * @return the ModeMobil
     */
    protected String getModeMobil() {
        return ModeMobil;
    }

    /**
     * @param ModeMobil the ModeMobil to set
     */
    protected void setModeMobil(String ModeMobil) {
        this.ModeMobil = ModeMobil;
    }

    /**
     * @return the FiturMobil
     */
    protected String getFiturMobil() {
        return FiturMobil;
    }

    /**
     * @param FiturMobil the FiturMobil to set
     */
    protected void setFiturMobil(String FiturMobil) {
        this.FiturMobil = FiturMobil;
    }

    /**
     * @return the kapasitasBaterai
     */
    protected String getKapasitasBaterai() {
        return kapasitasBaterai;
    }

    /**
     * @param kapasitasBaterai the kapasitasBaterai to set
     */
    protected void setKapasitasBaterai(String kapasitasBaterai) {
        this.kapasitasBaterai = kapasitasBaterai;
    }
    private String SumberEnergi;
    private String ModeMobil;
    private String FiturMobil;
    private String kapasitasBaterai;
            
}
