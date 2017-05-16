package lab_5;

/**
 * Клас, що описує слово - основний елемент у реченні
 */
public class Word implements SentencePart{

    private final Letter[] letters;

    /**
     * Створює масив літер, що представляють слово
     * @param letters Літери даного слова
     */
    public Word(Letter[] letters) {
        this.letters = letters;
    }

    /**
     * Метод повертає довжину слова, що є кількістю літер у слові
     * @return int Кількість літер у слові
     */
    public int len() {
        return letters.length;
    }

    /**
     * Цей метод повертає літеру слова за індексом
     * @param index Індекс потрібної літери
     * @return Літеру за індексом
     */
    public Letter getLetter(int index) {
        return letters[index];
    }

    /**
     * Метод інтерфейсу SentencePart - перевіряє, чи є
     * дана частина речення словом
     * @return true, оскільки це слово
     */
    @Override
    public boolean isWord() {
        return true;
    }

    /**
     * Цей метод повертає строкове представлення слова
     * @return String представлення слова
     */
    public String toString() {
        StringBuffer sb = new StringBuffer();
        for (Letter letter: letters) {
            sb.append(letter.toString());
        }
        return sb.toString();
    }
}
