
package posttest5;

public class Kendaraan extends Pelanggan {
    
    protected String merek;
    protected String tipe;
    protected String warna;
    protected String plat;    
    
    Kendaraan (String nama, String merek, String tipe, String warna, String plat, String alamat, String nope){
//        super(nama, alamat, nope);
        this.nama = nama;
        this.alamat = alamat;
        this.nope = nope;
        this.merek = merek;
        this.tipe = tipe;
        this.warna = warna;
        this.plat = plat;
    }
    
    public String getMerek() {
        return merek;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNope() {
        return nope;
    }

    public void setNope(String nope) {
        this.nope = nope;
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

//Penggunaan Overriding
class notifikasi{
    public void notif(){
        System.out.println("Data Ditambahkan");
    }        
}


class notifUbah extends notifikasi{
    @Override
    public void notif(){
        System.out.println("Data Berhasil Diubah");
    }
}
