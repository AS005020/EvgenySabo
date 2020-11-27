package Git04.AggregationAndComposition.Task1;


public class Sentence {
    Word[] words;


    public Sentence(Word ... words) {
        this.words = words;
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder("");
        for (int i = 0; i < words.length; i++) {
            if(i == 0)
                string.append(Character.toUpperCase(words[i].getWord().charAt(0))).append(words[i].getWord().substring(1));
            else
                string.append(words[i].getWord());
            if(i != words.length - 1)
                string.append(' ');
            else
                string.append('.');
        }
        return string.toString();
    }
}
