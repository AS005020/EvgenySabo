package Git02.Sort.Task3;
/*
    Сортировка выбором
 */
public class Solution {
    public static final int N = 5;

    public static void main(String[] args) {
        int[] array = new int[N];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 5);
        }
        showArray(array);
        System.out.println("Сортировка выбором");
        sortCase(array);
        showArray(array);
    }

    public static void showArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d ",array[i]);
        }
        System.out.println();
    }

    public static void sortCase(int[] array){
        int indMax;
        for (int i = 0; i < array.length-1; i++) {
            indMax = i;
            for (int j = i+1; j < array.length; j++) {
                if(array[indMax] < array[j])
                    indMax = j;
            }
            int temp = array[indMax];
            array[indMax]=array[i];
            array[i]=temp;
        }
    }
}
