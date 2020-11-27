package Git04.SimpleObjects.Task9;

public enum Cover {
    HARD("Твёрдый переплёт"),SOFT("Мягкий переплёт");
    String name;

    Cover(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }

    public static Cover getRandom(){

        return Cover.values()[(int)(Math.random()*Cover.values().length)];
    }
}
