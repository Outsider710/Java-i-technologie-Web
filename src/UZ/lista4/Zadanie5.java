package UZ.lista4;

import java.util.Random;

public class Zadanie5 {
    private int[] tab = new int[40];
    private Random randomGenerator = new Random();

    public Zadanie5() {
        setTab();
    }

    public void showTab() {
        for (int i = 0; i < 40; i++) {
            System.out.println(i + ": " + tab[i]);
        }
    }

    private void setTab() {
        for (int i = 0; i < 40; i++) {
            if (i > 30) {
                tab[i] = randomGenerator.nextInt(15) + 60;
            } else if (i > 20) {
                tab[i] = randomGenerator.nextInt(44) + 11;
            } else if (i > 10) {
                tab[i] = randomGenerator.nextInt(4) + 6;
            } else {
                tab[i] = randomGenerator.nextInt(5);
            }
        }

    }
}
