package Git01.LinesProgram.SecondTask;


import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        double a;
        double b;
        double c;
        System.out.print("Введите a = ");
        a= Double.parseDouble(bufferedReader.readLine());
        System.out.print("Введите b = ");
        b= Double.parseDouble(bufferedReader.readLine());
        System.out.print("Введите c = ");
        c= Double.parseDouble(bufferedReader.readLine());
        double result = 0.0;
        try {
            result =  b + (Math.sqrt(Math.pow(b,2) + 4*a*c))/(2*a) - Math.pow(a,3)*c + Math.pow(b,-2);
            if(Double.isInfinite(result))
                throw new ArithmeticException();
        }
        catch (ArithmeticException p){
            System.out.println("Divided by zero");
            return;
        }
        System.out.println(result);
        bufferedReader.close();
    }


}
