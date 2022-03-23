/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

public class Laptop {
      String nama, brand, namaPrs, SO,storage;
      int jmlCore,UkRAM,stok;

        public Laptop(String nama, String Brand, String namaPrs, String SO){ 
          this.nama     = nama;
          this.brand    = brand;
          this.namaPrs  = namaPrs;
          this.SO       = SO;
        }
        
        public Laptop(int jmlCore, String storage, int UkRAM, int stok){
           this.UkRAM   = UkRAM;
           this.jmlCore = jmlCore;
           this.storage = storage;
           this.stok    = stok;
        }

    void setBrand(String acer) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    void getAllLaptopData() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    void setRam(int i) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    void setCore(int i) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    void setStok(int i) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    Object getStorage() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    }

