package Git03.StringBuilder.Task7;

public class Solution {

    public static void main(String[] args) {
        String str = "abc cde def";
        System.out.println(deleteRepeate(str));
    }

    public static String deleteRepeate(String str){
        StringBuilder result = new StringBuilder();
        for(char ch : str.toCharArray()){
            if(ch != ' ' && !isContain(result, ch))
                result.append(ch);
        }
        return result.toString();
    }
    public static boolean isContain(CharSequence s, char c){
        for(char ch : s.toString().toCharArray())
        {
            if(c == ch)
                return true;
        }
        return false;
    }
}
