package uz.lista6.zad2;

import uz.lista6.zad1.Calc;

import java.io.File;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

public class zad2 {

    static public void main(String args[]) throws Exception {
        String filePath = "C:\\Nowy folder\\plik.txt";
        File file = new File(filePath);

        if (!file.exists()) {
            file.createNewFile();
        }
        System.out.println(Files.readAllLines(Paths.get(file.getPath()), Charset.defaultCharset()));

        PrintWriter zapis = new PrintWriter(filePath);
        zapis.println(new Calc(1,2,3,4,5,6,7).add());
        zapis.close();
    }
}
