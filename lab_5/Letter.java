package lab_5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Класс символу
 */
public class Letter {

    private final char letter;

    /**
     * Створює екземпляр символу з char, як параметр
     * @param letter Параметр символ
     */
    public Letter(char letter) {
        this.letter = letter;
    }

    /**
     * Метод повертає char цієї символу
     * @return Char символу
     */
    public char getLetter() {
        return letter;
    }

    /**
     * Метод повертає строкове представлення символу
     * @return String представлення символу
     */
    @Override
    public String toString() {
        return Character.toString(letter);
    }
}
