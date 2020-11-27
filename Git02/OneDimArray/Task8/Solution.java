package Git02.OneDimArray.Task8;
/*
    Дана последовательность целых чисел a1, a2,..., an. 
    Обраховать новую последовательность, выбросив
    из исходной те члены, которые равны
    min(a1, a2,..., an)
 */
import static java.lang.Math.random;
public class Solution {
    public static final int N = 10;

    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < N; i++) {
            array[i]= (int)(random()*3);
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int min=min(array);
        int sizeWithoutMin = 0;
        for(int i : array)
        {
            if(i!=min)
                sizeWithoutMin++;
        }

        int[] arrayWithoutMin = new int[sizeWithoutMin];
        int j = 0;
        for (int i = 0; i < sizeWithoutMin; i++) {
            while(array[j] == min){
                j++;
            }
            arrayWithoutMin[i]=array[j];
            j++;
            System.out.print(arrayWithoutMin[i] + " ");
        }
        System.out.println();
    }
    
    public static int min(int[] array){
        int min= array[0];
        for (int i = 1; i < array.length; i++) {
            if(min > array[i])
                min = array[i];
        }
        return min;
    }
}
