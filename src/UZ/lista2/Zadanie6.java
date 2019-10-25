package UZ.lista2;

import java.util.Scanner;

public class Zadanie6 {
    private Scanner scanner = new Scanner(System.in);
    private double cena, wklad, oprocentowanie = 2, rata;
    int okres;

    private void setCena() {
        do {
            this.cena = scanner.nextDouble();
        }
        while (cena - wklad > 300000 && cena - wklad < 0);
    }

    private void setWklad() {
        do {
            this.wklad = scanner.nextDouble();
        }
        while (wklad < 0);

    }

    private void setOkres() {
        do {
            this.okres = scanner.nextInt();
        }
        while (okres < 97 && okres < 0);

    }

    public void run() {
        System.out.println("wklad wlasny");
        setWklad();

        System.out.println("Podaj cene auta");
        setCena();

        System.out.println("oraz okres kredytu");
        setOkres();

        cena -= wklad;

        setOprocentowanie();
        cena += cena * oprocentowanie/100;

        rata = cena / okres;

        System.out.println("Miesieczna rata wynosi: " + rata);


    }

    private void setOprocentowanie() {
        if (okres == 96) oprocentowanie++;
        if (okres >= 72) oprocentowanie++;
        if (okres >= 60) oprocentowanie++;
        if (okres >= 48) oprocentowanie++;
        if (okres >= 24) oprocentowanie++;
    }
}
