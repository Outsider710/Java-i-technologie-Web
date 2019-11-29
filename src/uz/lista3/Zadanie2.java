package uz.lista3;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadanie2 {
    private Scanner scanner = new Scanner(System.in);
    private ArrayList<Integer> dividers = new ArrayList<Integer>();
    private int number;

    private void setNumber() {
        this.number = scanner.nextInt();
    }

    public void run(){
        System.out.println("Podaj liczbe: ");
        setNumber();
        for(int i = (number/2); i > 0 ;i--)
        {
            if(number%i==0)dividers.add(i);
        }

        System.out.println("Dzielniki liczby " + number+ " to: " + dividers);
    }

}
