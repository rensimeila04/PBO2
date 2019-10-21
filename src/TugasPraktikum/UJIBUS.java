package TugasPraktikum;

public class UJIBUS {
    
    public static void main(String[] abc) {
        BUS BUS = new BUS(210);
        BUS.cetakpenumpang();
        System.out.println(" ");

        //penambahan penumpang
        BUS.getpenumpang(1234);//password
        BUS.cetakpenumpang();
        //penambahan penumpang
        BUS.getpenumpang(234);
        BUS.cetakpenumpang();
        //penambahan penumpang
        BUS.getpenumpang(1234);//password
        BUS.cetakpenumpang();
        //penambahan penumpang
        BUS.getpenumpang(1234);//password
        BUS.cetakpenumpang();
        //penambahan penumpang
        BUS.getpenumpang(1234);//password
        BUS.cetakpenumpang();
        
        System.out.println("Rata-rata penumpang adalah = "+BUS.getAverage()+" kg");
        System.out.println("Jmlah penumpang sekarang adalah = "+BUS.counter);
        
    }
}
