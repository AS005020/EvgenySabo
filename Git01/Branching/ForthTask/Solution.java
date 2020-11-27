package Git01.Branching.ForthTask;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        int x,y,z;
        //x-y низ
        //x-z бок
        //y-z второй бок
        Rectangle hole= new Rectangle(2,1);
        Brick brick = new Brick(1,2,2);
        if(hole.isInBrick(brick))
            System.out.println("Кирпич входит в дыру");
        else
            System.out.println("Кирпич не входит в дыру");
    }

    public static class Brick{
        int x,y,z;
        List<Side> sides = new ArrayList<>();

        public Brick(int x, int y, int z) {
            this.x = x;
            this.y = y;
            this.z = z;
            sides.add(new Side(x,z));
            sides.add(new Side(x,y));
            sides.add(new Side(y,z));
        }
    }

    public static class Side{
        protected int firstSide;
        protected int secondSide;

        public Side(int firstSide, int secondSide) {
            this.firstSide = firstSide;
            this.secondSide = secondSide;
        }

        public int minSide(){
            return (firstSide<secondSide)?firstSide:secondSide;
        }

        public int maxSide(){
            return (firstSide>secondSide)?firstSide:secondSide;
        }

    }

    public static class Rectangle extends Side{
        public Rectangle(int firstSide, int secondSide) {
            super(firstSide, secondSide);
        }
        public boolean isInSide(Side side){
            return (this.minSide() >= side.minSide() && this.maxSide() >= side.maxSide());
        }

        public boolean isInBrick(Brick brick){
            for (int i = 0; i < brick.sides.size(); i++) {
                if(isInSide(brick.sides.get(i)))
                    return true;
            }
            return false;
        }
    }
}
