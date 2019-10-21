package TugasPraktikum;

public class UjiBola {
    public static void main(String[] args) {
        double jarijari=14;
        
        ThisBola bola = new ThisBola(7);
        bola.showDiameter();
        bola.showLuasPermukaanBola();
        bola.showVolume();
        System.out.println(" ");
        bola.setjarijari(jarijari);
        bola.showDiameter();
        bola.showLuasPermukaanBola();
        bola.showVolume();
    }
}
