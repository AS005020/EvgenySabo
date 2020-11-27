package Git01.Branching.SixthTask;

import java.io.*;


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите x = ");
        int x = Integer.parseInt(reader.readLine());
        if(x<=3)
            System.out.println((Math.pow(x,2) - 3*x + 9));
        else
            System.out.println((1/(Math.pow(x,3)+6)));
        reader.close();
    }
}
