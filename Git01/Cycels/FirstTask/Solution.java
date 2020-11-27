package Git01.Cycels.FirstTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.math.BigInteger;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите любое целое положительное число x = ");
        long x = Long.parseLong(reader.readLine());

        BigInteger bigInteger = new BigInteger("1");
        for (long i = 2; i < x; i++) {
            bigInteger = bigInteger.add(BigInteger.valueOf(i));
        }
        System.out.printf("Сумма от 1 до %d равна %d",x,bigInteger);
        reader.close();
    }
}
