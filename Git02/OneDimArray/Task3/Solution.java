package Git02.OneDimArray.Task3;
/*
Дан массив действительных чисел, размернсть которого N
Подсчитать, сколько в нём отрицательных,
положительных и нулевых элементов
 */
public class Solution {

    public static final int N = 10;
    public static void main(String[] args) {
        double[] array = new double[N];

        for (int i = 0; i < N; i++) {
            array[i]=(Math.random()*100 - 50);
        }
        showArray(array);

        int positiveCount =0;
        int negativeCount = 0;
        int zeroCount = 0;
        for(double d : array){
            if(d > 0)
                positiveCount++;
            else if (d < 0)
                negativeCount++;
            else
                zeroCount++;
        }

        System.out.printf("Полжетельных элементов %d;\nОтрицательных элементов %d;\nНулей %d.\n",positiveCount,negativeCount,zeroCount);


    }
    public static void showArray(double[] array){
        System.out.println("Текущий массив");
        for(double n : array){
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
