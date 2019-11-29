package uz.lista5.auta;

import java.util.Date;

public class Samochod {
    private String marka;
    private String model;
    private int pojemnosc;
    private TypAuta typ;
    private String silnik;
    private int rokProdukcji;
    private Date dataPierwszejRejestracji;
    private float cena;

    public Samochod(){}

    public Samochod(String marka, String model, int pojemnosc, TypAuta typ, String silnik, int rokProdukcji, Date dataPierwszejRejestracji, float cena) {
        this.marka = marka;
        this.model = model;
        this.pojemnosc = pojemnosc;
        this.typ = typ;
        this.silnik = silnik;
        this.rokProdukcji = rokProdukcji;
        this.dataPierwszejRejestracji = dataPierwszejRejestracji;
        this.cena = cena;

    }

    public void naGwarancjii() {
        Date dzis = new Date();
        System.out.println(dzis.getDay() - dataPierwszejRejestracji.getDay() <= 730 ?
                "Auto jest jeszcze na gwarancji." : "Auto nie jest już na gw arancji.");
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getMarka() {
        return marka;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setPojemnosc(int pojemnosc) {
        this.pojemnosc = pojemnosc;
    }

    public int getPojemnosc() {
        return pojemnosc;
    }

    public void setTyp(TypAuta typ) {
        this.typ = typ;
    }

    public TypAuta getTyp() {
        return typ;
    }

    public void setSilnik(String silnik) {
        this.silnik = silnik;
    }

    public String getSilnik() {
        return silnik;
    }

    public void setRokProdukcji(int rokProdukcji) {
        this.rokProdukcji = rokProdukcji;
    }

    public int getRokProdukcji() {
        return rokProdukcji;
    }

    public void setDataPierwszejRejestracji(Date dataPierwszejRejestracji) {
        this.dataPierwszejRejestracji = dataPierwszejRejestracji;
    }

    public Date getDataPierwszejRejestracji() {
        return dataPierwszejRejestracji;
    }

    public void setCena(float cena) {
        this.cena = cena;
    }

    public float getCena() {
        return cena;
    }
}