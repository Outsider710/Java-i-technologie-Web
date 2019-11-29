package uz.lista4;

import java.util.Arrays;

public class Zadanie6 {
    private char[] charTab = new char[91 - 65];

    public Zadanie6() {
        setCharTab();
    }

    private void setCharTab() {
        for (int i = 65; i < 91; i++) {
            charTab[i - 65] = (char) i;
        }
    }

    public void run(){
        System.out.println(Arrays.toString(charTab) + " " + charTab.length);
    }

}
