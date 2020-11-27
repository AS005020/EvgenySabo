package Git02.Decomposition.Task12;

public class Solution {

    public static void main(String[] args) {
        showArray(arrayOfSumKLessN(7,8));
    }

    public static int[] arrayOfSumKLessN(int k, int n){
        if(k == 0)
            return null;
        int[] array = new int[k];
        int size = 0;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if(sum > k){
                array[i-1] -=sum-k;
                if(array[i-1] == 0)
                    size--;
                break;
            }
            size++;
            array[i] = (int) (Math.random()*n +1);
            sum+=array[i];
        }
        int[] result = new int[size];
        sum = 0;
        for (int i = 0; i < size; i++) {
            result[i]=array[i];
            sum+=array[i];
        }
        return result;
    }
    public static void showArray(int[] array){
        for (int i = 0; i < array.length ; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
