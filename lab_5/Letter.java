package lab_5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Class of letter
 */
public class Letter {

    private final char letter;

    public Letter(char letter) {
        this.letter = letter;
    }

    public char getLetter() {
        return letter;
    }

    @Override
    public String toString() {
        return Character.toString(letter);
    }
}
