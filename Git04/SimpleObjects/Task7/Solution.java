package Git04.SimpleObjects.Task7;
/*
7. Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления
площади, периметра и точки пересечения медиан.
 */
import static java.lang.Math.*;
public class Solution {
    public static class Triangle{
       Point a,b,c;
       double ab,bc,ac;
        public Triangle(Point a, Point b, Point c) {
            this.a = a;
            this.b = b;
            this.c = c;
            ab = sqrt(pow((a.x - b.x),2) + pow((a.y - b.y),2));
            bc = sqrt(pow((c.x - b.x),2) + pow((c.y - b.y),2));
            ac = sqrt(pow((a.x - c.x),2) + pow((a.y - c.y),2));
            if(!isExsist())
                System.out.println("Такого треугольника не существует");
        }

        private boolean isExsist(){
            if((ab < bc+ac)&& (bc < (ab + ac)) && (ac < ab + bc))
                return true;
            return false;
        }

        public double perimeter(){
            return ab + bc + ac;
        }

        public double squer(){
            double halfPerimeter =  perimeter()/2;
            return sqrt(halfPerimeter*(halfPerimeter-ab)*(halfPerimeter - bc)*(halfPerimeter - ac));
        }

        public Point medianIntersection(){
            return new Point((a.x+b.x+c.x)/3,(a.y+b.y+c.y)/3);
        }

    }
    public static class Point{
        double x,y;
        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return String.format("(%.2f; %.2f)",x,y);
        }
    }

    public static void main(String[] args) {
        Triangle test = new Triangle(new Point(0,0), new Point(0,5),new Point(5,1));
        System.out.println(test.squer());
        System.out.println(test.perimeter());
        System.out.println(test.medianIntersection());
    }


}
