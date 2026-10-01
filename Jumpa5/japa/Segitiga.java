public class Segitiga extends BangunDatar {

    private final double alas;
    private final double tinggi;
    private final double sisiMiring;

    public Segitiga(double alas, double tinggi, double sisiMiring) {
        super("Segitiga");
        // TODO 1: tolak sisi <= 0.
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisiMiring = sisiMiring;
    }

    // TODO 2: lengkapi luas() dan keliling().
    @Override
    public double luas() { // semi-perimeter
        return 0.5 * alas * tinggi; // Heron's formula
    }

    @Override
    public double keliling() {
        return alas + tinggi + sisiMiring;
    }

    @Override 
    public  String toString(){
        return getNama() + "(alas=" + alas + ",tinggi:=" + tinggi + ", sisi=" + sisiMiring + ") luas=" +luas();
    }

}