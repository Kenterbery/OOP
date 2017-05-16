package lab_5;

/**
 * Інтерфейс для частин речення - слів та роздільників
 */
public interface SentencePart {
    /**
     * Метод перевіряє, чи є дана частина словом
     * @return true, якщо є
     * @return false, якщо ні
     */
    boolean isWord();
}
