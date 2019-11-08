package UZ.lista4;

import java.util.Random;

public class Zadanie1 {
    private int[] array = new int[30];
    private int[] copy = new int[30];

    private void setCopy() {
        this.copy = array.clone();
    }

    private Random randomGenerator = new Random();

    private void setArray(int start, int end) {
        for (int i = 0; i < 30; i++) {
            array[i] = randomGenerator.nextInt(end - start) + start;
        }
    }

    public void run() {
        setArray(99, 150);
        for (int i = 0; i < 30; i++) {
            System.out.println(array[i]);
        }

        setCopy();
    }
}
