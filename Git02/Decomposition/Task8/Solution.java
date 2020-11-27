package Git02.Decomposition.Task8;
import java.io.*;

public class Solution  {
    public static final int N = 10;
    public static void main(String[] args) throws IOException {
        int[] array = new int[N];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*10);
        }
        System.out.println("Введите начало индекса подмассива для вычисления суммы последующих 3ёх элементов");
        int k = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        System.out.println("Введите конец индекса подмассива");
        int m = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());

        for (int i = k; i < m - 1; i++) {
            nextTripleSum(array,i);
        }
    }

    public static int nextTripleSum(int[] array,int pos){
        int sum = 0;
        String message = "";
        for (int i = pos; i < pos+3; i++) {
            sum +=array[i];
            if(i != pos)
                message+=" + ";
            message+=String.format("D[%d](%-2d) ",i,array[i]);

        }
        System.out.println(message + " = " + sum);
        return sum;
    }
}
