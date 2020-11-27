package Git02.TwoDimArray.Task8;

import java.io.*;
public class Solution {
    public static final int N = 4;

    public static void main(String[] args) throws IOException {
        int[][] array = new int[N][N+2];
        for(int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 10);
            }
        }
        showArray(array);
        System.out.println("Введите номера столбцов, которые хотите поменять местами");
        int x = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine()) - 1;
        int y = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine()) - 1;
        for (int i = 0; i < array.length; i++) {
            int temp = array[i][x];
            array[i][x] =  array[i][y];
            array[i][y] = temp;
        }
        System.out.println("Результаты замены:");
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
