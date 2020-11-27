package Git02.Sort.Task8;

public class Solution {
    public static final int N = 5;
    public static void main(String[] args) {
        Fraction[] array = new Fraction[N];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Fraction((int) (Math.random()*5 + 1),(int) (Math.random()*4 + 1));
            System.out.println(array[i]);
        }

        int nod = 1;
        for (int i = 0; i < array.length ; i++) {
            int num = array[i].getQ();
            int divider = 2;
            int tempNod = nod;
            while (divider <= num || num>1){
                if(num%divider == 0){
                    if(tempNod % divider != 0){
                        nod*=divider;
                    }
                    else
                        tempNod/=divider;
                    num/=divider;
                    continue;
                }
                divider++;
            }
        }
        System.out.println("НОД " + nod);
        for (int i = 0; i < array.length; i++) {
            array[i].setQ(nod);
            System.out.println(array[i]);
        }
    }
    public static class Fraction{
        private int p;
        private int q;

        public Fraction(int p, int q) {
            this.p = p;
            this.q = q;
        }

        public void setQ(int q) {
            p*=(q/this.q);
            this.q = q;
        }

        public int getP() {
            return p;
        }

        public int getQ() {
            return q;
        }

        @Override
        public String toString() {
            return p + "/" + q;
        }
    }
}