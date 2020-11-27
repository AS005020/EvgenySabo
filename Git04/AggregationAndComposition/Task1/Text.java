package Git04.AggregationAndComposition.Task1;

public class Text {
    String header;
    Sentence[] sentences;

    public Text(String header, Sentence ... sentences) {
        this.header = header;
        this.sentences = sentences;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("\t\t\t").append(header).append('\n');
        for (int i = 0; i < sentences.length; i++) {
            res.append(sentences[i].toString()).append('\n');
        }
        return res.toString();
    }
    public void showHeader(){
        System.out.println("Заголовок текста " + header);
        System.out.println();
    }

    public void add(Word ... word){
        addSentence(new Sentence(word));
    }

    public void add(Sentence ... sentences){
        addSentence(sentences);
    }

    private void addSentence(Sentence ... sentence){
        int wSize = this.sentences.length + sentence.length;
        Sentence[] wSentence = new Sentence[wSize];
        for (int i = 0; i < this.sentences.length; i++) {
            wSentence[i] = this.sentences[i];
        }
        for (int i = 0, j = this.sentences.length; j < wSize; i++, j++) {
            wSentence[j] = sentence[i];
        }
        this.sentences = wSentence;
    }
}
