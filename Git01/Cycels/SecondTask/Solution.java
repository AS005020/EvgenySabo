package Git01.Cycels.SecondTask;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.math.BigInteger;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите начало отрезка(любое число) a = ");
        double a = Double.parseDouble(reader.readLine());
        
        System.out.print("Введите конец отрезка(любое число) b = ");
        double b = Double.parseDouble(reader.readLine()); 
        
        System.out.print("Введите шаг(любое число) h = ");
        double h = Double.parseDouble(reader.readLine());

        for (double x = a; x <= b; x+=h) {
            System.out.printf("В точке %.2f значение функции %.2f\n",x,(x>2)?x:-x);
        }

        reader.close();
    }
}
