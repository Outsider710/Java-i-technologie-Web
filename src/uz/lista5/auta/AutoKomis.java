package uz.lista5.auta;

import java.util.*;

public class AutoKomis {
    List<Samochod> samochody = new List<Samochod>() {
        @Override
        public int size() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public boolean contains(Object o) {
            return false;
        }

        @Override
        public Iterator<Samochod> iterator() {
            return null;
        }

        @Override
        public Object[] toArray() {
            return new Object[0];
        }

        @Override
        public <T> T[] toArray(T[] ts) {
            return null;
        }

        @Override
        public boolean add(Samochod samochod) {
            return false;
        }

        @Override
        public boolean remove(Object o) {
            return false;
        }

        @Override
        public boolean containsAll(Collection<?> collection) {
            return false;
        }

        @Override
        public boolean addAll(Collection<? extends Samochod> collection) {
            return false;
        }

        @Override
        public boolean addAll(int i, Collection<? extends Samochod> collection) {
            return false;
        }

        @Override
        public boolean removeAll(Collection<?> collection) {
            return false;
        }

        @Override
        public boolean retainAll(Collection<?> collection) {
            return false;
        }

        @Override
        public void clear() {

        }

        @Override
        public Samochod get(int i) {
            return null;
        }

        @Override
        public Samochod set(int i, Samochod samochod) {
            return null;
        }

        @Override
        public void add(int i, Samochod samochod) {

        }

        @Override
        public Samochod remove(int i) {
            return null;
        }

        @Override
        public int indexOf(Object o) {
            return 0;
        }

        @Override
        public int lastIndexOf(Object o) {
            return 0;
        }

        @Override
        public ListIterator<Samochod> listIterator() {
            return null;
        }

        @Override
        public ListIterator<Samochod> listIterator(int i) {
            return null;
        }

        @Override
        public List<Samochod> subList(int i, int i1) {
            return null;
        }
    };

    public AutoKomis() {

        samochody.add(new Samochod("VW", "Passat B5 FL", 1854, TypAuta.KOMBI, "Diesel", 1999, new Date(1999, 1, 12), 4500));
        samochody.add(new Samochod("VW", "Golf 4", 1854, TypAuta.KOMBI, "Diesel", 2000, new Date(2001, 7, 12), 7000));
        samochody.add(new Samochod("Seat","Leon",1800,TypAuta.COUPE,"Benzyna",2005,new Date(2001, 7, 12),9500));
        samochody.add(new Samochod("Subaru","SVX",3500,TypAuta.COUPE,"Benzyna",1987,new Date(1987, 7, 12),15000));
/*
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
        */
    }
}
