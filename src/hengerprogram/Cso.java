
package hengerprogram;

public class Cso extends TomorHenger{
    
    private double falvastagsag;
    
     public Cso(double r, double m, double fajsuly) {
        this(r, m, fajsuly, 1.0);
    }
     
    public Cso(double r, double m, double fajsuly, double falvastagsag) {
        super(r, m, fajsuly);
        this.falvastagsag = falvastagsag;
    }

    public double getFalvastagsag() {
        return falvastagsag;
    }

    @Override
    public double terfogat() {
        return super.terfogat();
    }
    
    @Override
    public String toString() {
        return "Cso{" + "falvastagsag=" + falvastagsag + '}';
    }
    
}
