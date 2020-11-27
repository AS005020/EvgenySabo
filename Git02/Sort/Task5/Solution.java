package Git02.Sort.Task5;
import Git02.Sort.Task4.*;
import java.io.*;

public class Solution {
    public static final int N = 5;

    public static void main(String[] args) throws IOException {
        int[] array = new int[N];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 5);
        }
        showArray(array);
        System.out.println("Сортировка вставками");
        sortInsert(array);
        showArray(array);
    }

    public static void showArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d ",array[i]);
        }
        System.out.println();
    }

    public static void sortInsert(int[] array){
        for (int i = 1; i < array.length; i++) {
            int ind = binarySearch(array[i],array,0,i);
            while (ind < i && array[i] <= array[ind])
                ind++;
            int temp = array[ind];
            for(int k = ind; k <i; k++) {
                int oldTemp=temp;
                temp= array[k+1];
                array[k+1]=oldTemp;

            }
            array[ind]=temp;
        }
    }

    public static int binarySearch(int item,int[] array,int left, int right){

        int middle = (right-left)/2 + left;
        if(!(left < right))
            return middle;
        int result = middle;
        if(item>array[middle])
            result = binarySearch(item,array,left,middle-1);
        else if (item < array[middle])
            result = binarySearch(item,array,middle+1,right);
        return result;
    }
}
