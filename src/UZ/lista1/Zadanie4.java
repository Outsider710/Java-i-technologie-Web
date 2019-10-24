package UZ.lista1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Zadanie4 {
    private Scanner scanner = new Scanner(System.in);
    public void run(){

        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.println("Podaj liczby, aby zakończyć wpisz dowolną literę: ");

        getData(list);

        int average = getAverage(list);

        Collections.sort(list);
        showDetails(list, average);
    }

    private void getData(ArrayList<Integer> list) {
        while (true) {
            try {
                int number = scanner.nextInt();
                list.add(number);
            } catch (Exception exception) {
                break;
            }
        }
    }

    private void showDetails(ArrayList<Integer> list, int average) {
        System.out.println("min" + list.get(0));
        System.out.println("max:" + list.get(list.size() - 1));
        System.out.println("liczba:" + list.size());
        System.out.println("srednia: " + average);
    }

    private int getAverage(ArrayList<Integer> list) {
        int sum = 0;
        for (int item : list) {
            sum += item;
        }
        return sum / list.size();
    }
}
