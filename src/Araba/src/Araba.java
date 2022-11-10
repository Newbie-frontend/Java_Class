public class Araba {
    private String plaka;
    private String marka;
    private String model;
    private String renk;
    private int yil;
    private int kilometre;
    private String sinif;

    public Araba(String marka, String model, String renk, int yil, String sinif, String plaka, int kilometre) {
        this.marka = marka;
        this.model = model;
        this.renk = renk;
        this.yil = yil;
        this.sinif = sinif;
        this.plaka = plaka;
        this.kilometre = kilometre;
    }

    public Araba() {

    }

    public String getPlaka() {
        return plaka;
    }

    public void setPlaka(String plaka) {
        this.plaka = plaka;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        this.yil = yil;
    }

    public int getKilometre() {
        return kilometre;
    }

    public void setKilometre(int kilometre) {
        this.kilometre = kilometre;
    }

    public String getSinif() {
        return sinif;
    }

    public void setSinif(String sinif) {
        this.sinif = sinif;
    }

    public void bilgiYazdir() {
        System.out.println(
                "Marka: " + this.marka + "\n" +
                        "Model: " + this.model + "\n" +
                        "Renk: " + this.renk + "\n" +
                        "Yil: " + this.yil + "\n" +
                        "Sinif: " + this.sinif + "\n" +
                        "Plaka: " + this.plaka + "\n" +
                        "Kilometre: " + this.kilometre);
    }
}
