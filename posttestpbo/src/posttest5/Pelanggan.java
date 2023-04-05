package posttest5;

abstract class Pelanggan {
    
    protected String nama;
    protected String alamat;
    protected String nope;
    
    protected abstract void setNama(String nama);
    protected abstract void setAlamat(String alamat);
    protected abstract void setNope(String nope);
    protected abstract String getNama();
    protected abstract String getAlamat();
    protected abstract String getNope();
    
//    public Pelanggan (String nama, String alamat, String nope){
//        
//        this.nama = nama;
//        this.alamat = alamat;
//        this.nope = nope;
//        
//    }
}    