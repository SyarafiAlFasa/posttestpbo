
package posttest3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;


public class main {

    static InputStreamReader isr = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(isr);    
    static ArrayList <Kendaraan> otomotif = new ArrayList<>();
    static ArrayList <Permintaan> minta = new ArrayList<>();

    public static void main(String[] args) throws IOException{

        while(true){
            System.out.println("======================================");
            System.out.println("| PROGRAM PENDATAAN KENDARAAN CLIENT |");
            System.out.println("|         BENGKEL SUKSES JAYA        |");
            System.out.println("======================================");            
            System.out.println("| 1. Tambah Data                     |");
            System.out.println("| 2. Lihat Data                      |");
            System.out.println("| 3. Ubah Data                       |");
            System.out.println("| 4. Hapus Data                      |");
            System.out.println("| 5. Keluar                          |");
            System.out.println("|====================================|");
            System.out.println("| Pilihan Anda : ");

            int pilihan = Integer.parseInt(br.readLine());

            switch (pilihan) {
                case 1 -> tambah();
                case 2 -> tampil();
                case 3 -> ubah();
                case 4 -> hapus();
                case 5 -> System.exit(0);
                default -> System.out.println("PILIHAN SALAH!");
            }
            System.out.println("\n\n");
        
        }

    }

    static void tambah() throws IOException{
        System.out.println("");
        System.out.println("======================================");
        System.out.println("| PROGRAM PENDATAAN KENDARAAN CLIENT |");
        System.out.println("|         BENGKEL SUKSES JAYA        |");
        System.out.println("|====================================|");  
        System.out.println("|1. Tambah Data Kendaraan            |");
        System.out.println("|2. Tambah Data Permintaan           |");
        System.out.println("|====================================|");  
        System.out.println("| Pilihan Anda : "); 
        int pilih = Integer.parseInt(br.readLine());
        switch(pilih){
            
            case 1 -> {
                System.out.println("");
                System.out.println("======================================");
                System.out.println("|        Tambah Data Kendaraan       |");
                System.out.println("======================================");
                System.out.println("Nama        : ");
                String nama = br.readLine();             
                System.out.println("Alamat      :");
                String alamat = br.readLine();
                System.out.println("Nomor HP    :");
                String nope = br.readLine();
                System.out.println("Merek       :");
                String merek = br.readLine();
                System.out.println("Tipe        :");
                String tipe = br.readLine();
                System.out.println("Warna       :");
                String warna = br.readLine();
                System.out.println("Plat        :");
                String nomor_plat = br.readLine();

                Kendaraan newoto = new Kendaraan (nama, merek, tipe, warna, nomor_plat, alamat, nope);
                otomotif.add(newoto);

                System.out.println("Data Berhasil Ditambahkan.");
                System.out.println("======================================");
                System.out.println("");
            }
                
            case 2 -> {
                System.out.println("");
                System.out.println("======================================");
                System.out.println("|        Tambah Data Permintaan      |");
                System.out.println("======================================");
                System.out.println("Nama        : ");
                String namaminta = br.readLine();                      
                System.out.println("Alamat      :");
                String alamatminta = br.readLine();
                System.out.println("Nomor HP    :");
                String nopeminta = br.readLine();
                System.out.println("Permintaan  :");
                String mintaapa = br.readLine();

                Permintaan newminta = new Permintaan (namaminta, alamatminta, nopeminta, mintaapa);
                minta.add(newminta);

                System.out.println("Data Berhasil Ditambahkan.");
                System.out.println("======================================");
                System.out.println("");
            }
                
        }


    }

    static void tampilKendaraan()throws IOException{
        
        if (otomotif.isEmpty()){
                
                System.out.println("Data Kosong");
                
        }else{
            
            System.out.println("");
            System.out.println("======================================");
            System.out.println("|            Data Kendaraan          |");
            System.out.println("======================================");
            for(int i = 0; i< otomotif.size(); i++){
                System.out.println("Data ke - "+(i+1));
                System.out.println("Nama        : "+otomotif.get(i).getNama());
                System.out.println("Alamat      : "+otomotif.get(i).getAlamat());
                System.out.println("Nomor HP    : "+otomotif.get(i).getNope());
                System.out.println("Merek       : "+otomotif.get(i).getMerek());
                System.out.println("Tipe        : "+otomotif.get(i).getTipe());
                System.out.println("Warna       : "+otomotif.get(i).getWarna());
                System.out.println("Plat        : "+otomotif.get(i).getPlat());                    
                System.out.println("======================================");
            }
            System.out.println("======================================"); 
            System.out.println("");
            
    }
}
        
    static void tampilPermintaan() throws IOException{
        if (minta.isEmpty()){
                
                System.out.println("Data Kosong");
                
        }else {            
            
            System.out.println("");
            System.out.println("======================================");
            System.out.println("|           Data Permintaan          |");
            System.out.println("======================================");
            for(int i = 0; i< minta.size(); i++){
                System.out.println("Data ke - "+(i+1));
                System.out.println("Nama        : "+minta.get(i).getNama());
                System.out.println("Alamat      : "+minta.get(i).getAlamat());
                System.out.println("Nomor HP    : "+minta.get(i).getNope());
                System.out.println("Permintaan  : "+minta.get(i).getMintaapa());  
                System.out.println("======================================");
            }
            System.out.println("======================================"); 
            System.out.println("");
        }
    }
    
    static void tampil() throws IOException{
        System.out.println("======================================");
        System.out.println("| PROGRAM PENDATAAN KENDARAAN CLIENT |");
        System.out.println("|         BENGKEL SUKSES JAYA        |");
        System.out.println("|====================================|");  
        System.out.println("|1. Data Kendaraan                   |");
        System.out.println("|2. Data Permintaan                  |");
        System.out.println("|====================================|");  
        System.out.println("| Pilihan Anda : "); 
        int pilih = Integer.parseInt(br.readLine());
        
        switch (pilih){
        
            case 1 -> tampilKendaraan();
            case 2 -> tampilPermintaan();
            default -> System.out.println("PILIHAN SALAH!");
            
            }        
    }

    static void ubah() throws IOException{
        System.out.println("======================================");
        System.out.println("| PROGRAM PENDATAAN KENDARAAN CLIENT |");
        System.out.println("|         BENGKEL SUKSES JAYA        |");
        System.out.println("|====================================|");  
        System.out.println("|1. Edit Data Kendaraan              |");
        System.out.println("|2. Edit Data Permintaan             |");
        System.out.println("|====================================|");  
        System.out.println("| Pilihan Anda : "); 
        int pilih = Integer.parseInt(br.readLine());
        switch (pilih){
            
            case 1 -> {
                tampilKendaraan();
                System.out.println("Ubah Data Ke : ");
                int ubahkee = Integer.parseInt(br.readLine());
                ubahkee -=1;

                System.out.println("");
                System.out.println("======================================");
                System.out.println("|              UBAH DATA             |");
                System.out.println("======================================");
                System.out.println("Nama        : ");    
                otomotif.get(ubahkee).setNama(br.readLine());
                System.out.println("Alamat      :");
                otomotif.get(ubahkee).setAlamat(br.readLine());
                System.out.println("Nomor HP    :");
                otomotif.get(ubahkee).setNope(br.readLine());
                System.out.println("Merek       :");
                otomotif.get(ubahkee).setMerek(br.readLine());
                System.out.println("Tipe        :");
                otomotif.get(ubahkee).setTipe(br.readLine());
                System.out.println("Warna       :");
                otomotif.get(ubahkee).setWarna(br.readLine());
                System.out.println("Plat        :");
                otomotif.get(ubahkee).setPlat(br.readLine());                
                
                System.out.println("Data Berhasil Diubah.");
                System.out.println("======================================");
                System.out.println("");
            }
                
            case 2 -> {
                tampilPermintaan();
                System.out.println("Ubah Data Ke : ");
                int ubahke = Integer.parseInt(br.readLine());
                ubahke -=1;
                
                System.out.println("");
                System.out.println("======================================");
                System.out.println("|              UBAH DATA             |");
                System.out.println("======================================");
                System.out.println("Nama        : ");    
                minta.get(ubahke).setNama(br.readLine());
                System.out.println("Alamat      :");
                minta.get(ubahke).setAlamat(br.readLine());
                System.out.println("Nomor HP    :");
                minta.get(ubahke).setNope(br.readLine());
                System.out.println("Permintaan  :");
                minta.get(ubahke).setMintaapa(br.readLine());     
                System.out.println("");
                System.out.println("Data Berhasil Diubah.");
                System.out.println("======================================");
                System.out.println("");
            }
                
            default -> System.out.println("Pilihan TIdak Ada");
        }
             
    }

    static void hapus() throws IOException{
        System.out.println("======================================");
        System.out.println("| PROGRAM PENDATAAN KENDARAAN CLIENT |");
        System.out.println("|         BENGKEL SUKSES JAYA        |");
        System.out.println("|====================================|");  
        System.out.println("|1. Hapus Data Kendaraan             |");
        System.out.println("|2. Hapus Data Permintaan            |");
        System.out.println("|====================================|");  
        System.out.println("| Pilihan Anda : "); 
        int pilihann = Integer.parseInt(br.readLine());
        
        switch (pilihann){
            case 1 -> {
                tampilKendaraan();
                System.out.println("Hapus Data Ke : ");
                int target = Integer.parseInt(br.readLine());
                target -=1;
                otomotif.remove(target);
                System.out.println("Data Berhasil Dihapus");
            }
            
            case 2 -> {
                tampilPermintaan();
                System.out.println("Hapus Data Ke : ");
                int targett = Integer.parseInt(br.readLine());
                targett -=1;
                minta.remove(targett);
                System.out.println("Data Berhasil Dihapus");
            }
            
            default -> System.out.println("Pilihan Tidak Ada");
        }                        
    }
}
