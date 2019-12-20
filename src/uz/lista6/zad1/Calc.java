package uz.lista6.zad1;

import java.util.ArrayList;

public class Calc {
    float result = 0;

    ArrayList<Float> numbers = new ArrayList();

    public void clearCalc() {
        this.result = 0;
    }

    Calc(float a) {
        numbers.add(a);
    }

    Calc(float a, float b, float c, float d) {
        numbers.add(a);
        numbers.add(b);
        numbers.add(c);
        numbers.add(d);

    }

    public Calc(float a, float b, float c, float d, float e, float f, float g) {
        numbers.add(a);
        numbers.add(b);
        numbers.add(c);
        numbers.add(d);
        numbers.add(e);
        numbers.add(f);
        numbers.add(g);

    }

    Calc(Calc calc) {
        this.result = calc.result;
        this.numbers = calc.numbers;
    }

    public String add() {
        String text = "";
        for (int i = 0; i < numbers.size(); i++) {
            result += numbers.get(i);
            text += numbers.get(i);
            if (i != numbers.size() - 1)
                text += " + ";
        }
        text += " = " + result;
        return text;
    }


}
