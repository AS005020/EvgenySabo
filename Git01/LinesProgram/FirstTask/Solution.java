package Git01.LinesProgram.FirstTask;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("z = ( (a-3) *  b / 2 ) + c");
        double a;
        double b;
        double c;
        System.out.print("Введите a = ");
        a= Double.parseDouble(bufferedReader.readLine());
        System.out.print("Введите b = ");
        b= Double.parseDouble(bufferedReader.readLine());
        System.out.print("Введите c = ");
        c= Double.parseDouble(bufferedReader.readLine());

        System.out.println("z = " + (( (a-3) *  b / 2 ) + c));
        bufferedReader.close();
    }


}
