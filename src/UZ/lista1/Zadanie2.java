package UZ.lista1;

import java.util.Scanner;

import static java.lang.System.out;
import static java.lang.System.setErr;


public class Zadanie2 {
    private double a, b, c;
    private Scanner scanner = new Scanner(System.in);

    private void setA() {
        this.a = scanner.nextDouble();
    }

    private void setB() {
        this.b = scanner.nextDouble();
    }

    private void setC() {
        this.c = scanner.nextDouble();
    }

    public void run() {

        out.println("Aby rozpocząć liczenie funkcji kwadratowej podaj wspolczynniki A, B oraz C: ");

        try {
            setA();
            setB();
            setC();
        } catch (Exception exception) {
            out.println("Podano niedpowiedni znak.");
        }

        double delta = b * b - 4 * a * c;

        if (delta < 0) {
            out.println("Delta mniejsza od 0 nie mozna obliczyc pierwiastkow.");
        } else if (delta == 0) {
            double pierwiastek = -b / 2 * a;
            out.println("Pierwiastek równania to:" + pierwiastek);
        } else {
            double x1 = (-b - Math.sqrt(delta)) / 2 * a;
            double x2 = (-b + Math.sqrt(delta)) / 2 * a;

            out.println("Pierwiastki równania to: x1= " + x1 + " x2= " + x2);
        }

        out.println(delta);


    }
}
