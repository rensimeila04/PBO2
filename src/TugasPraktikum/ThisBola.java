package TugasPraktikum;

public class ThisBola {

    private double jarijari;

    public ThisBola(double jarijari) {
        this.jarijari = jarijari;
    }

    public void setjarijari(double jarijari) {
        this.jarijari = jarijari;
    }

    public void showDiameter() {
        System.out.println("Diameter  = " + 2 * jarijari);

    }

    public void showLuasPermukaanBola() {
        System.out.println("LuasPermukaanBola  = "+(4*Math.PI*Math.pow(jarijari, 2)));
    }
    public void showVolume(){
        System.out.println("Volume = "+(4/3*Math.PI*Math.pow(jarijari, 3)));
    }
}
