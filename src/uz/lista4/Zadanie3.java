package uz.lista4;

public class Zadanie3 {
    private boolean[] trueOrFalseArray = new boolean[40];

    public void setTrueOrFalseArray() {
        for (int i = 0; i < 40; i++) {
            trueOrFalseArray[i] = i % 2 == 0;
        }
    }
    public void run(){
        setTrueOrFalseArray();
    }

}
