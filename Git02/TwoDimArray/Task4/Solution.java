package Git02.TwoDimArray.Task4;



public class Solution {
    public static final int N = 6;
    public static void main(String[] args) {
        int[][] array = new int[N][N];
        for(int i = 0; i < array.length; i++) {
            for (int jOdd = 0, jEven = array[i].length-1; jOdd < array[i].length; jOdd++, jEven--) {
                if(i%2 == 0)
                    array[i][jOdd]=jOdd+1;
                else
                    array[i][jOdd]=jEven+1;
            }

        }
        showArray(array);
        System.out.println();
    }

    public static void showArray(int[][] array){
        for(int[] i : array) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
