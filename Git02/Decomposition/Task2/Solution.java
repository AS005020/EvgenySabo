package Git02.Decomposition.Task2;

public class Solution {

    public static void main(String[] args) {
        System.out.println(NOD4(21,49,56,70));
    }

    public static int NOD4(int a, int b, int c, int d){
        return NOD(NOD(a,b), NOD(c,d));
    }

    public static int NOD(int a, int b){
        int tempA = a;
        int tempB = b;
        int divider = 2;
        int nod = 1;
        while(((tempA/divider) != 0) && ((tempB/divider) != 0)){
            if((tempA%divider == 0 )&& (tempB%divider == 0) ) {
                tempA/=divider;
                tempB/=divider;
                nod*=divider;
                continue;
            }
            divider++;
        }
        return nod;
    }
}


