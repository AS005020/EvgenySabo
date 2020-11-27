package Git01.Cycels.FivethTask;

public class Solution {
    public static final double E = 0.0001;

    public static void main(String[] args) {
        int n = 0;
        double sum =0.0;
        double a;
        while((a = 1/Math.pow(2,n) + 1/Math.pow(3,n)) >=E){
            n++;
            sum+=a;
        }

        System.out.printf("Сумма ряда а с числом e = %f равна %f",E,sum);
    }

}
