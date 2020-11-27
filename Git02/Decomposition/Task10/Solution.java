package Git02.Decomposition.Task10;

public class Solution {
    public static void main(String[] args) {
        showArray(numToArray(13121322));
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

    public static void showArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
