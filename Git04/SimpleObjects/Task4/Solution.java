package Git04.SimpleObjects.Task4;


import java.io.*;
import java.util.*;

public class Solution {
    public static class Train{
        String toPointName;
        int numTrain;
        Date timeWent;

        public Train(String toPointName, int numTrain, Date timeWent) {
            this.toPointName = toPointName;
            this.numTrain = numTrain;
            this.timeWent = timeWent;
        }

        @Override
        public String toString() {
            return String.format("Пункт назначения %s\nНомер поезда %d\nДата отправки %s",toPointName,numTrain,timeWent.toString());
        }
    }


    public static void main(String[] args) throws IOException {
        String[] cites = {"Брест", "Минск", "Гродно", "Гомель","Витебск"};
        Train[] trains = new Train[5];
        for (int i = 0; i < 5; i++) {
            trains[i]=new Train(cites[(int)(Math.random()*5)],(int)(Math.random()*10), new Date((long)(Math.random() * 10000000000L+ 10000000000000L)));
        }
        showTrains(trains);

        System.out.println("\nСортировка по номеру");
        showTrains(sortTrainsByNum(trains));

        System.out.print("\nПоиск поезда по номеру ");
        int n = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());

        showTrainInfo(trains, n);

        System.out.println("\nСортировка по пункту назначения");
        showTrains(sortByPoint(trains));


    }
    public static void showTrains(Train[] trains){
        for (int i = 0; i < trains.length; i++) {
            System.out.println(trains[i]);
        }
    }

    public static Train[] sortTrainsByNum(Train[] trains){
        Train[] temp = trains.clone();
        Collections.sort(Arrays.asList(temp), new Comparator<Train>() {
            @Override
            public int compare(Train o1, Train o2) {
                if(o1.numTrain > o2.numTrain)
                    return 1;
                else if(o1.numTrain < o2.numTrain)
                    return -1;
                return 0;
            }
        });
        return temp;
    }

    public static void showTrainInfo(Train[] trains, int num){
      for(Train train : trains){
          if(train.numTrain == num)
              System.out.println(train);
      }
    }

    public static Train[] sortByPoint(Train[] trains){
        Train[] temp = trains.clone();

        Collections.sort(Arrays.asList(temp), new Comparator<Train>() {
            @Override
            public int compare(Train o1, Train o2) {
                int compResult = o2.toPointName.compareTo(o1.toPointName);
               if(compResult == 0){
                   return o1.timeWent.compareTo(o2.timeWent);
               }
               return 0;
            }
        });

        return temp;
    }

}
