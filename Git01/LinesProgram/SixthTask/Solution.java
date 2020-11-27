package Git01.LinesProgram.SixthTask;

import com.sun.source.doctree.SystemPropertyTree;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            System.out.print("Введите x =");
            double x = Double.parseDouble(reader.readLine());
            System.out.print("Введите y =");
            double y =  Double.parseDouble(reader.readLine());
            if(isIn(x,y))
                System.out.println("true");
            else {
                System.out.println("false");
                break;
            }
        }

        reader.close();
    }

    public static boolean isIn(double x, double y){
        if ((y<=0 && y>=-3 && x>=-4 && x<=4) || (y >0 && y<=4 && x>=-2 && x<=2))
            return true;
        else
            return false;
    }
}
