package UZ.lista4;

import com.sun.deploy.net.proxy.ProxyUnavailableException;

import javax.jws.Oneway;

public class Zadanie4 {
    public Zadanie4(){
        setMatrix();
    }
    private int[][] matrix = new int[15][15];
    private Integer[] average = new Integer[15];

    private void setAverage() {
        for (int i = 0; i < 15; i++) {
            average[i]=0;
            for (int j = 0; j < 15; j++) {
                average[i] = matrix[i][j];
            }
            average[i]/=15;
        }
    }

    private void setMatrix() {
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 15; j++) {
                matrix[i][j] = i * j;
            }
        }

    }
    public void run(){
        setAverage();
    }

}