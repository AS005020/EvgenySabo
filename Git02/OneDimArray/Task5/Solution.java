package Git02.OneDimArray.Task5;
/*
    Даны целые числа а1, а2,...,аn. Вывести на печать
    только те числа, для которых ai>i
 */
import static java.lang.Math.*;
public class Solution {
    public static final int N = 10;

    public static void main(String[] args) {
        int[] array=new int[N];
        for (int i = 0; i < N; i++) {
            array[i]= (int)(random()*10);
        }
        showArray(array);

        System.out.println("только те числа, для которых ai>i");
        for (int i = 0; i <N; i++) {
            if(array[i] > i)
                System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void showArray(int[] array)
    {
        System.out.print("Текущий массив\ni ");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%2d ",i);
        }
        System.out.print("\n  ");
        for (int n : array)
            System.out.printf("%2d ",n);
        System.out.println();
    }
}
