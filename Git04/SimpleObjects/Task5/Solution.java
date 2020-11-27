package Git04.SimpleObjects.Task5;
/*
5. Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение
на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и
произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния, и метод
позволяющее получить его текущее состояние. Написать код, демонстрирующий все возможности класса.
 */
public class Solution {
    public static class DecimalCounter{
        private int counter;
        private int startBorder=0;
        private int endBorder = Integer.MAX_VALUE;


        public DecimalCounter() {
            counter = (int)(Math.random()*endBorder + 1);
        }

        public DecimalCounter(int counter) {
            this.counter = counter;
        }

        public DecimalCounter(int counter, int startBorder, int endBorder) throws Exception {
            if(startBorder <0 || endBorder <0 || counter < 0 || startBorder > endBorder) {
                System.out.println("Ошибка инициализации");
                return;
            }
            this.counter = counter;
            this.startBorder = startBorder;
            this.endBorder = endBorder;
        }
        public boolean upConter(){
            if((counter+1) > endBorder) {
                System.out.println("Ошибка. Счётчик выходит за пределы диапазона");
                return false;
            }
            else {
                counter++;
                return true;
            }
        }

        public boolean downCounter(){
            if((counter-1) < startBorder) {
                System.out.println("Ошибка. Счётчик выходит за пределы диапазона");
                return false;
            }
            else {
                counter--;
                return true;
            }
        }

        public int getCounter() {
            return counter;
        }
    }

    public static void main(String[] args) {
        DecimalCounter[] decimalCounter = null;
        try {
            decimalCounter = new DecimalCounter[]{new DecimalCounter(), new DecimalCounter(1),new DecimalCounter(-1,1,1), new DecimalCounter(1,1,1)};
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        for (int i = 0; i < decimalCounter.length; i++) {
            System.out.println();
            if(decimalCounter[i] != null){
                System.out.println(decimalCounter[i].getCounter());
                decimalCounter[i].downCounter();
                System.out.println(decimalCounter[i].getCounter());
                decimalCounter[i].upConter();
                System.out.println(decimalCounter[i].getCounter());
            }
        }
    }
}
