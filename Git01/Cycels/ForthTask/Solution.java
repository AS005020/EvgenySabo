package Git01.Cycels.ForthTask;

import java.math.BigInteger;

public class Solution {
    public static void main(String[] args) {
        BigInteger bigInteger = BigInteger.ONE;
        for (long i = 2; i <= 200; i++) {
            bigInteger= bigInteger.multiply(BigInteger.valueOf((long)Math.pow(i,2)));
        }
        System.out.printf("Произведение квадратов первых 200 чисел(кроме 0) = %d",bigInteger);
    }
}