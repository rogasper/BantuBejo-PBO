/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bantubejo;

/**
 *
 * @author Rogasper
 */
public class BantuBejo {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // KERAMIK A        
        Keramik keramikA = new Keramik();
        keramikA.jenis = 'A';
        keramikA.lebar = 30;
        keramikA.panjang = 30;
        keramikA.satuBox = 10;
        keramikA.harga = 54000;
        keramikA.hasilLuas = keramikA.hitungLuas();
        keramikA.convertToMeter();
        keramikA.luasSatuBox();
        keramikA.totalBox();
        keramikA.totalBiaya();
        
        
        // KERAMIK B        
        Keramik keramikB = new Keramik();
        keramikB.jenis = 'B';
        keramikB.lebar = 40;
        keramikB.panjang = 40;
        keramikB.satuBox = 5;
        keramikB.harga = 65000;
        keramikB.hasilLuas = keramikB.hitungLuas();
        keramikB.convertToMeter();
        keramikB.luasSatuBox();
        keramikB.totalBox();
        keramikB.totalBiaya();
        
        
        // KERAMIK C        
        Keramik keramikC = new Keramik();
        keramikC.jenis = 'C';
        keramikC.lebar = 30;
        keramikC.panjang = 40;
        keramikC.satuBox = 8;
        keramikC.harga = 60000;
        keramikC.hasilLuas = keramikC.hitungLuas();
        keramikC.convertToMeter();
        keramikC.luasSatuBox();
        keramikC.totalBox();
        keramikC.totalBiaya();
        
        // KESIMPULAN
        System.out.println("Kesimpulannya keramik yang paling murah adalah Keramik "+keramikA.jenis);
        System.out.println("dengan harganya adalah Rp."+keramikA.totalHarga);
    }
    
}
