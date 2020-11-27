package Git01.Cycels.EighthTask;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Введите первое число ");
        String firstNum = reader.readLine();

        System.out.print("Введите второе число ");
        String secondNum = reader.readLine();

        System.out.println("Первое число состоит из:");
        for (int i = 0; i < firstNum.length(); i++) {
            System.out.print(cifr(firstNum.charAt(i))+ " ");
        }
        System.out.println();

        System.out.println("Второе число состоит из:");
        for (int i = 0; i < secondNum.length(); i++) {
            System.out.print(cifr(secondNum.charAt(i))+ " ");
        }

        reader.close();
    }

    public static String cifr(char c){
        switch (c){
            case '1' :
                return "единица";
            case '2':
                return "двойка";
            case '3':
                return "тройка";
            case '4':
                return "четвёрка";
            case '5':
                return "пятёрка";
            case '6':
                return "шестёрка";
            case '7':
                return "семёрка";
            case '8':
                return "восьмёрка";
            case '9':
                return "девятка";
            case '0':
                return "ноль";
        }
        return "ошибка";
    }
}
