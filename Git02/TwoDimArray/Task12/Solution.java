package Git02.TwoDimArray.Task12;

/*
    Отсортировать строки матрицы по возрастанию
    и убыванию значений элементов
 */
import static java.lang.Math.*;

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
        for (int i = 0; i < array.length; i++) {
            sortDown(array[i]);
        }
        showArray(array);
        System.out.println("Сортировка строк по возрастанию");
        for (int i = 0; i < array.length; i++) {
            sortUp(array[i]);
        }
        showArray(array);
    }

    public static void sortDown(int[] array){
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[i] < array[j])
                {
                    int temp = array[i];
                    array[i]=array[j];
                    array[j]= temp;
                }
            }
        }
    }
    public static void sortUp(int[] array){
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[i] > array[j])
                {
                    int temp = array[i];
                    array[i]=array[j];
                    array[j]= temp;
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
