package Git03.StringAsCharArray.Task1;

public class Solution {
    public static void main(String[] args) {
        String[] array = {"helloShow", "showArray","sortBubble"};
        for (int i = 0; i < array.length; i++) {
            char[] str = array[i].toCharArray();
            String result="";
            for (int j = 0; j < str.length; j++) {
                if(Character.isUpperCase(str[j]))
                {
                    result+="_";
                    str[j]=Character.toLowerCase(str[j]);
                }
                result+=str[j];
            }
            array[i] = result;
        }

        for (String str: array)
            System.out.println(str);
   }
}
