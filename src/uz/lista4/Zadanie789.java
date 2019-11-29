package uz.lista4;

import java.util.Arrays;
import java.util.Random;

public class Zadanie789 {
    private int[][] matrix = new int[12][12];
    private int[][] randomMatrix = new int[12][12];
    private int[][] sumOfMatrix = new int[12][12];
    private int step;
    private Random randomGenerator = new Random();

    private void sumMatrix() {
        for (int y = 0; y < 12; y++) {
            for (int x = 0; x < 12; x++) {
                sumOfMatrix[x][y] = matrix[x][y] + randomMatrix[x][y];
            }
        }
    }

    public Zadanie789() {
        setMatrix();
        setRandomMatrix();
    }

    private void setRandomMatrix() {
        for (int y = 0; y < 12; y++) {
            for (int x = 0; x < 12; x++) {
                matrix[x][y] = randomGenerator.nextInt(99);
            }
        }
    }

    private void setMatrix() {
        for (int y = 0; y < 12; y++) {
            for (int x = 0; x < 12; x++) {
                if (x == y) {
                    matrix[x][y] = x;
                } else {
                    matrix[x][y] = randomGenerator.nextInt(99);
                }
            }
        }
    }

    private void swap(int dimension, int from, int to) {
        int buffer = sumOfMatrix[dimension][from];
        sumOfMatrix[dimension][from] = sumOfMatrix[dimension][to];
        sumOfMatrix[dimension][to] = buffer;
    }

    private void bubbleSort() {
        step = 0;
        for (int y = 0; y < 12; y++) {
            for (int i = 0; i < 12; i++) {
                for (int j = 1; j < 12; j++) {
                    if (sumOfMatrix[y][j] < sumOfMatrix[y][j - 1]) {
                        step++;
                        if (step < 6) {
                            System.out.println(Arrays.toString(sumOfMatrix[y]));
                            System.out.println(step + ". zamiana " + sumOfMatrix[y][j] + " z " + sumOfMatrix[y][j - 1]);
                        }
                        swap(y, j, j - 1);
                    }
                }
            }
        }
    }




    public void run() {
        sumMatrix();
        Quicksort.qsort(sumOfMatrix[0]);
        System.out.println("posortowana: " + Arrays.toString(sumOfMatrix[0]));
    }

}


class Quicksort {
    static void qsort(int items[]) {
        sort(items, 0, items.length-1);
    }
    private static void sort(int items[], int left, int right)
    {
        int step =1;
        int i, j;
        int pivot, buffer;
        i = left; j = right;
        pivot = items[left];
        do {
            while((items[i] < pivot) && (i < right)) i++;
            while((pivot < items[j]) && (j > left)) j--;
            if(i <= j) {
                if(step < 6){
                    System.out.println(Arrays.toString(items));
                    System.out.println(step+". Zamiana " +items[i] + " z " + items[j] );
                }
                buffer = items[i];
                items[i] = items[j];
                items[j] = buffer;
                i++; j--;
            }
        } while(i <= j);
        if(left < j) sort(items, left, j);
        if(i < right) sort(items, i, right);
    }
}