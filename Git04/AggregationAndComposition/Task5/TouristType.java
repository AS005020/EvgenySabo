package Git04.AggregationAndComposition.Task5;

public enum TouristType {
    REST("Отдых"), EXCURSION("Экскурсия"), HEALTH("Лечение"),
    SHOPPING("Шопинг"), CRUISE("Круиз");
    String name;

    TouristType(String name) {
        this.name = name;
    }

    static TouristType getRandomizeType(){
        return TouristType.values()[(int)(Math.random()*TouristType.values().length)];
    }

    @Override
    public String toString() {
        return "TouristType{" +
                "name='" + name + '\'' +
                '}';
    }
}

