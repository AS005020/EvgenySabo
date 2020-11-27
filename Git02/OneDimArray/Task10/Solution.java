package Git02.OneDimArray.Task10;

public class Solution {
    public static final int N = 10;

    public static void main(String[] args) {
        int[] array= new int[N];

        for (int i = 0; i < N; i++) {
            array[i] = (int)(Math.random()*10);
        }
        showArray(array);
        System.out.println("После сужения");
        for(int i = 0; i< N;i++){
            if(i % 2 == 1)
                array[i] = 0;
        }
        showArray(array);
    }

    public static void showArray(int[] array){
        for(int i : array){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
