package Git04.SimpleObjects.Task9;

public class BD {
    static String[] authors = {"Павлов", "Андреев", "Петров", "Купала",
                                "Фома","Чайка","Скороход","Будёнов"};
    static String[] publishingHouse = {"МИНТ","РОСКОВ","КОСМОС","РСМ"};

    public static String[] authorsGenerate(){
        int size =(int) (Math.random()* 3)+1;
        String[] res = new String[size];
        for (int i = 0; i < size;) {
            int idAuthor = (int)((Math.random()* authors.length));
            for (int j = 0; j < size; j++) {
                if(!authors[idAuthor].equals(res[j]))
                {
                    res[i]= authors[idAuthor];
                    i++;
                    break;
                }
            }
        }
        return res;
    }

    public static String puplishingHouseGenerate(){
        return publishingHouse[(int)(Math.random()*publishingHouse.length)];
    }

}
