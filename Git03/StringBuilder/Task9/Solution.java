package Git03.StringBuilder.Task9;

public class Solution {
    public static void main(String[] args) {
        String str = "Мама мыла РаМу MoTher wash";
        textAnalize(str);
    }
    public static void textAnalize(String str){
        int countLowerCase = 0;
        int countUpperCase = 0;
        for(char ch : str.toCharArray())
        {
            if(Character.isLowerCase(ch) && isEnglish(ch))
                countLowerCase++;
            if(Character.isUpperCase(ch) && isEnglish(ch))
                countUpperCase++;
        }
        System.out.println("Прописных " + countUpperCase);
        System.out.println("Строчных " + countLowerCase);
    }

    public static boolean isEnglish(char ch){
        if(Character.isAlphabetic(ch) && ch >= 'A' && ch <= 'z')
            return true;
        return false;
    }
}
