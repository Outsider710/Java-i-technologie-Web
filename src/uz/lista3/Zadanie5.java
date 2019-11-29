package uz.lista3;

import java.util.Scanner;

public class Zadanie5 {
    private Scanner scanner = new Scanner(System.in);
    private int userNumber;

    private void setScanner(){
        this.userNumber = scanner.nextInt();
    }

    public void run(){
        System.out.println("Podaj liczbe");
        for(int i = --userNumber; i > 0 ; i--){
            System.out.println(Math.pow(3,userNumber));
        }
    }
}
