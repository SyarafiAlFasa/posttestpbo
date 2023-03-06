package posttest1lagi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
public class Posttest1lagi {
    
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        ArrayList listnama = new ArrayList <> ();
        ArrayList listmerek = new ArrayList <> ();
        ArrayList listtipe = new ArrayList <> ();
        ArrayList listwarna = new ArrayList <> ();
        ArrayList listplat = new ArrayList <> ();
        
        int pilihan;
        int targetubah;
        int targethapus;                
        int index;
        
        
        do{
            System.out.println("======================================");
            System.out.println("| PROGRAM PENDATAAN KENDARAAN CLIENT |");
            System.out.println("|         BENGKEL SUKSES JAYA        |");
            System.out.println("======================================");            
            System.out.println("| 1. Create                          |");
            System.out.println("| 2. Read                            |");
            System.out.println("| 3. Update                          |");
            System.out.println("| 4. Delete                          |");
            System.out.println("| 5. Exit                            |");
            System.out.println("======================================");

            System.out.println("Pilihan Anda : ");
            pilihan = input.nextInt();
            
            switch(pilihan){
            case 1:
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
                System.out.println("Angka Plat  :");
                String nomor_plat = br.readLine();
                kendaraan clients = new kendaraan (nama, merek, tipe, warna, nomor_plat);
                listnama.add(clients.nama);  
                listmerek.add(clients.merek);  
                listtipe.add(clients.tipe);  
                listwarna.add(clients.warna);  
                listplat.add(clients.plat);  
                clients.notifikasi();
                System.out.println("======================================");
                System.out.println("");
                break;

            case 2:
                
                if (listnama.isEmpty()== false){     
                    System.out.println("");
                    System.out.println("======================================");
                    System.out.println("|            Data Kendaraan          |");
                    System.out.println("======================================");
                    for(int i = 0; i<listnama.size(); i++){          
                        System.out.println("Data ke - "+(i+1));
                        System.out.println("Nama    : "+listnama.get(i));
                        System.out.println("Merek   : "+listmerek.get(i));
                        System.out.println("Tipe    : "+listtipe.get(i));
                        System.out.println("Warna   : "+listwarna.get(i));
                        System.out.println("Plat    : "+listplat.get(i));
                        System.out.println("======================================");                    
                    }
                    System.out.println("======================================");
                    System.out.println("");
                }
                else {
                    System.out.println("Data Kosong");
                    System.out.println("");
                }
                break;
            
            case 3:
                System.out.println("");
                System.out.println("======================================");
                System.out.println("|            Data Kendaraan          |");
                System.out.println("======================================");
                for(int i = 0; i<listnama.size(); i++){          
                    System.out.println("Data ke - "+(i+1));
                    System.out.println("Nama    : "+listnama.get(i));
                    System.out.println("Merek   : "+listmerek.get(i));
                    System.out.println("Tipe    : "+listtipe.get(i));
                    System.out.println("Warna   : "+listwarna.get(i));
                    System.out.println("Plat    : "+listplat.get(i));
                    System.out.println("======================================");                    
                }
                System.out.println("======================================");
                System.out.println("Pilih Data ke Berapa Yang Ingin Diubah : ");
                targetubah = input.nextInt();
                index = targetubah-1;
                System.out.println("");
                
                System.out.println("");
                System.out.println("======================================");
                System.out.println("|              UBAH DATA             |");
                System.out.println("======================================");
                System.out.println("Nama        : ");    
                String namabaru = br.readLine();                      
                System.out.println("Merek       :");
                String merekbaru = br.readLine();
                System.out.println("Tipe       :");
                String tipebaru = br.readLine();
                System.out.println("Warna       :");
                String warnabaru = br.readLine();
                System.out.println("Plat        :");
                String nomor_platbaru = br.readLine();
                System.out.println("======================================");
                
                kendaraan ubahclients = new kendaraan (namabaru, merekbaru, tipebaru, warnabaru, nomor_platbaru);
                listnama.set(index, ubahclients.nama);
                listmerek.set(index, ubahclients.merek);
                listtipe.set(index, ubahclients.tipe);
                listwarna.set(index, ubahclients.warna);
                listplat.set(index, ubahclients.plat);
                                
                ubahclients.notifikasi();
                System.out.println("");
                break;
            
            case 4:
                System.out.println("");
                System.out.println("======================================");
                System.out.println("|            Data Kendaraan          |");
                System.out.println("======================================");
                for(int i = 0; i<listnama.size(); i++){          
                    System.out.println("Data ke - "+(i+1));
                    System.out.println("Nama    : "+listnama.get(i));
                    System.out.println("Merek   : "+listmerek.get(i));
                    System.out.println("Tipe    : "+listtipe.get(i));
                    System.out.println("Warna   : "+listwarna.get(i));
                    System.out.println("Plat    : "+listplat.get(i));
                    System.out.println("======================================");                    
                }
                System.out.println("======================================");
                System.out.println("Pilih Data ke Berapa Yang Ingin Dihapus : ");
                targethapus = input.nextInt();
                index = targethapus-1;
                
                listnama.remove(index);
                listmerek.remove(index);
                listtipe.remove(index);
                listwarna.remove(index);
                listplat.remove(index);
                
                System.out.println("Data Dihapus");
                System.out.println("");
                break;
                                                
            case 5:
                System.out.println("Terimakasih...");
                System.exit(0);

            default:
                System.out.println("Menu Tidak Tersedia");
                break;
            }            
        }
        while (pilihan != 5);   
    }
}
