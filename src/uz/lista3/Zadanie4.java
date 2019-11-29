package uz.lista3;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadanie4 {
    Scanner scanner = new Scanner(System.in);
    private ArrayList<Integer> numberList = new ArrayList<Integer>();

    private void setNumberList() {
        int actualNumber;
        do {
            actualNumber = scanner.nextInt();
            numberList.add(actualNumber);
        } while (actualNumber != 5);
    }

    public void run(){
        System.out.println("Podaj liczby calokowite aby zakonczyc podawanie podaj liczbe 5");
        setNumberList();

        int productOfNumbers = getProductOfNumbers();

        System.out.println("iloczyn liczb to: "+ productOfNumbers);

    }

    private int getProductOfNumbers() {
        int productOfNumbers=1;
        for(int item : numberList)
        {
            productOfNumbers*=item;
        }
        return productOfNumbers;
    }

}
