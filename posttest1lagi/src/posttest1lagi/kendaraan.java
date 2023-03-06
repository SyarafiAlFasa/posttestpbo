package posttest1lagi;


public class kendaraan {
    
    String nama;
    String merek;
    String tipe;
    String warna;
    String plat;
    
    public kendaraan (String Nama, String Merek, String Tipe, String Warna, String Plat){
        this.nama = Nama;
        this.merek = Merek;
        this.tipe = Tipe;
        this.warna = Warna;
        this.plat = Plat;
    }
        
    void notifikasi(){
        System.out.println("Data Ditambahkan");
    }
}
