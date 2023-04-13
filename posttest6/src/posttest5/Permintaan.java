package posttest5;

public final class Permintaan extends Pelanggan {
    
    protected String mintaapa;
    
     Permintaan (String nama, String alamat, String nope, String mintaapa){
        
        this.nama = nama;
        this.alamat = alamat;
        this.nope = nope;
        this.mintaapa = mintaapa;    
    
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
    
    public String getMintaapa() {
        return mintaapa;
    }

    public void setMintaapa(String mintaapa) {
        this.mintaapa = mintaapa;
    }
    
}

//Penggunaan Overloading
class Summary {
    public void nama(String nama){
        System.out.println("Permintaan "+nama+" Telah Ditambahkan");
    }

    public void konfir(String nama, String nope){
        System.out.println("Permintaan Atas Nama "+nama+" Dengan Nomor HP "+nope+" Telah Dikonfirmasi");
    }
}
