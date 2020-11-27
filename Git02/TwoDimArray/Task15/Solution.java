package Git02.TwoDimArray.Task15;

public class Solution {
    public static final int N = 5;

    public static void main(String[] args) {
        int[][] array = new int[N][N];
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j]=(int)(Math.random() * 10);
                if(array[i][j] > max)
                    max = array[i][j];
            }
        }
        showArray(array);
        System.out.println("Замена всех нечётных элементов на максимальное число " + max);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if((i+j)%2 == 0)
                    array[i][j] = max;
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
