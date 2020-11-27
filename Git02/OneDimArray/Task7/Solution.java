package Git02.OneDimArray.Task7;
/*
    Даны действительные числа а1,а2,...,an.
    Найти max(a1 + a2n, a2 + a2n-1,..., an+an+1)
 */
public class Solution {
    public static final int N = 3;

    public static void main(String[] args) {
        double[] array = new double[N*2];

        for (int i = 0; i < array.length; i++) {
            array[i]= (int)(Math.random()*10);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        double max = array[0] + array[2*N-1];
        for (int i = 1; i < N; i++) {
            double sum;
            if((sum = array[i] + array[2*N-1-i]) > max)
                max = sum;
        }
        System.out.println(max);

    }
}

