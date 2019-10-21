package latihanpraktikum1;

public class UjiBus {

    public static void main(String[] args) {
        //membuat objek busmini dari kelas bus
        Bus busMini = new Bus();
        //memasukkan nilai jumlah penumpang dan penumpang maksimal ke
        //dalam objek bus mini
        busMini.penumpang=5;
        busMini.maxPenumpang=15;
        //memanggil method cetak pada kelas bus
        busMini.cetak();
        
        //menambahkan penumpang pada busmini
        busMini.penumpang = busMini.penumpang + 5;
        //memanggil method cetak pada kelasbus
        busMini.cetak();
        
        //mengurangi jumlah penumpang pada busmini
        busMini.penumpang = busMini.penumpang- 2;
        busMini.cetak();
        
    }

    UjiBus(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
