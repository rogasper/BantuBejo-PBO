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
public class Keramik {
    char jenis;
    int panjang, lebar, satuBox, harga, dibutuhkan = 100, totalSeluruhBox, totalHarga;
    float hasilLuas;
    
    
    int hitungLuas(){
        return this.panjang * this.lebar;
    }
    
    float convertToMeter(){
        return this.hasilLuas = this.hasilLuas/10000;
    }
    
    float luasSatuBox(){
        return this.hasilLuas = this.hasilLuas * this.satuBox;
    }
    void totalBox(){
        float butuh;
        butuh = this.dibutuhkan / this.hasilLuas;
        butuh = (int)Math.round(butuh);
        this.totalSeluruhBox = (int)butuh;
        System.out.println("Keramik "+ this.jenis +" membutuhkan kurang lebih "+this.totalSeluruhBox+" box untuk menutupi "+this.dibutuhkan+" m2");
    }
    
    void totalBiaya(){
        totalHarga = this.totalSeluruhBox * this.harga;
        System.out.println("jadi biaya total Keramik "+this.jenis+" menjadi Rp."+totalHarga);
        
    }
    
    
}
