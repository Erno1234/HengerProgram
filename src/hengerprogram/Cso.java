
package hengerprogram;

public class Cso extends TomorHenger{
    
    private double falvastagsag;
    
    public Cso(double r, double m, double fajsuly, double falvastagsag) {
        super(r, m, fajsuly);
        this.falvastagsag = falvastagsag;
    }
    
    public Cso(double r, double m, double fajsuly) {
        super(r, m, fajsuly);
    }

    public double getFalvastagsag() {
        return falvastagsag;
    }
    
    @Override
    public double terfogat(){
        return 0;
    }

    @Override
    public String toString() {
        return "Cso{" + "falvastagsag=" + falvastagsag + '}';
    }
    
}
