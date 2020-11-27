package Git03.StringBuilder.Task1;

public class Solution {
    public static void main(String[] args) {
        String str = "  my string is normal";
        System.out.println(str);
        System.out.println(maxCountSpace(str));
    }
    public static int maxCountSpace(String str){
        int count = 0;
        int maxCount = count;
        for(char ch : str.toCharArray()){
            if(' ' == ch){
                count++;
            }
            else {
               if(count>maxCount)
                   maxCount = count;
                count = 0;
            }
        }
        return maxCount;
    }
}
