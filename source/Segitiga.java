package source;

public class Segitiga {     // segitiga secara umum
    private double alas;
    private double tinggi;

    public Segitiga(double alas, double tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public double getAlas(){
        return alas;
    }

    public double getTinggi(){
        return tinggi;
    }

    public void setAlas(double alas){
        this.alas = alas;
    }

    public void setTinggi(double tinggi){
        this.tinggi = tinggi;
    }

    public double hitungLuas(){
        return (alas*tinggi)/2;
    }
}
