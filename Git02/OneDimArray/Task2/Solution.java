package Git02.OneDimArray.Task2;
/*
Дана числовая последовательность действительных чисел. Заменить все её числа больше данного
Z этим числом. Подсчитать количество замен
 */

import java.io.*;
import static java.lang.Math.*;
public class Solution {

    public static final int SIZE = 9;
    public static void main(String[] args) throws IOException {
        double[] array=new double[SIZE];
        for (int i = 1; i <= SIZE; i++) {
            array[i-1]=function(i);
        }

        System.out.println("Дана числовая последовательность");
        showArray(array);

        System.out.print("Введите Z = ");
        int z = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        int countReplace = 0;
        for (int i = 0; i < SIZE; i++) {
            if (array[i] > z) {
                array[i] = z;
                countReplace++;
            }
        }
        showArray(array);

        System.out.println("Было заменено " + countReplace + " элементов");
    }



    public static double function(double x){
        return pow(2,x)/x;
    }

    public static void showArray(double[] array){
        for(double n : array){
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
