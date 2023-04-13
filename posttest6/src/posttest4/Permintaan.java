/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest4;


/**
 *
 * @author MSI USER
 */
public class Permintaan extends Pelanggan {
    
    private String mintaapa;
    
    public Permintaan (String nama, String alamat, String nope, String mintaapa){
        
        super(nama, alamat, nope);
        this.mintaapa = mintaapa;    
    
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
