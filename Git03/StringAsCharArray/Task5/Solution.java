package Git03.StringAsCharArray.Task5;

public class Solution {
    public static void main(String[] args) {
        String str = "     my   string        is normal";
        System.out.println(str);
        System.out.println(myTrim(str));
    }
    public static String myTrim(String str){
        String result ="";
        boolean goSpace = false;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ' ')
            {
                if(i == 0 || i == str.length()-1)
                    goSpace=true;
                if(goSpace)
                    continue;
                goSpace=true;
            }
            else
                goSpace = false;
            result+=str.charAt(i);
        }
        return result;
    }
}
