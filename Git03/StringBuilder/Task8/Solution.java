package Git03.StringBuilder.Task8;

public class Solution {
    public static void main(String[] args) {
        String str = "ou my god";
        System.out.println(maxString(str));
    }
    public static String maxString(String str){
        String[] array = str.split(" ");
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if(max < array[i].length())
                max = i;
        }
        return array[max];
    }
}
