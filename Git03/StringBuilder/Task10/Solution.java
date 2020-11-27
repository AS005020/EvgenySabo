package Git03.StringBuilder.Task10;

public class Solution {
    public static void main(String[] args) {
        String str ="Я. Пошёл! Кто со мной?";
        System.out.println("Количсетво предложений " + countSentens(str));
    }

    public static int countSentens(String str){
        return str.split("[.!?]").length;
    }
}
