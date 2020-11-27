package Git03.StringBuilder.Task6;

public class Solution {

    public static void main(String[] args) {
        String str = "мама мыла раму";
        System.out.println(repeatChar(str));
    }

    public static String repeatChar(String str){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            result.append(str.charAt(i))
                    .append(str.charAt(i));
        }
        return result.toString();
    }
}
