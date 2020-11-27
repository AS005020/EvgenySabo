package Git02.TwoDimArray.Task10;

import static java.lang.Math.*;

public class Solution {
    public static final int N = 3;

    public static void main(String[] args) {
        int[][] array = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                array[i][j]=(int) (Math.random() * 10 - 5);
            }
        }
        showArray(array);
        System.out.println("\nПоложительные элементы главной диагонали");

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(i == j && array[i][j] > 0)
                    System.out.printf("%-3d ",array[i][j]);
                else
                    System.out.printf("   ");
            }
            System.out.println();
        }

    }
    public static void showArray(int[][] array){
        for(int[] i : array) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
