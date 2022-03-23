/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.Scanner;

public class LaptopApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  
        String nama = "Aldina";
        String Brand= "Acer";
        String namaPrs = "Intel";
        String SO = "Windows";
        String storage = "kok";
        int UkuranRAM = 2;
        int stok = 10;
        int jmlCore = 2;
        
        Laptop lap1 = new Laptop(nama, Brand, namaPrs, SO) ;
        Laptop lap2 = new Laptop( jmlCore, storage, UkuranRAM, stok);
        
        System.out.print("Nama\t: ");
        nama = input.nextLine();
        System.out.print("Brand\t: ");
        Brand = input.nextLine();
        System.out.print("Nama Processor\t: ");
        namaPrs = input.nextLine();
        System.out.print("Sistem Operasi\t: ");
        SO = input.nextLine();
        System.out.print("Jenis Storage\t: ");
        storage = input.nextLine();
        System.out.print("Jumlah core pada processor : ");
        jmlCore = input.nextInt();
        System.out.print("Ukuran RAM dalama GB\t: ");
        UkuranRAM = input.nextInt();
        System.out.print("Stok\t: ");
        stok = input.nextInt();
        
        System.out.println("\n=======================================");
        System.out.println("Nama\t\t\t   : " + nama);
        System.out.println("Brand\t\t\t   : " + Brand);
        System.out.println("Nama Processor\t\t   : " +namaPrs);
        System.out.println("Jumlah core pada processor : " + jmlCore);
        System.out.println("Sistem Operasi\t\t   : " +SO);
        System.out.println("Ukuran RAM dalam GB\t   : " + UkuranRAM);
        System.out.println("Jenis Storage\t\t   : " + storage);
        System.out.println("Stok\t\t\t   : " + stok);
    }
    
}
