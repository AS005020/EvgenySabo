package Git02.OneDimArray.Task6;
/*
    Задана последовательность N вещественных чисел.
    Вычислить сумму чисел, порядковые номера которых
    являются простыми числами
 */
public class Solution {
    public static final int N = 10;

    public static void main(String[] args) {
        double[] array = new double[N];
        double sumSimpleIndex = 0.0;
        for (int i = 0; i < N; i++) {
            array[i]=Math.random();
            if(isSimple(i))
            {
                System.out.println(i + " is simple");
                sumSimpleIndex+=array[i];
            }
        }
        System.out.println(sumSimpleIndex);


    }
    public static boolean isSimple(int i){
        int devider = 1;
        int numDevider = 0;
        while(devider <= i){
            if(i%devider == 0){
                numDevider++;
            }
            devider++;
        }
        return (numDevider == 2)?true:false;
    }
}
