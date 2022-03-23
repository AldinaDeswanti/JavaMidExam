/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

    public class Acer extends Laptop {
    
        public Acer(String Nama, String Prosesor, int Core, 
        String Os, int Ram, String Storage, int Stok){
        super(Nama, "Acer", Prosesor, Core, Os, Ram, Storage, Stok);
    }
    
    public Acer(){
        super();
        super.setBrand("Acer");
    }
    
    public void acerSlogan(){
        System.out.println("");
        System.out.println("=======================");
        System.out.println("Acer");
        System.out.println("Acer. Purely You.");
        System.out.println("=======================");
        
    }
    @Override
    public void getAllLaptopData(){
        acerSlogan();
        super.getAllLaptopData();
        System.out.println("");
    }
    
    public void setRam(int angka){
        if(angka < 0){
            System.out.println("");
            System.out.println("Ukuran RAM tidak dapat lebih kecil dari nol!");
            System.out.println("Ukuran RAM diatur ke default (4 GB)");
            System.out.println("");
            super.setRam(4);
        }
    }
    
    public void setCore(int angka){
        if(angka < 0){
            System.out.println("");
            System.out.println("Jumlah Core tidak dapat lebih kecil dari nol!");
            System.out.println("Jumlah Core diatur ke default (Dual-Core)");
            System.out.println("");
            super.setCore(2);
        }
    }
    
    public void setStok(int angka){
        if(angka < 0){
            System.out.println("");
            System.out.println("Jumlah Stok Laptop tidak dapat lebih kecil dari nol!");
            System.out.println("Jumlah Stok diatur ke default (0 pcs)");
            System.out.println("");
            super.setStok(0);
        }
    }
    
//    Posisi Pada Etalase Toko
    public String getStorePositionLaptop(){
        String storage = super.getStorage().toLowerCase().replaceAll("\\s+","");
        switch(storage) {
            case "ssdm.2" -> {
                return "Best";
            }
            case "ssdsata" -> {
                return "Good";
            }
            case "hdd" -> {
                return "Middle";
            }
            default -> {
                    return "unidentified";
            }
        }
    }

    public void setNama(String Nama) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setProsesor(String Prosesor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setOs(String Os) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setStorage(String Storage) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNama() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

