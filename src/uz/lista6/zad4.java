package uz.lista6;

import java.io.File;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class zad4 {
    static public void main(String args[]) throws Exception {
        String filePath = "C:\\Nowy folder\\pliczek.csv";
        File file = new File(filePath);
        Random generator = new Random();
        if (!file.exists()) {
            file.createNewFile();
        }
        int[][] matrix = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matrix[i][j] = generator.nextInt(100);
            }
        }

        PrintWriter zapis = new PrintWriter(filePath);

        for (int i = 0; i < 10; i++) {

                zapis.println( Arrays.toString(matrix[i]).replace('[', ' ').replace(']', ' ').replace(',',';'));

        }
        zapis.close();


        Scanner scanner = new Scanner(file);
        ArrayList<Integer> tab =new  ArrayList();

        for(int i =0;i<10;i++)
        {
            String [] textSplit = Files.readAllLines(Paths.get(file.getPath()), Charset.defaultCharset()).get(i).split("\\,");

            for(int j =0;j<10;j++)
            {
                tab.add(textSplit[j].toInt());
            }


        }



         System.out.println(Arrays.toString(textSplit));

    }


}
