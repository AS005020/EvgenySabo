package Git02.TwoDimArray.Task11;

public class Solution {
    public static void main(String[] args) {
        int[][] array = new int[10][20];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j]=(int)(Math.random()*10);
            }
        }

        showArray(array);

        System.out.println("Номер строк в которыз элемент 5 встречается 3 или более 3 раз");
        for (int i = 0; i < array.length; i++) {
            int fiveCount = 0;
            for (int j = 0; j < array[i].length; j++) {
                if(array[i][j]==5)
                    fiveCount++;
            }
            if(fiveCount >= 3)
                System.out.print((i+1) +" ");
        }
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
