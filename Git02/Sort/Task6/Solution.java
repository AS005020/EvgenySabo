package Git02.Sort.Task6;

import java.io.IOException;

public class Solution {
    public static final int N = 5;

    public static void main(String[] args) throws IOException {
        int[] array = new int[N];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 5);
        }
        showArray(array);
        sortShell(array);
        showArray(array);
    }
    
    public static void sortShell(int[] array){
        for (int step = array.length/2; step > 0 ; step/=2) {
            for (int i = step; i < array.length; i++) {
                int temp = array[i];
                int j;
                for (j = i; j>= step ; j-=step) {
                    if(temp > array[j-step])
                        array[j]=array[j-step];
                    else
                        break;
                }
                array[j]=temp;
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
