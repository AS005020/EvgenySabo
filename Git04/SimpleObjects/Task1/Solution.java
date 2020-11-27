package Git04.SimpleObjects.Task1;

public class Solution {

    class Test1{
        int x,y;

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public void setX(int x) {
            this.x = x;
        }

        public void setY(int y) {
            this.y = y;
        }

        public int sum(){
            return x+y;
        }
        public int max(){
            return (x>y)?x:y;
        }
        public void showInfo(){
            System.out.println(this.toString());
        }
        @Override
        public String toString() {
            return "x = " + x + " y = " + y;
        }
    }
}
