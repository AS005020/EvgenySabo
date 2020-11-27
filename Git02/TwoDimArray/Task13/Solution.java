package Git02.TwoDimArray.Task13;

import static java.lang.Math.random;

public class Solution {
    public static final int N = 5;

    public static void main(String[] args) {
        int[][] array = new int[N][N];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int)(random()*10);
            }
        }

        showArray(array);
        System.out.println("Сортировка строк по убыванию");
        sortUp(array);

        showArray(array);
        System.out.println("Сортировка строк по возрастанию");
        sortDown(array);
        showArray(array);
    }

    public static void sortDown(int[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length-1; j++) {
                for (int k = j+1; k < array[i].length; k++) {
                    if(array[j][i] > array[k][i]){
                        int temp = array[j][i];
                        array[j][i] = array[k][i];
                        array[k][i] = temp;
                    }
                }
            }
        }
    }
    public static void sortUp(int[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length-1; j++) {
                for (int k = j+1; k < array[i].length; k++) {
                    if(array[j][i] < array[k][i]){
                        int temp = array[j][i];
                        array[j][i] = array[k][i];
                        array[k][i] = temp;
                    }
                }
            }
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
