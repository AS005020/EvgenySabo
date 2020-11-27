package Git02.TwoDimArray.Task5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static final int N = 6;

    public static void main(String[] args) throws IOException {
        int[][] array = new int[N][N];
        for(int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(j < array[i].length -i)
                    array[i][j] = i+1;
                else
                    array[i][j]=0;
            }
        }
        showArray(array);

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
