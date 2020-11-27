package Git02.Decomposition.Task17;

public class Solution {
    public static void main(String[] args) {
        subNum(997);

    }
    public static void subNum(int a){
        int count = 0;
        while(a>0){
            count++;
            a-=sumArray(numToArray(a));
        }
        System.out.println("Необходимо из числа " + count + " раз вычесть сумму его цифр");
    }
    public static int sumArray(int[] array){
        int sum=0;
        for (int i = 0; i < array.length; i++) {
            sum+=array[i];
        }
        return sum;
    }
    public static int[] numToArray(int a){
        int tempA = a;
        int size = 0;
        while(tempA > 0){
            size++;
            tempA/=10;
        }
        tempA = a;
        int[] array = new int[size];
        for (int i = array.length-1; i >= 0; i--) {
            array[i]=tempA%10;
            tempA/=10;
        }
        return array;

    }
}
