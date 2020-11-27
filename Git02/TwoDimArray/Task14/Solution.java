package Git02.TwoDimArray.Task14;

public class Solution {
    public static final int M = 7;
    public static final int N = 8;

    public static void main(String[] args) {
        int[][] array = new int[N][M];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random()*2);
            }
        }

        for (int i = 0; i < array[0].length; i++) {
            int sum = 0;
            for (int j = 0; j < array.length; j++) {
                sum+=array[j][i];
            }
            while (true) {
                if (sum > i){
                    int index = (int)(Math.random()* array.length);
                    if(array[index][i]==1){
                        array[index][i]=0;
                        sum-=1;
                    }
                }
                else if(sum < i){
                    int index = (int)(Math.random()* array.length);
                    if(array[index][i]==0){
                        array[index][i]=1;
                        sum+=1;
                    }
                }
                else if(sum == i)
                    break;
            }
        }
        showArray(array);
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
