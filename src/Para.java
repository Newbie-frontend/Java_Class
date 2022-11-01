public class Para {
    private double toplamTutar;
    private double odenenTutar;

    public double getToplamTutar() {
        return toplamTutar;
    }

    public void setToplamTutar(double toplamTutar) {
        this.toplamTutar = toplamTutar;
    }

    public double getOdenenTutar() {
        return odenenTutar;
    }

    public void setOdenenTutar(double odenenTutar) {
        this.odenenTutar = odenenTutar;
    }

    private double cikar() {
        return this.odenenTutar - this.toplamTutar;
    }

    public void yazdir() {
        double temp = this.cikar();
        System.out.println(temp);
        int ikiyuzluk = 0;
        int yuzluk = 0;
        int ellilik = 0;
        int yirmilik = 0;
        int onluk = 0;
        int beslik = 0;
        int birlik = 0;
        int ellikurusluk = 0;
        int yirmibeskurusluk = 0;
        int onkurusluk = 0;
        int beskurusluk = 0;
        String cikti = "";
        if (temp >= 200) {
            ikiyuzluk = (int) (temp / 200);
            temp = temp % 200;
            cikti += ikiyuzluk + " adet 200t. ";
        }
        if (temp >= 100) {
            yuzluk = (int) (temp / 100);
            temp = temp % 100;
            cikti += yuzluk + " adet 100t. ";
        }
        if (temp >= 50) {
            ellilik = (int) (temp / 50);
            temp = temp % 50;
            cikti += ellilik + " adet 50t. ";
        }
        if (temp >= 20) {
            yirmilik = (int) (temp / 20);
            temp = temp % 20;
            cikti += yirmilik + " adet 20t. ";
        }
        if (temp >= 10) {
            onluk = (int) (temp / 10);
            temp = temp % 10;
            cikti += onluk + " adet 10t. ";
        }
        if (temp >= 5) {
            beslik = (int) (temp / 5);
            temp = temp % 5;
            cikti += beslik + " adet 5t. ";
        }
        if (temp >= 1) {
            birlik = (int) (temp / 1);
            temp = temp % 1;
            cikti += birlik + " adet 1t. ";
        }
        if (temp >= 0.5) {
            ellikurusluk = (int) (temp / 0.5);
            temp = temp % 0.5;
            cikti += ellikurusluk + " adet 50 kurus. ";
        }
        if (temp >= 0.25) {
            yirmibeskurusluk = (int) (temp / 0.25);
            temp = temp % 0.25;
            cikti += yirmibeskurusluk + " adet 25 kurus. ";
        }
        if (temp >= 0.1) {
            onkurusluk = (int) (temp / 0.1);
            temp = temp % 0.1;
            cikti += onkurusluk + " adet 10 kurus. ";
        }
        if (temp >= 0.05) {
            beskurusluk = (int) (temp / 0.05);
            temp = temp % 0.05;
            cikti += beskurusluk + " adet 5 kurus. ";
        }

        System.out.println("Result: " + cikti);
    }
}
