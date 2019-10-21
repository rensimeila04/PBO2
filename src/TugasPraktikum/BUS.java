package TugasPraktikum;

public class BUS {

    public double penumpang;
    public double maxPenumpang;
    int counter;

    //konstruktor kelas Bus
    public BUS(double maxPenumpang) {
        this.maxPenumpang = maxPenumpang;
        penumpang = 0;
    }

    //method untuk menambahkan penumpang
    public void addPenumpang(int penumpang) {
        double temp;
        temp = this.penumpang + penumpang;
        if (temp >= maxPenumpang) {
            System.out.println("Penumpang melebihi kuota");
        } else {
            this.penumpang = temp;
            counter++;
        }
    }

    public void cetak() {
        System.out.println("Penumpang Bus sekarang adalah " + penumpang);
        System.out.println("Penumpang maksimum seharusnya adalah " + maxPenumpang);
    }

    public void getpenumpang(int password) {
        if (password == 1234) {
            System.out.println("Password benar");
            addPenumpang(75);
        } else {
            System.out.println("Password salah");
        }
    }

    public void cetakpenumpang() {
        System.out.println("penumpang bus sekarang = " + penumpang);
        System.out.println("Maksimum penumpang yang seharusnya adalah = " + maxPenumpang);
    }
    public double getAverage(){
        return penumpang/counter;
        
        
        
      
    }
            
}
