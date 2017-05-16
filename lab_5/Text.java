package lab_5;

/**
 * Клас представляє текст, який складається з масиву речень
 */
public class Text {

    private Sentence[] sentences;

    /**
     * Створює текст із заданого масиву речень
     * @param sentence Масив речень тексту
     */
    public Text(Sentence[] sentence) {
        this.sentences = sentence;
    }

    /**
     * Метод повертає кількість речень у тексті
     * @return int Кільеість речень у тексті
     */
    public int size () {
        return sentences.length;
    }

    /**
     * Метод повертає речення за вказаним індексом
     * @param index Індекс речення, що треба повернути
     * @return Речення за індексом
     */
    public Sentence getSentence(int index) {
        return sentences[index];
    }

    /**
     * Метод повертає строкове представлення тексту
     * @return Строкове представлення тексту
     */
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
