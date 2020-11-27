package Git01.Branching.FirstTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        double a,b;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите первый угол ");
        a = Double.parseDouble(reader.readLine());
        System.out.print("Введите второй угол ");
        b = Double.parseDouble(reader.readLine());
        if(a+b >=180 || a == 0 || b == 0)
            System.out.println("Такого треугольника не существует");
        else{
            System.out.println("Такой труегольник существует");
            double angle = 180 - (a+b);
            if(angle == 30 || angle == 60 || angle == 90)
                System.out.println("Он прямоугольный");
        }
        reader.close();
    }
}
