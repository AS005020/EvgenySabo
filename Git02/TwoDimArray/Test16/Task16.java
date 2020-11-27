package Git02.TwoDimArray.Test16;

public class Task16 {
    public static final int N = 3;
    public static void main(String[] args) {
        System.out.println("Алгоритм терасса");
        int[][] array = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                array[i][j]=i*N+(j+1);
            }
        }
        int diagonalSize = (N-1)+(N-1)+1;
        int[][] rotateArray = new int[diagonalSize][diagonalSize];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                rotateArray[i+j][j]=array[i][j];
            }
        }

        //showArray(array);
        //System.out.println();
        alig(rotateArray);
        //showArray(rotateArray);
        //System.out.println();
        addZero(rotateArray);
        //showArray(rotateArray);
        //System.out.println();
        makeMagicArray(rotateArray);
        //showArray(rotateArray);
        array = deleteFromZero(rotateArray);
        showArray(array);


    }

    public static void showArray(int[][] array)
    {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%-2d ",array[i][j]);
            }
            System.out.println();
        }
    }

    public static void alig(int[][] array){
        for (int i = 0; i < array.length/2; i++) {

            int move = array.length/2 - i;
            for (int j = 0; j < move; j++) {
                for (int k = array[i].length-1; k >=1;k--) {
                    int temp = array[i][k];
                    array[i][k] = array[i][k-1];
                    array[i][k-1] = temp;
                }
            }
        }
    }

    public static void addZero(int[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length-1; j++) {
                if(array[i][j] != 0 && array[i][j+1] != 0) {
                    for (int k = array[i].length-1; k > j+1 ; k--) {
                        int temp = array[i][k];
                        array[i][k] = array[i][k - 1];
                        array[i][k - 1] = temp;
                    }
                }
            }
        }
    }

    public static void makeMagicArray(int[][] array){
        int diffArrays = (array.length - N)/2;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(array[i][j] !=0) {
                    int x = 0;
                    int y = 0;
                    if (i >= N + diffArrays)
                        x -= N;
                    if (i < diffArrays)
                        x += N;
                    if (j >= N + diffArrays)
                        y -= N;
                    if (j < diffArrays)
                        y += N;
                    int temp = array[i][j];
                    array[i][j] = array[i + x][j + y];
                    array[i + x][j + y] = temp;
                }
            }
        }
    }

    public static int[][] deleteFromZero(int[][] array){
        int [][]upArray = new int[N][N];
        int diffArrays = (array.length - N)/2;
        for (int i = diffArrays, upI = 0; i < array.length-diffArrays; i++,upI++) {
            for (int j = diffArrays, upJ = 0; j < array[i].length-diffArrays; j++, upJ++) {
                upArray[upI][upJ]= array[i][j];
            }

        }
        return upArray;
    }
}
