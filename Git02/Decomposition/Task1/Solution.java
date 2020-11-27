package Git02.Decomposition.Task1;

public class Solution {
    public static void main(String[] args) {
        System.out.println(NOD(21,42));
        System.out.print(NOK(21,42) + " ");
        System.out.println((21*42)/NOD(21,42));
    }
    public static int NOK(int a, int b){
        int tempA = a;
        int tempB = b;
        int divider = 2;
        int nok = 1;

        while(((tempA/divider) != 0) || ((tempB/divider) != 0)){
            if((tempA%divider == 0 ) || (tempB%divider == 0) ) {

                if(tempA%divider == 0 )
                    tempA/=divider;
                if(tempB%divider == 0 )
                    tempB/=divider;
                nok *= divider;
                continue;
            }
            divider++;
        }
        return nok;
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
