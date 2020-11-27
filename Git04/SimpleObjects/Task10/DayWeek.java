package Git04.SimpleObjects.Task10;

public enum DayWeek {
    MON("Пн"), TUE("Вт"), WEN("Ср"), THU("Чт"), FRI("Пт"), SAT("Сб"), SUN("Вс");
    String name;

    DayWeek(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "'" + name + '\'';
    }
    public static DayWeek getRandomize(){
        return  DayWeek.values()[(int)(Math.random()*DayWeek.values().length)];
    }
}
