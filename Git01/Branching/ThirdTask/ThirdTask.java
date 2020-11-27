package Git01.Branching.ThirdTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class ThirdTask {
    public static final int NUM = 3;
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Point> list = new ArrayList<>();
        for (int i = 0; i < NUM; i++) {
            list.add(new Point(reader));
        }

        for (int i = 0; i < NUM; i++) {
            Point a = list.get(i);
            for (int j = 0; j < NUM; j++) {
                if(i == j)
                    break;
                Point b = list.get(j);
                if(a.x == b.x || a.y == b.y)
                    System.out.printf("Точка %s лежит на ондной прямой с точкой %s\n", a,b);
            }
        }

        reader.close();
    }

    public static class Point {
        int x;
        int y;
        String name ="A";
        static int idName = 0;

        public Point(BufferedReader reader)  {

            try {
                System.out.print("Введите x = ");
                x=Integer.parseInt(reader.readLine());
                System.out.print("Введите y = ");
                y = Integer.parseInt(reader.readLine());

            } catch (IOException e) {
                e.printStackTrace();
            }
            name = Character.toString((char)((int)name.charAt(0) + idName));
            idName++;
        }

        @Override
        public String toString() {
            return String.format("%s(%d,%d)",this.name, this.x, this.y);
        }
    }
}
