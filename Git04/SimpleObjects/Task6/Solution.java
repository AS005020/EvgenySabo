package Git04.SimpleObjects.Task6;
/*
6. Составьте описание класса для представления времени. Предусмотрте возможности установки времени и
изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае
недопустимых значений полей поле устанавливается в значение 0. Создать методы изменения времени на
заданное количество часов, минут и секунд.
 */
public class Solution {

    public static class Time{
        private int hh;
        private int mm;
        private int ss;

        public Time(int hh, int mm, int ss) {
            setHh(hh);
            setMm(mm);
            setSs(ss);
        }

        public void setHh(int hh) {
            if(hh <0 && hh > 24)
                hh = 0;
            this.hh = hh;
        }

        public void setMm(int mm) {
            if(mm <0 && mm > 60)
                mm = 0;
            this.mm = mm;
        }

        public void setSs(int ss) {
            if(ss <0 && ss > 60)
                ss = 0;
            this.ss = ss;
        }

        public void upToSs(int n){
            upToTime(n);
        }

        public void upToMm(int n){
            upToTime(n*60);
        }

        public void upToHh(int n){
            upToTime(n*3600);
        }

        public void downToSs(int n){
            downToTime(n);
        }

        public void downToMm(int n){
            downToTime(n*60);
        }

        public void downToHh(int n){
            downToTime(n*3600);
        }

        private void upToTime(int time)
        {
            int resultTime = 3600*hh + 60*mm + ss;
            resultTime+=time;
            convertSecToTime(resultTime);
        }
        private void downToTime(int time)
        {
            int resultTime = 3600*hh + 60*mm + ss;
            resultTime-=time;
            convertSecToTime(resultTime);
        }
        private void convertSecToTime(int sec){
            setHh((sec/3600)%24);
            setMm((sec%3600)/60);
            setSs((sec%3600)%60);
        }

        @Override
        public String toString() {
            return String.format("%02d:%02d:%02d",hh,mm,ss);
        }
    }

    public static void main(String[] args) {
        Time time = new Time(21,20,59);
        System.out.println(time);
        time.upToSs(2);
        System.out.println(time);
        time.upToMm(2);
        System.out.println(time);
        time.upToHh(4);
        System.out.println(time);
    }

}
