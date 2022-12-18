package source;
public class Lingkaran implements BangunDatar {
    
    public final double phi = 3.14;
    private double jari2;

    public Lingkaran(double jari2) {
        this.jari2 = jari2;
    }

    public double getJari2() {
        return jari2;
    }

    public void setJari2(double jari2) {
        this.jari2 = jari2;
    }

    public double hitungLuas() {
        return phi * jari2 * jari2;
    }

    public double hitungKeliling() {
        KelilingLingkaran keliling = (double jari2) -> 2 * phi * jari2;

        return keliling.hitungKeliling(jari2);
    }
}
