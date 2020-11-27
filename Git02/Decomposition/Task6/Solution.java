package Git02.Decomposition.Task6;

public class Solution {
    public static void main(String[] args) {
        simpleNumber3(11,22,17);
    }

    public static void simpleNumber3(int a, int b, int c){
        simpleNumber(a,b);
        simpleNumber(a,c);
        simpleNumber(b,c);
    }
    private static void simpleNumber(int a, int b) {
        String isNot;
        if(Git02.Decomposition.Task1.Solution.NOD(a,b) == 1)
            isNot="";
        else
            isNot=" не";
        System.out.println(a + " и " + b + isNot + " взаимопростые");
    }


}
