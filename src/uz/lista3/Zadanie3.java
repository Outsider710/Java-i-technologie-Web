package uz.lista3;

import java.util.Random;
import java.util.Scanner;

public class Zadanie3 {
    private Scanner scanner = new Scanner(System.in);
    private int randomNumber = new Random().nextInt(200);
    private int userNumber;

    private void setUserNumber() {
        do {
            this.userNumber = scanner.nextInt();
            if (userNumber < 0 || userNumber > 200) System.out.println("Bledna liczba.");
        } while (userNumber < 0 || userNumber > 200);
    }

    public void run() {
        do {
            System.out.println("Podaj liczbe");
            setUserNumber();
            if (userNumber > randomNumber) {
                System.out.println("Za duzo");
            } else if (userNumber < randomNumber) {
                System.out.println("za malo");
            }
        } while (randomNumber != userNumber);
        System.out.println("Gratulacje, trafiles wylosowana liczba to: " + randomNumber);
    }

}
