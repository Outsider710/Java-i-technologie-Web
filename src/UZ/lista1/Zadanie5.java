package UZ.lista1;

import java.util.Scanner;

public class Zadanie5 {
    private double a, b;
    private char sign;
    private Scanner scanner = new Scanner(System.in);

    private void setA() {
        this.a = scanner.nextDouble();
    }

    private void setB() {
        this.b = scanner.nextDouble();
    }

    private void setSign() {
        this.sign = scanner.next().charAt(0);
    }

    public void run() {
        try {
            System.out.println("podaj dzialanie: ");
            setA();
            setSign();
            setB();

            switch (sign) {
                case '*':
                    System.out.println(" = " + (a * b));
                    break;
                case '/':
                    System.out.println(" = " + (a / b));
                    break;
                case '+':
                    System.out.println(" = " + (a + b));
                    break;
                case '-':
                    System.out.println(" = " + (a - b));
                    break;
            }
        } catch (Exception exception) {
            System.out.println("Nie można wykonać dzialania");
        }
    }


}
