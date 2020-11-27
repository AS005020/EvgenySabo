package Git01.Cycels.ThirdTask;


import java.io.*;


import java.math.BigInteger;

public class Solution {
    public static void main(String[] args) {
        long bigInteger = 0;
        for (long i = 0; i < 100; i++) {
            bigInteger+=(long)Math.pow(i,2);
        }
        System.out.printf("Сумма квадратов первых 100 чисел = %s",bigInteger);
    }
}
