package Git04.SimpleObjects.Task10;

import static java.lang.Math.random;

public class Time implements Comparable<Time>{
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

    public static Time getRandomize(){
        return new Time((int)(random()*24), (int)(random()*60), (int)(random()*60));
    }

    private int convertTimeToSec(){
        return 3600*this.hh + 60*this.mm + this.ss;
    }
    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d",hh,mm,ss);
    }

    @Override
    public int compareTo(Time o) {
        if(this.convertTimeToSec() > o.convertTimeToSec())
            return 1;
        else if(this.convertTimeToSec() < o.convertTimeToSec())
            return -1;
        else
            return 0;
    }
}
