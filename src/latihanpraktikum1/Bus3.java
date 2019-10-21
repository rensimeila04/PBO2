/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanpraktikum1;

/**
 *
 * @author Asus
 */
public class Bus3 {
    
public int penumpang;
    public int maxPenumpang;
    
    //konstruktor kelas Bus
    public Bus3(int maxPenumpang){
        this.maxPenumpang = maxPenumpang;
        penumpang = 0;
    }
    
    //method untuk menambahkan penumpang
    public void addPenumpang(int penumpang){
        int temp;
        temp = this.penumpang+penumpang;
        if(temp>= maxPenumpang){
            System.out.println("Penumpang melebihi kuota");
        }else{
            this.penumpang = temp;
        }
    }
    public void cetak() {
        System.out.println("Penumpang Bus sekarang adalah " + penumpang);
        System.out.println("Penumpang maksimum seharusnya adalah " + maxPenumpang);
    }
    public void getpenumpang(int password){
        if (password==24) {
            System.out.println("Password benar");
            
        }else {
            System.out.println("Password salah");
        }
    }
    public void cetakpenumpang(){
        System.out.println("penumpang bus sekarang = "+penumpang);
        System.out.println("Maksimum penumpang yang seharusnya adalah = "+maxPenumpang);
    }
}
