package Git01.LinesProgram.ForthTask;

public class Solution {
    public static void main(String[] args) {
        double d = 876.432;
        StringBuilder stringBuilder = new StringBuilder(Double.toString(d));
        String str=Integer.toString((int)d);
        stringBuilder.replace(0, 3,stringBuilder.substring(4));
        stringBuilder.replace(4,7,str);
        d = Double.parseDouble(stringBuilder.toString());
        System.out.println(d);
    }
}
