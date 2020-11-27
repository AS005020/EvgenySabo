package Git01.Cycels.SeventhTask;
import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Введите начало промежутка m = ");
        int m = Integer.parseInt(reader.readLine());

        System.out.print("Введите конец промежутка n = ");
        int n = Integer.parseInt(reader.readLine());

        for (int i = m; i < n; i++) {
            System.out.println("Делители числа "+i);
            int devider = 2;
            int num = i;
            while(devider <= i){
                if(num%devider == 0){
                    System.out.println(devider);
                }
                devider++;
            }
            System.out.println();
        }
        reader.close();
        
    }
}
