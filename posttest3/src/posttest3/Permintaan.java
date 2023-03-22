/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest3;

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
