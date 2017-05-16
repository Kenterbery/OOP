package lab_5;

/**
 * Клас описує пунктуаційні знаки: коми, пробіли тощо
 */
public class Delimiter implements SentencePart {

    private final Letter letter;

    /**
     * Створює роздільник із символом, як параметр
     * @param letter Символ пунктуації
     */
    public Delimiter(Letter letter) {
        this.letter = letter;
    }

    /**
     * Метод інтерфейсу SentencePart - перевіряє, чи є
     * дана частина речення словом
     * @return false, оскільки це не слово
     */
    @Override
    public boolean isWord() {
        return false;
    }

    /**
     * Цей метод повертає строкове представлення роздільника
     * @return String представлення роздільника
     */
    @Override
    public String toString() {
        return letter.toString();
    }
}
