package Git02.Sort.Task2;

public class Solution {
    public static final int N = 5;
    public static final int M = 7;

    public static void main(String[] args) {
        int[] array1 = new int[N+M];
        int[] array2 = new int[M];
        fillArray(array1,N);
        fillArray(array2,M);
        sortUp(array1,N);
        sortUp(array2,M);
        System.out.println("Первый массив");
        showArray(array1,N);
        System.out.println("Второй массив");
        showArray(array2,M);
        concatArray(array1,array2);
        System.out.println("Объединение двух массивов");
        showArray(array1,N+M);


    }

    public static void fillArray(int[] array,int size){
        for (int i = 0; i < size; i++) {
            array[i] = (int)(Math.random()*10);
        }
    }


    public static void showArray(int[] array, int size){
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void sortUp(int[] array,int size){
        for (int i = 0; i < size-1; i++) {
            for (int j = i+1; j < size; j++) {
                if(array[i] > array[j])
                {
                    int temp = array[i];
                    array[i]=array[j];
                    array[j]= temp;
                }
            }
        }
    }

    public static void concatArray(int[] array1, int[] array2){
        int inputJ=0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = inputJ; j < array2.length; j++) {
                if(array1[i] < array2[j] && (i<(array1.length-array2.length + inputJ))) {
                    break;
                }

                else {
                    for (int k = array1.length - 1; k > i; k--) {
                        int temp = array1[k];
                        array1[k] = array1[k - 1];
                        array1[k - 1] = temp;
                    }
                    array1[i] = array2[j];
                    inputJ++;
                }
            }
        }
    }
}
