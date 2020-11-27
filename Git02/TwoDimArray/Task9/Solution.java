package Git02.TwoDimArray.Task9;

public class Solution {
    public static final int N = 4;

    public static void main(String[] args) {
        int[][] array = new int[N][N];
        int index = -1;
        int sum = -1;
        for(int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 2);
            }
        }
        showArray(array);

        for (int j = 0; j < array[0].length; j++) {
            int sumJ=0;
            for (int i = 0; i < array.length; i++) {
                sumJ+=array[i][j];
            }
            if(sumJ > sum){
                sum=sumJ;
                index=j;
            }
        }

        System.out.printf("Максимальная сумма %d в столбце %d",sum,index);
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
