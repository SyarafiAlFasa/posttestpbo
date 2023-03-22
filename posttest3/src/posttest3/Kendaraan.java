/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest3;

/**
 *
 * @author MSI USER
 */
public class Kendaraan extends Pelanggan {
    
    private String merek;
    private String tipe;
    private String warna;
    private String plat;    
    
    public Kendaraan (String nama, String merek, String tipe, String warna, String plat, String alamat, String nope){
        super(nama, alamat, nope);
        this.merek = merek;
        this.tipe = tipe;
        this.warna = warna;
        this.plat = plat;
    }
    
    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getPlat() {
        return plat;
    }

    public void setPlat(String plat) {
        this.plat = plat;
    }
}
