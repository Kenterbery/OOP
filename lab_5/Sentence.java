package lab_5;

/**
 * Клас описує речення, що складається з SentencePart
 */
public class Sentence {

    private final SentencePart[] parts;

    /**
     * Створює речення як масив частин речення
     * @param parts Масив частин речення
     */
    public Sentence(SentencePart[] parts) {
        this.parts = parts;
    }

    /**
     * Метод повертає розмір речення як кількість різних частин речення
     * @return int Кількість частин речення
     */
    public int size() {
        return parts.length;
    }

    /**
     * Метод повертає частину речення за вказаним індексом
     * @param index Індекс частини речення, що потрібно повернути
     * @return Частину речення за індексом
     */
    public SentencePart getPart(int index) {
        return parts[index];
    }

    /**
     * Метод задає частину речення за вказаним індексом
     * @param index Індекс частини речення, яку треба задати
     * @param part Нова частина речення
     */
    public void setPart(int index, SentencePart part) {
        parts[index] = part;
    }

    /**
     * Повертає строкове представлення речення
     * @return String представлення речення
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        for (SentencePart part : parts) {
            sb.append(part.toString());
        }
        return sb.toString();
    }
}
