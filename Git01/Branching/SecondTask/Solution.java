package Git01.Branching.SecondTask;

import java.io.*;

public class Solution {
    public static void main(String[] args)throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("max{min(a,b), min(c,d)}");
        double a;
        double b;
        double c;
        double d;
        System.out.print("Введите a = ");
        a= Double.parseDouble(bufferedReader.readLine());
        System.out.print("Введите b = ");
        b= Double.parseDouble(bufferedReader.readLine());
        System.out.print("Введите c = ");
        c= Double.parseDouble(bufferedReader.readLine());
        System.out.print("Введите d = ");
        d= Double.parseDouble(bufferedReader.readLine());

        System.out.printf("%.0f",Math.max(Math.min(a,b), Math.min(c,d)));
        bufferedReader.close();
        }
}
