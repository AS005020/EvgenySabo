package Git02.Sort.Task4;

public class Solution {
    public static final int N = 21;

    public static void main(String[] args) {
        int[] array = new int[N];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 5);
        }
        showArray(array);
        System.out.println("Сортировка пузырьком");
        sortBubble(array);
        showArray(array);
    }

    public static void showArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d ",array[i]);
        }
        System.out.println();
    }

    public static void sortBubble(int[] array){
        int count = 0;
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 1; j < array.length-i; j++) {
                if(array[j-1] > array[j]){
                    int temp = array[j-1];
                    array[j-1] = array[j];
                    array[j]=temp;
                    count++;
                }

            }
        }
        System.out.println("Число перестановок: " + count);
    }
}
