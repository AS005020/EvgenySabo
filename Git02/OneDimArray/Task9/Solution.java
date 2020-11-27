package Git02.OneDimArray.Task9;
/*
    В массиве целых чисел с количеством элементво n наийти наиболее встречающееся число.
    Если таких чисел несколько, то определить наименьшее из них

 */

public class Solution {
    public static final int N = 10;

    public static void main(String[] args) {
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = (int) (Math.random() * 4);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int number=0;
        int countNumber = 0;
        for (int i = 0; i < N; i++) {
            int count =0;
            for (int j = 0; j < N; j++) {
                if(array[i] == array[j])
                    count++;
            }
            if(count >= countNumber) {
                if (i != 0 && count == countNumber) {
                    number = Math.min(number, array[i]);
                } else
                    number = array[i];
                countNumber = count;
            }
        }

        System.out.println(number);
    }
}
