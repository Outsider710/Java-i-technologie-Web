package uz.lista5.auta;

import java.util.Date;

public class AutoKomis {
    Samochod[] samochody = new Samochod[10];

    public AutoKomis() {

        samochody[0] = new Samochod("VW","Passat B5 FL",1854,TypAuta.KOMBI,"Diesel",1999,new Date(1999, 1, 12),4500);

        samochody[1].setMarka("VW");
        samochody[1].setModel("Golf 4");
        samochody[1].setPojemnosc(1854);
        samochody[1].setTyp(TypAuta.KOMBI);
        samochody[1].setSilnik("Diesel");
        samochody[1].setRokProdukcji(2000);
        samochody[1].setDataPierwszejRejestracji(new Date(2001, 7, 12));
        samochody[1].setCena(7000);

        samochody[2].setMarka("Seat");
        samochody[2].setModel("Leon");
        samochody[2].setPojemnosc(1800);
        samochody[2].setTyp(TypAuta.COUPE);
        samochody[2].setSilnik("Benzyna");
        samochody[2].setRokProdukcji(2005);
        samochody[2].setDataPierwszejRejestracji(new Date(2001, 7, 12));
        samochody[2].setCena(9500);

        samochody[3].setMarka("Subaru");
        samochody[3].setModel("SVX");
        samochody[3].setPojemnosc(3500);
        samochody[3].setTyp(TypAuta.COUPE);
        samochody[3].setSilnik("Benzyna");
        samochody[3].setRokProdukcji(1987);
        samochody[3].setDataPierwszejRejestracji(new Date(1987, 7, 12));
        samochody[3].setCena(15000);

        samochody[4].setMarka("VW");
        samochody[4].setModel("Golf IV R32");
        samochody[4].setPojemnosc(3200);
        samochody[4].setTyp(TypAuta.HATCHBACK);
        samochody[4].setSilnik("Benzyna");
        samochody[4].setRokProdukcji(1999);
        samochody[4].setDataPierwszejRejestracji(new Date(1999, 1, 12));
        samochody[4].setCena(25000);

        samochody[5].setMarka("BMW");
        samochody[5].setModel("E36");
        samochody[5].setPojemnosc(1600);
        samochody[5].setTyp(TypAuta.SEDAN);
        samochody[5].setSilnik("Benzyna");
        samochody[5].setRokProdukcji(1992);
        samochody[5].setDataPierwszejRejestracji(new Date(1992, 3, 12));
        samochody[5].setCena(1500);

        samochody[6].setMarka("Dacia");
        samochody[6].setModel("Sandero Stepway");
        samochody[6].setPojemnosc(1600);
        samochody[6].setTyp(TypAuta.SUV);
        samochody[6].setSilnik("Benzyna");
        samochody[6].setRokProdukcji(2019);
        samochody[6].setDataPierwszejRejestracji(new Date(2019, 7, 12));
        samochody[6].setCena(51000);

        samochody[7].setMarka("Renaulit");
        samochody[7].setModel("Megane II");
        samochody[7].setPojemnosc(2000);
        samochody[7].setTyp(TypAuta.KABRIOLET);
        samochody[7].setSilnik("Benzyna");
        samochody[7].setRokProdukcji(2006);
        samochody[7].setDataPierwszejRejestracji(new Date(2006, 7, 12));
        samochody[7].setCena(10000);

        samochody[8].setMarka("Mercedes-Benz");
        samochody[8].setModel("GLK");
        samochody[8].setPojemnosc(2200);
        samochody[8].setTyp(TypAuta.SUV);
        samochody[8].setSilnik("Diesel");
        samochody[8].setRokProdukcji(2014);
        samochody[8].setDataPierwszejRejestracji(new Date(2014, 7, 12));
        samochody[8].setCena(85000);

        samochody[9].setMarka("Toyota");
        samochody[9].setModel("Supra");
        samochody[9].setPojemnosc(3000);
        samochody[9].setTyp(TypAuta.COUPE);
        samochody[9].setSilnik("Benzyna");
        samochody[9].setRokProdukcji(1995);
        samochody[9].setDataPierwszejRejestracji(new Date(1995, 7, 12));
        samochody[9].setCena(275000);
    }
}
