package Git03.StringAsCharArray.Task4;

import java.nio.charset.Charset;
import static java.lang.Math.*;

import static java.lang.Math.random;

public class Solution {
    public static void main(String[] args) {
        int size = (int)(random()*20 +1);
        byte[] array=new byte[size];
        for (int i = 0; i < array.length; i++) {
            array[i]=(byte)(random()*33 + 48);
        }
        String str = new String(array, Charset.defaultCharset());
        System.out.println(str);
        System.out.println("Количество чисел в строке");
        System.out.println(countNumber(str));
    }

    public static int countNumber(String str){

        int count =0;
        boolean goDigit = false;
        for(char c : str.toCharArray()){

            if(Character.isDigit(c)) {
                if(!goDigit) {
                    goDigit = true;
                    count++;
                }
            }
            else{
                goDigit = false;
            }
        }
        return count;
    }
}
