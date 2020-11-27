package Git02.OneDimArray.Task4;
/*
    Даны действительные числа а1, а2, ...,аn.
    Поменять местами наименьший и наибольший элемент
 */
public class Solution {
    public static final int N = 6;

    public static void main(String[] args) {
        double[] array = new double[N];

        for (int i = 0; i < N; i++) {
            array[i]=(Math.random()*10 - 5);
        }

        showArray(array);


        int minInd=indexOfMin(array);
        int maxInd = indexOfMax(array);
        System.out.printf("Меняем местами максимальный %.2f и минальный %.2f элененты\n",array[maxInd],array[minInd]);
        double temp = array[minInd];
        array[minInd] = array[maxInd];
        array[maxInd] = temp;

        showArray(array);
    }

    public static int indexOfMax(double[] array){
        double max = array[0];
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if(max < array[i]){
                max = array[i];
                index = i;
            }
        }
        return index;
    }
    public static int indexOfMin(double[] array){
        double min = array[0];
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if(min > array[i]){
                min = array[i];
                index = i;
            }
        }
        return index;
    }
    public static void showArray(double[] array){
        System.out.println("Текущий массив");
        for(double n : array){
            System.out.printf("%.2f ",n);
        }
        System.out.println();
    }
}
