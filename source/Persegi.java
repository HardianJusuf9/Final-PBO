package source;
public class Persegi implements BangunDatar {
    
    private double sisi;

    public Persegi(double sisi){
        this.sisi = sisi;
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public double hitungLuas() {
        return sisi * sisi;
    }
}
