package Git01.LinesProgram.FifthTask;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите T");
        long T = Integer.parseInt(reader.readLine());
        long h = T / 3600;
        long m = (T % 3600) / 60;
        long s = ((T % 3600) % 60);

        System.out.printf("%1$02dч %2$02dм %3$02dс",h,m,s);
        reader.close();
    }
}
