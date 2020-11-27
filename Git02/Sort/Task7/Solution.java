package Git02.Sort.Task7;

import org.w3c.dom.ls.LSOutput;

public class Solution {
    public static final int N = 5;

    public static void main(String[] args) {
        int[] array = new int[N];
        int[] array1 = new int[N];
        int[] array2 = new int[N];

        for (int i = 0; i < N; i++) {
            array[i]=i+1;
            array1[i]=(int)(Math.random()*6);
            array2[i]=(int)(Math.random()*6);
        }

        sortBubble(array1);
        sortBubble(array2);
        showArray(array);
        System.out.println("Первый массив");
        showArray(array1);
        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= N; j++) {
                if(j == N || (array2[i] < array1[j])) {
                    System.out.println("Элемент 2го массива " + array2[i] + " можно поставить в позицию " + (j+1));
                    break;
                }
            }
        }

    }
    public static void sortBubble(int[] array){
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 1; j < array.length-i; j++) {
                if(array[j-1] > array[j]){
                    int temp = array[j-1];
                    array[j-1] = array[j];
                    array[j]=temp;
                }
            }
        }
    }

    public static void showArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d ",array[i]);
        }
        System.out.println();
    }
}
