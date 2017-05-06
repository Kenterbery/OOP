package lab_5;

/**
 * Created by kenterbery on 05.05.17.
 */
public class Text {

    private Sentence[] sentences;

    public Text(Sentence[] sentence) {
        this.sentences = sentence;
    }

    public int size () {
        return sentences.length;
    }

    public Sentence getSentence(int index) {
        return sentences[index];
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        if(sentences.length != 0) {
            for(int i = 0; i < sentences.length - 1; i++) {
                sb.append(sentences[i].toString()).append(' ');
            }
            sb.append(sentences[sentences.length - 1]);
        }
        return sb.toString();
    }
}
