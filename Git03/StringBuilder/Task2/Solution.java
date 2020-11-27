package Git03.StringBuilder.Task2;

public class Solution {

    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("aabbba");
        System.out.println(str);
        insertBafterA(str);
        System.out.println(str);

    }
    public static void insertBafterA(StringBuilder str){
        for (int i = 0; i < str.length() ; i++) {
            if(str.charAt(i) == 'a'){
                str.insert(++i,'b');
            }
        }
    }
}
