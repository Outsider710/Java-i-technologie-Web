package uz.lista3;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadanie1 {
    private Scanner scanner = new Scanner(System.in);
    private ArrayList<Integer> numberList = new ArrayList<Integer>();
    private ArrayList<Integer> evenNumbersList = new ArrayList<Integer>();
    private ArrayList<Integer> oddNumbersList = new ArrayList<Integer>();

    private void setNumberList() {
        while (true)
            try {
                int actualNumber = scanner.nextInt();
                numberList.add(actualNumber);
            } catch (Exception exception) {
                break;
            }
    }

    public void run() {

        System.out.println("Podaj liste liczb (aby zaknczyc wcisnij dowolna litere): ");
        setNumberList();

        for (int item : numberList) {
            if (item % 2 == 0) {
                evenNumbersList.add(item);
            } else {
                oddNumbersList.add(item);
            }
        }


        System.out.println("liczby parzyste: " + evenNumbersList + "\nLiczby nie parzyste: " + oddNumbersList);

        int oddAverage = getAverage(oddNumbersList);
        int evenAverage = getAverage(evenNumbersList);

        int ratioOfNumbers = oddAverage / evenAverage;

        if(ratioOfNumbers == 0)
        {
            System.out.println("Srednia liczb parzystych jest za duza.");
        }

        for (int i = ratioOfNumbers / 2; i > 1; i--) {
            if (ratioOfNumbers % i != 0) {
                System.out.println("Liczba " + ratioOfNumbers + " nie jest liczba pierwsza");
                break;
            } else if (ratioOfNumbers % i == 0 && i == 2) {
                System.out.println("Liczba " + ratioOfNumbers + " jest liczba pierwsza");
            }
        }

    }

    private int getAverage(ArrayList<Integer> oddNumbersList) {
        int average;
        int oddSum = 0;
        for (int item : oddNumbersList) {
            oddSum += item;
        }
        return average = oddSum / oddNumbersList.size();
    }
}

