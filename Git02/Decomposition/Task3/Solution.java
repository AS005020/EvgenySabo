package Git02.Decomposition.Task3;

import java.io.*;
import static java.lang.Math.*;
public class Solution {
    public static void main(String[] args) throws Exception {
        System.out.println("Введите длину стороны шестиугольноко прямоугльника ");
        int a = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        System.out.println("S = " + sixAngle(a));
    }
    public static double sixAngle(int a){
        return 6*equilateralTriangle(a);
    }
    public static double equilateralTriangle(int a){
        return ((3*sqrt(3))/2)*pow(a,2);
    }
}
