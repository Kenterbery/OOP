package lab_5;

/**
 * Created by kenterbery on 05.05.17.
 */
public class Delimiter implements SentencePart {

    private final Letter letter;

    public Delimiter(Letter letter) {
        this.letter = letter;
    }

    @Override
    public boolean isWord() {
        return false;
    }

    @Override
    public String toString() {
        return letter.toString();
    }
}
