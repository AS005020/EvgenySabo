package Git04.AggregationAndComposition.Task5;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class TouristPackageArray {
    private int size;

    TouristPackage[] packages;
    public TouristPackageArray(int size) {
        this.size = size;
        packages = new TouristPackage[size];
        for (int i = 0; i < packages.length; i++) {
            packages[i]=new TouristPackage(TouristType.getRandomizeType(), BD.getRandomizeTransport(), (int)(Math.random()*4),(int)(Math.random()*14 +7) );
        }
    }

    public TouristPackageArray(TouristPackage[] packages) {
        this.packages = packages;
    }

    void showArray(){
        for(TouristPackage t : packages)
                System.out.println(t);
        System.out.println();
    }
    void showTouristWithTour(TouristType type){
        System.out.println("Список туристических путёвок типа " + type + ": ");
        for(TouristPackage t : packages)
            if(t.type == type)
                System.out.println(t);
        System.out.println();

    }
    void showTouristWithMeals(int countMeals){
        System.out.printf("Список туристических путёвок c %d-ым питание: ", countMeals);
        for(TouristPackage t : packages)
            if(t.mealsCount == countMeals)
                System.out.println(t);
        System.out.println();

    }
    void showTouristWithDay(int day){
        System.out.println("Список туристических путёвок на " + day + " дней: ");
        for(TouristPackage t : packages)
            if(t.dayCount == day)
                System.out.println(t);
        System.out.println();

    }
    void showTouristWithTransport(String transport){
        System.out.println("Список путёвок, транспорт у которых " + transport + ": ");
        for(TouristPackage t : packages)
            if(t.transport.equals(transport))
                System.out.println(t);
        System.out.println();
    }

    void showSortByOptimal(String transport, int mealsCount, int dayCount){
        System.out.printf("Список путёвок, подобранных по предпочтениям клиента: (Транспорт \"%s\" , %d-ое питание, %d дней)\n", transport,mealsCount,dayCount);
        TouristPackage[] tempArray = packages.clone();
        int max;
        for (int i = 0; i < tempArray.length - 1; i++) {
            for (int j = i+1; j < tempArray.length; j++) {
                if(tempArray[i].getPriority(transport, mealsCount, dayCount) < tempArray[j].getPriority(transport, mealsCount, dayCount)){
                    TouristPackage temp =  tempArray[i];
                    tempArray[i]=tempArray[j];
                    tempArray[j] = temp;
                }
            }
            System.out.println(tempArray[i]);
        }
    }


}
