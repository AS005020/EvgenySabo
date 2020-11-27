package Git02.Decomposition.Task14;
import java.io.*;
import java.math.BigInteger;

public class Solution {
    public static void main(String[] args) throws IOException{
        System.out.print("Поиск чисел Армстронга до k = ");
        int k = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        showAmstrong(k);


    }
    public static void showAmstrong(int k){
        long sum;
        int n;
        for (long i = 1,tempI = i; i <= k; i++,tempI = i) {
            sum = 0;
            n = numSize(i);
            while(tempI > 0){
                sum += Math.pow(tempI%10,n);
                tempI/=10;
            }
            if(sum == i)
                System.out.println(i);
        }
    }
    public static int numSize(long a){
        int size = 0;
        while(a > 0){
            size++;
            a/=10;
        }
        return size;
    }
}
