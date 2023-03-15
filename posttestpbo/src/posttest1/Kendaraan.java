package posttest1;


public class Kendaraan {
    
    String nama;
    String merek;
    String tipe;
    String warna;
    String plat;
    String permintaan;
    
    public Kendaraan (String Nama, String Merek, String Tipe, String Warna, String Plat, String Permintaan){
        this.nama = Nama;
        this.merek = Merek;
        this.tipe = Tipe;
        this.warna = Warna;
        this.plat = Plat;
        this.permintaan = Permintaan;
    }
        
    void notifikasi(){
        System.out.println("Data Ditambahkan");
    }
}
