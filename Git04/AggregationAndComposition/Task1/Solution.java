package Git04.AggregationAndComposition.Task1;
/*
1. Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на
консоль текст, заголовок текста.

 */
public class Solution {
    public static void main(String[] args) {
        Text text = new Text("Example",new Sentence(new Word("hello"), new Word("world")),
                new Sentence(new Word("programmed"), new Word("to"), new Word("work"), new Word("and"),
                        new Word("not"), new Word("to"), new Word("feel")));
        System.out.println(text);
        text.add(new Word("not"), new Word("even"),new Word("shure"), new Word("that"),
                new Word("is"), new Word("real"));

        text.add(new Sentence(new Word("hello"), new Word("world")));
        System.out.println(text);
        text.showHeader();
    }
}
