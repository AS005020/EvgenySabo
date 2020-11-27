package Git02.TwoDimArray.Task1;
/*
    Дана матрица. Вывести на экран все нечётные столбцы, у которых первый элемент
    больше последнего
 */
public class Solution {
    public static final int N = 5;

    public static void main(String[] args) {
        int[][] array =new int[N][N+3];
        for(int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 10);
            }
        }
        showArray(array);
        System.out.println("Вывести на экран все нечётные столбцы, у которых первый элемент\n" +
                "больше последнего");
        for(int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if(j%2 == 0 && (array[0][j] > array[array.length-1][j])) {
                        System.out.print(array[i][j] + " ");
                    }
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
