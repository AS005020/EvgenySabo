package Git02.Decomposition.Task4;

import static java.lang.Math.*;

public class Solution {
    public static final int N = 5;

    public static void main(String[] args) {
        Point[] array = new Point[N];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Point((int)(Math.random()*10 - 5), (int)(Math.random()*10 - 5));
        }
        int ind1 = -1;
        int ind2 = -1;
        double max = 0;
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j < array.length; j++) {
                double distance = Point.distance(array[i],array[j]);
                if(distance > max){
                    ind1 = i;
                    ind2 = j;
                    max = distance;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(i +" : " + array[i]);
        }
        System.out.printf("Точки %d и %d самые далёкие друг от друга",ind1,ind2);
    }
    public static class Point{
        int x,y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public static double distance(Point a, Point b){
            double catet1=a.x-b.x;
            double catet2=a.y-b.y;
            return  sqrt(pow(catet1,2)+pow(catet2,2));
        }

        @Override
        public String toString() {
            return String.format("(%-2d, %-2d)", x,y);
        }
    }
}
