/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Application;

import data.Acer;
import data.Asus;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
       String Nama, Prosesor, Os, Storage;
            int Stok, Core, Ram;
            
            Scanner masukan = new Scanner(System.in);
            
            Asus A456UR = new Asus();
            Acer aspire = new Acer();
            
            /* asus test*/
            A456UR.AsusSlogan();
            System.out.print("Nama : "); Nama = masukan.nextLine();
            System.out.print("Prosesor : "); Prosesor = masukan.nextLine();
            System.out.print("Jumlah Core : "); Core = masukan.nextInt();masukan.nextLine();
            System.out.print("Operating System : "); Os = masukan.nextLine();
            System.out.print("Ukuran RAM(GB): "); Ram = masukan.nextInt();masukan.nextLine();
            System.out.print("Jenis Storage : "); Storage = masukan.nextLine();
            System.out.print("Stok : "); Stok = masukan.nextInt();masukan.nextLine();
            System.out.println("");
            A456UR.setNama(Nama);
            A456UR.setProsesor(Prosesor);
            A456UR.setCore(Core);
            A456UR.setOs(Os);
            A456UR.setRam(Ram);
            A456UR.setStorage(Storage);
            A456UR.setStok(Stok);
            A456UR.getAllLaptopData();
            System.out.println("Store Position " + A456UR.getNama() + 
                    " adalah " + A456UR.getStorePositionLaptop());
            System.out.println("==========================================");
                            
            /* acer test */
            aspire.acerSlogan();
            System.out.print("Nama : "); Nama = masukan.nextLine();
            System.out.print("Prosesor : "); Prosesor = masukan.nextLine();
            System.out.print("Jumlah Core : "); Core = masukan.nextInt();masukan.nextLine();
            System.out.print("Operating System : "); Os = masukan.nextLine();
            System.out.print("Ukuran RAM(GB): "); Ram = masukan.nextInt();masukan.nextLine();
            System.out.print("Jenis Storage : "); Storage = masukan.nextLine();
            System.out.print("Stok : "); Stok = masukan.nextInt();masukan.nextLine();
            System.out.println("");
            aspire.setNama(Nama);
            aspire.setProsesor(Prosesor);
            aspire.setCore(Core);
            aspire.setOs(Os);
            aspire.setRam(Ram);
            aspire.setStorage(Storage);
            aspire.setStok(Stok);
            aspire.getAllLaptopData();
            System.out.println("Store Position " + aspire.getNama() + 
                    " adalah " + aspire.getStorePositionLaptop());
            System.out.println("==========================================");       
        }
    }
    
