
package posttest3;

class Pelanggan {
    
    protected String nama;
    protected String alamat;
    protected String nope;

    public Pelanggan (String nama, String alamat, String nope){
        
        this.nama = nama;
        this.alamat = alamat;
        this.nope = nope;
        
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


 
}
