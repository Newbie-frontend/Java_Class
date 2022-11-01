public class DortIslem {
    private double sayi1;
    private double sayi2;

    public DortIslem(double sayi1, double sayi2) {
        this.sayi1 = sayi1;
        this.sayi2 = sayi2;
    }

    public double topla() {
        return this.sayi1 + this.sayi2;
    }
    public double cikar() {
        return this.sayi1 - this.sayi2;
    }
    public double carp() {
        return this.sayi1 * this.sayi2;
    }
    public double bol() {
        return this.sayi1 / this.sayi2;
    }
}
