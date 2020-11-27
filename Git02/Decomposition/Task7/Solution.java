package Git02.Decomposition.Task7;

public class Solution {
    public static void main(String[] args) {
        System.out.println("Сумма факториалов нечётных элементов " + sumOddFactorials());
    }
    public static int sumOddFactorials(){
        int sum = 0;
        int factorial=0;
        for (int i = 1; i < 10; i++) {
            if(i % 2 == 1) {
                factorial = factorial(i);
                System.out.println("Факториал числа " + i + " : " + factorial);
                sum+=factorial;
            }
        }
        return sum;

    }
    public static int factorial(int a)
    {
        if(a == 1)
            return 1;
        else
            return a*factorial(a-1);
    }
}
