package UZ.lista4;

import java.util.Random;

public class Zadanie2 {
    private int[][] matrix = new int[7][7];
    private Integer[] min = new Integer[7];
    private Integer[] max = new Integer[7];
    private Integer[] average = new Integer[7];
    private Integer[] lessThanAverage = new Integer[7];
    private Integer[] moreThanAverage = new Integer[7];
    private Random randomGenerator = new Random();
    private Integer[][] revertCopy = new Integer[7][7];

    public Zadanie2() {
        setMatrix();
    }

    private void setRevertCopy() {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                revertCopy[i][j] = matrix[6 - i][6 - j];
            }
        }
    }

    public void run() {
        setMax();
        setMin();
        setAverage();
        setLessThanAverage();
        setMoreThanAverage();
        setRevertCopy();
    }

    private void setLessThanAverage() {
        for (int i = 0; i < 7; i++) {
            lessThanAverage[i] = 0;
            for (int j = 0; j < 7; j++) {
                if (matrix[i][j] > average[i]) {
                    lessThanAverage[i]++;
                }
            }
        }
    }

    private void setMoreThanAverage() {
        for (int i = 0; i < 7; i++) {
            moreThanAverage[i] = 0;
            for (int j = 0; j < 7; j++) {
                if (matrix[i][j] < average[i]) {
                    moreThanAverage[i]++;
                }
            }
        }
    }

    private void setMatrix() {
        for (int i = 0; i < 7; i++)
            for (int j = 0; j < 7; j++)
                matrix[i][j] = randomGenerator.nextInt();
    }

    private void setMin() {
        for (int i = 0; i < 7; i++) {
            min[i] = matrix[i][0];
            for (int j = 1; j < 7; j++) {
                if (min[i] > matrix[i][j]) {
                    min[i] = matrix[i][j];
                }
            }
        }
    }

    private void setMax() {
        for (int i = 0; i < 7; i++) {
            max[i] = matrix[i][0];
            for (int j = 1; j < 7; j++) {
                if (max[i] > matrix[i][j]) {
                    max[i] = matrix[i][j];
                }
            }
        }
    }

    private void setAverage() {
        for (int i = 0; i < 7; i++) {
            average[i] = 0;
            for (int j = 0; j < 7; j++) {
                average[i] += matrix[i][j];
            }
            average[i] /= 7;
        }
    }
}
