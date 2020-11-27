package Git02.Decomposition.Task9;
import java.io.*;

import static java.lang.Math.*;
public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Расчёт площади четырёхугольника");
        System.out.println("Введите длину стороны X = ");
        int x = Integer.parseInt(reader.readLine());
        System.out.println("Введите длину стороны Y = ");
        int y = Integer.parseInt(reader.readLine());
        System.out.println("Угол между X и Y = 90");
        System.out.println("Введите длину стороны Z = ");
        int z = Integer.parseInt(reader.readLine());
        System.out.println("Введите длину стороны T = ");
        int t = Integer.parseInt(reader.readLine());
        if(!checkFourthAngle(new int[]{x,y,z,t}))
            System.out.println("Четырёхугольник не существует");
        else{
            System.out.println("Площадь четырёхугольника равна " + getSquareForthAngle(x,y,z,t));
        }

        reader.close();

    }
    public static boolean checkFourthAngle(int[] array){
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = 0; j < array.length; j++) {
                if(i!=j)
                    sum+=array[j];
            }
            if(!(array[i] < sum))
                return false;
        }
        return true;
    }

    public static double getSquareForthAngle(int x, int y, int z, int t){
        double rightTriangle = (x*y)/2.0 ;
        double xy = sqrt(pow(x,2) + pow(y,2));
        double pLastTriangle = (xy + z + t)/2;
        double lastTriangle =sqrt(pLastTriangle*(pLastTriangle-xy)*(pLastTriangle-z)*(pLastTriangle-t));
        return rightTriangle+lastTriangle;
    }
}
