package Git03.StringBuilder.Task3;
/*
    Полиндром
 */
public class Solution {

    public static void main(String[] args) {
        String str1 = "123321";
        String str2 = "12321";
        String str3 = "2121";
        isPalindrom(str1);
        isPalindrom(str2);
        isPalindrom(str3);
    }
    public static boolean isPalindrom(String str){
        int left = 0;
        int right = str.length()-1;
        while(left < right){
            if(str.charAt(left) != str.charAt(right)) {
                System.out.println(str + " не палиндром");
                return false;
            }
            left++;
            right--;
        }
        System.out.println(str + " палиндром");
        return true;
    }
}
