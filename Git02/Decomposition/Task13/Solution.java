package Git02.Decomposition.Task13;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        System.out.print("Введите n = ");
        int n = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        showTwins(n);


    }

    public static void showTwins(int n){
        if (n <= 1) {
            System.out.println("Введено неккоректное n");
            return;
        }
        System.out.printf("Пары близнецы в промежудке [%d, %d]\n",n,2*n);
        for(int i = n; i < 2*n -1 ; i++){
            System.out.println(i + " - " + (i+2));
        }
    }
}
