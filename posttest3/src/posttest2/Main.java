
package posttest2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;


public class Main {

    static InputStreamReader isr = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(isr);
    static ArrayList<Kendaraan> list = new ArrayList<>();    

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
            System.out.println("======================================");

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
        System.out.println("Nama        : ");    
        String nama = br.readLine();                      
        System.out.println("Merek       :");
        String merek = br.readLine();
        System.out.println("Tipe        :");
        String tipe = br.readLine();
        System.out.println("Warna       :");
        String warna = br.readLine();
        System.out.println("Plat        :");
        String nomor_plat = br.readLine();
        System.out.println("Permintaan  :");
        String permintaan = br.readLine();
        
        Kendaraan clients = new Kendaraan (nama, merek, tipe, warna, nomor_plat, permintaan);
        list.add(clients);
        
        System.out.println("Data Berhasil Ditambahkan.");
        System.out.println("======================================");
        System.out.println("");
    }

    static void tampil(){
        if (list.isEmpty()){
            System.out.println("Tidak Ada Kosong");
        }else{
            System.out.println("\n");
            System.out.println("");
            System.out.println("======================================");
            System.out.println("|            Data Kendaraan          |");
            System.out.println("======================================");
            for(int i = 0; i< list.size(); i++){
                System.out.println("Data ke - "+(i+1));
                System.out.println("Nama        : "+list.get(i).getNama());
                System.out.println("Merek       : "+list.get(i).getMerek());
                System.out.println("Tipe        : "+list.get(i).getTipe());
                System.out.println("Warna       : "+list.get(i).getWarna());
                System.out.println("Plat        : "+list.get(i).getPlat());
                System.out.println("Permintaan  : "+list.get(i).getPermintaan());
                System.out.println("======================================");
            }
            System.out.println("======================================"); 
            System.out.println("");
        }
    }

    static void ubah() throws IOException{
        tampil();
        System.out.println("Ubah Data Ke : ");
        int pilihan = Integer.parseInt(br.readLine());
        pilihan -=1;
        
        System.out.println("");
        System.out.println("======================================");
        System.out.println("|              UBAH DATA             |");
        System.out.println("======================================");
        
        System.out.println("Nama        : ");    
        list.get(pilihan).setNama(br.readLine());
        System.out.println("Merek       :");
        list.get(pilihan).setMerek(br.readLine());
        System.out.println("Tipe       :");
        list.get(pilihan).setTipe(br.readLine());
        System.out.println("Warna       :");
        list.get(pilihan).setWarna(br.readLine());
        System.out.println("Plat        :");
        list.get(pilihan).setPlat(br.readLine());
        System.out.println("Permintaan  :");
        list.get(pilihan).setPermintaan(br.readLine());
        System.out.println("======================================");
        System.out.println("Data Berhasil Diubah...");
        System.out.println("");
    }

    static void hapus() throws IOException{
        tampil();
        System.out.println("Hapus Data Ke : ");
        int pilihan = Integer.parseInt(br.readLine());
        pilihan -=1;
        
        list.remove(pilihan);
        System.out.println("Data Berhasil Dihapus");
    }
}
