package Git02.Decomposition.Task15;
import java.io.*;
public class Solution {
    public static final int N;
    static{
        System.out.print("Введите максимальное количество разрядов N = ");
        int result = 0;
        try {
            result = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        N = result;

    }

    public static void main(String[] args) {
        System.out.println("Вывод строго возрастающиъ элементов");
        showUpNum();
    }
    public static void showUpNum() {
        for (int i = 1; i < Math.pow(10,N) ; i++) {
            if(isUpNum(numToArray(i)))
                System.out.println(i);
        }
    }

    public static boolean isUpNum(int[] array){
        for (int i = 1; i < array.length; i++) {
            if(array[i-1]>= array[i] )
                return false;
        }
        return true;
    }
    public static int[] numToArray(int a){
        int tempA = a;
        int size = 0;
        while(tempA > 0){
            size++;
            tempA/=10;
        }
        tempA = a;
        int[] array = new int[size];
        for (int i = array.length-1; i >= 0; i--) {
            array[i]=tempA%10;
            tempA/=10;
        }
        return array;
    }
}
