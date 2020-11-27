package Git03.StringBuilder.Task5;

public class Solution {

    public static void main(String[] args) {
        String str = "мама мыла раму";
        System.out.println("Количество букв а " + countA(str));
    }

    public static int countA(String str){
        int count = 0;
        for(char ch : str.toCharArray())
            if(ch == 'а')
                count++;

        return count;
    }
}
