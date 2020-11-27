package Git02.Sort.Task1;

import java.io.*;


public class Solution {
    public static final int N = 7;
    public static final int M = 3;

    public static void main(String[] args) throws IOException {
        int[] array1 = new int[M+N];
        int[] array2 = new int[M];
        fillArray(array1,N);
        fillArray(array2,M);
        System.out.println("Первый массив");
        showArray(array1,N);
        System.out.println("Второй массив");
        showArray(array2,M);

        System.out.print("Введите k ");
        int k = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine())-1;

        System.out.println("Вставка второго массива в первый в точке " + k);
        concatArray(array1,array2,k);
        showArray(array1,N+M);
    }

    public static void fillArray(int[] array,int size){
        for (int i = 0; i < size; i++) {
            array[i] = (int)(Math.random()*10);
        }
    }

    public static void concatArray(int[] array1, int[] array2, int k){
        for(int i = k,j = 0; j<array2.length;j++,i++){
            for(int l = array1.length-1; l>i;l--){
                int temp = array1[l];
                array1[l]= array1[l-1];
                array1[l-1] = array1[l];
            }
            array1[i]=array2[j];
        }
    }

    public static void showArray(int[] array, int size){
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

}
