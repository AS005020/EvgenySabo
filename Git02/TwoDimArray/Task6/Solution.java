package Git02.TwoDimArray.Task6;

import java.io.IOException;

public class Solution {
    public static final int N = 12;

    public static void main(String[] args) throws IOException {
        int[][] array = new int[N][N];
        for(int i = 0; i < array.length; i++) {
            int side = (i >= N/2)?N-i-1:i;
            for (int j = 0; j < array[i].length; j++) {
                if(j>=side && j < array[i].length -side)
                    array[i][j] = 1;
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
