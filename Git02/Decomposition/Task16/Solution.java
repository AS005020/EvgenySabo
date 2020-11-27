package Git02.Decomposition.Task16;

import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.rmi.MarshalException;

public class Solution {
    public static final int N;
    static{
        System.out.print("Введите максимальное количество разрядов N = ");
        int result = 0;
        try {
            result = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        N = result;

    }

    public static void main(String[] args) {
        System.out.print("Сумма элементов с нечётными цифрами ");
        int sum = sumOddsNum();
        System.out.println(sum);
        System.out.println("В этой сумму " + countEvenElements(numToArray(sum)) + " чётных элементов");
    }
    public static int sumOddsNum(){
        int sum = 0;
        int countEven=0;
        for (int i = 1; i < Math.pow(10,N); i++) {
            if(isOddElemets(numToArray(i))) {
                sum += i;
            }
        }
        return sum;
    }
    public static int countEvenElements(int[] array){
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0)
                count++;
        }
        return count;
    }

    public static boolean isOddElemets(int[] array){
        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0)
                return false;
        }
        return true;
    }
    public static int[] numToArray(int a){
        int tempA = a;
        int size = 0;
        while(tempA > 0){
            size++;
            tempA/=10;
        }
        tempA = a;
        int[] array = new int[size];
        for (int i = array.length-1; i >= 0; i--) {
            array[i]=tempA%10;
            tempA/=10;
        }
        return array;
    }

}
