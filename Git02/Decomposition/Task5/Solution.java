package Git02.Decomposition.Task5;

public class Solution {
    public static final int N = 5;
    public static void main(String[] args) {
        int[] array = new int[N];
        int indMax = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random());
            if(array[i] > array[indMax])
                indMax = i;
        }
        showArray(array);
        System.out.println("Максимальный элемент " + array[indMax] + " находиться под индексом " + indMax);
        int indBeforeMax = -1;
        for (int i = 0; i < array.length; i++) {
            if(indMax != i && array[i] != array[indMax])
                if(indBeforeMax == -1 || array[i] > array[indBeforeMax])
                    indBeforeMax = i;
        }
        if(indBeforeMax != -1)
            System.out.println("Второе максимальное число " + array[indBeforeMax] + " находиться под индексом " + indBeforeMax);
        else
            System.out.println("Второго максимального числа нет");
    }

    public static void showArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
