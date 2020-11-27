package Git02.TwoDimArray.Task2;
/*
    Дана квадратная матрица.
    Вывести на экран элементы,
    стоящие на диагонали
 */
public class Solution {
    public static final int N = 5;

    public static void main(String[] args) {
        int[][] array = new int[N][N];
        for(int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 10);
            }
        }
        showArray(array);
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(i == j || (((i + j) % (array.length - 1)) == 0))
                    System.out.print(array[i][j]+ " ");
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
