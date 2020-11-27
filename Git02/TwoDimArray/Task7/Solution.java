package Git02.TwoDimArray.Task7;

import static java.lang.Math.*;

public class Solution {
    public static final int N = 5;

    public static void main(String[] args) {
        double[][] array = new double[N][N];
        int positive = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                array[i][j] = sin(pow(i,2) - pow(j,2)/N);
                if(array[i][j] > 0)
                    positive++;
            }
        }
        showArray(array);
        System.out.println("Количество положительных чисел: "+positive);
    }

    public static void showArray(double[][] array){
        for(double[] i : array) {
            for (double j : i) {
                System.out.printf("%-5.2f ",j);
            }
            System.out.println();
        }
    }
}
