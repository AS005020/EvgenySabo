package Git01.LinesProgram.ThirdTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        double x;
        double y;

        System.out.print("Введите x = ");
        x= Double.parseDouble(bufferedReader.readLine());
        System.out.print("Введите y = ");
        y= Double.parseDouble(bufferedReader.readLine());

        double result = (Math.sin(x)+Math.cos(y))/(Math.cos(x)- Math.sin(y))*Math.tan(x*y);
        System.out.println(result);
        bufferedReader.close();
    }
}
