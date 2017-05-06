package lab_5;

/**
 * Created by kenterbery on 05.05.17.
 */
public class Word implements SentencePart{

    private final Letter[] letters;

    public Word(Letter[] letters) {
        this.letters = letters;
    }

    public int len() {
        return letters.length;
    }

    public Letter getLetter(int index) {
        return letters[index];
    }

    @Override
    public boolean isWord() {
        return true;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        for (Letter letter: letters) {
            sb.append(letter.toString());
        }
        return sb.toString();
    }
}
