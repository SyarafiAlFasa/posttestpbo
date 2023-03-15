
package posttest2;

class Kendaraan {
    private String nama;
    private String merek;
    private String tipe;
    private String warna;
    private String plat;
    private String permintaan;

    public Kendaraan (String Nama, String Merek, String Tipe, String Warna, String Plat, String Permintaan){
        this.nama = Nama;
        this.merek = Merek;
        this.tipe = Tipe;
        this.warna = Warna;
        this.plat = Plat;
        this.permintaan = Permintaan;
    }
    
    public String getNama() {
        return nama;
    }
    public String getMerek() {
        return merek;
    }
    public String getTipe() {
        return tipe;
    }
    public String getWarna() {
        return warna;
    }
    public String getPlat() {
        return plat;
    }
    public String getPermintaan() {
        return permintaan;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setMerek(String merek) {
        this.merek = merek;
    }
    public void setTipe(String tipe) {
        this.tipe = tipe;
    }
    public void setWarna(String warna) {
        this.warna = warna;
    }
    public void setPlat(String plat) {
        this.plat = plat;
    }
    public void setPermintaan(String permintaan) {
        this.permintaan = permintaan;
    }

}
