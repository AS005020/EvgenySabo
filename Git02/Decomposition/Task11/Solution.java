package Git02.Decomposition.Task11;

public class Solution {
    public static void main(String[] args) {
        int a = 1;
        int b = 11;
        int result = compareSize(a,b);
        if(result == 1){
            System.out.printf("РАЗМЕР %d БОЛЬШЕ %d",a,b);
        }
        else if (result == -1){
            System.out.printf("РАЗМЕР %d МЕНЬШЕ %d",a,b);
        }
        else if (result == 0){
            System.out.printf("РАЗМЕР %d РАВЕН %d",a,b);
        }
    }

    public static int compareSize(int a,int b){
        int sizeA=numSize(a);
        int sizeB=numSize(b);
        if(sizeA > sizeB)
            return 1;
        else if(sizeA < sizeB)
            return -1;
        else
            return 0;
    }
    public static int numSize(int a){
        int size = 0;
        while(a > 0){
            size++;
            a/=10;
        }
        return size;
    }


}
