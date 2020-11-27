package Git02.TwoDimArray.Task3;

import java.io.*;

public class Solution {
    public static final int N = 5;

    public static void main(String[] args) throws IOException{
        int[][] array = new int[N][N];
        for(int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 10);
            }
        }
        showArray(array);
        System.out.println();
        System.out.print("Введите номер стоки, которую хотите вывести ");
        int x = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        System.out.print("Введите номер столбца, которую хотите вывести ");
        int y = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());

        for(int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(i == x-1 || j == y-1)
                    System.out.print(array[i][j] + " ");
                else
                    System.out.print("  ");
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