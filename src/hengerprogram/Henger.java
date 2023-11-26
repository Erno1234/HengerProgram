
package hengerprogram;

public class Henger {
    private int hengerDarab;
    private double sugar, magassag;

    public Henger(double r, double m){
        this.sugar = r;
        this.magassag = m;
    }

    public int getHengerDarab() {
        return hengerDarab;
    }

    public double getSugar() {
        return sugar;
    }

    public double getMagassag() {
        return magassag;
    }
    public double terfogat(){ 
        return Math.pow(sugar,2)*Math.PI*magassag ;
    }

    @Override
    public String toString() {
        return "Henger{" + "hengerDarab=" + hengerDarab + ", sugar=" + sugar + ", magassag=" + magassag + '}';
    }
    
}
