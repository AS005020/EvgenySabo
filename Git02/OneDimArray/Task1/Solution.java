package Git02.OneDimArray.Task1;
/*
В массив A[n] занесены натуральные числа. Найти сумму тех элементов
которые кратны данному K
*/
import java.io.*;

public class Solution {
    public static final int N = 10;
    
    public static void main(String[] args) throws IOException {
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            int num;
            do {
                num = (int) (Math.random() * 100);
            }
            while(num == 0);
            array[i]=num;
        }

        System.out.println("Исходный массив");
        for(int n : array)
            System.out.print(n+" ");
        System.out.println();
        System.out.print("Введите k: ");
        int k = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());

        int sumK=0;
        System.out.println("Числа массива кратные "+ k);
        for(int n : array){
            if(n%k == 0){
                System.out.print(n + " ");
                sumK+=n;
            }
        }
        System.out.println();
        System.out.println("Сумма чисел массива кратных " + k + " : "+sumK);
    }
    
}
