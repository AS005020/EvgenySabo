package Git03.StringAsCharArray.Task3;
import java.nio.charset.Charset;

import static java.lang.Math.*;

public class Solution {
    public static void main(String[] args) {
        int size = (int)(random()*20 +1);
        byte[] array=new byte[size];
        for (int i = 0; i < array.length; i++) {
            array[i]=(byte)(random()*33 + 48);
        }
        String str = new String(array, Charset.defaultCharset());
        System.out.println(str);
        System.out.println("Количество цифр в строке");
        System.out.println(countDigit(str));
    }

    public static int countDigit(String str){

        int count =0;
        for(char c : str.toCharArray()){
            if(Character.isDigit(c))
                count++;
        }
        return count;
    }
}
