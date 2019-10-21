
package latihanpraktikum1;


public class UjiBus2 {
    public static void main(String[] args) {
        //membuat objek busBesar dari class Bus
        Bus2 busBesar = new Bus2(40);
        busBesar.cetak();
        
        //penambahan penumpang
        busBesar.addPenumpang(15);//menambahkan 15 penumpang
        busBesar.cetak();
        
        //penambahan penumpang
        busBesar.addPenumpang(5);//menambah 5 penumpang
        busBesar.cetak();
        
        //penambahan penumpang
        busBesar.addPenumpang(26);//menambah 26 penumpang
        busBesar.cetak();
    }
}
