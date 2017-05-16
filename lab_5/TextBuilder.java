package lab_5;

import java.util.ArrayList;
import java.util.List;

/**
 * Клас є конструктором тексту
 */
public class TextBuilder {

    private List<Sentence> sentences = new ArrayList<>();

    private TextBuilder() {}

    /**
     * Розпочинає створення тексту
     * @return Екземпляр конструктора
     */
    public static TextBuilder beginText() {
        return new TextBuilder();
    }

    /**
     * Додає речення у список речень
     * @param sentence Вказане речення
     * @return Оновлений конструктор
     */
    public TextBuilder addSentence(Sentence sentence) {
        sentences.add(sentence);
        return this;
    }

    /**
     * Завершує створення тексту
     * @return Готовий текст
     */
    public Text endText() {
        return new Text(sentences.toArray(new Sentence[sentences.size()]));
    }

    /**
     * Розпочинає створення речення
     * @return Конструктор речення
     */
    public SentenceBuilder beginSentence() {
        return new SentenceBuilder();
    }

    /**
     * Клас описує конструктор речення
     */
    public class SentenceBuilder {

        private List<SentencePart> parts = new ArrayList<>();

        private SentenceBuilder() {}

        /**
         * Додає вказану частину речення до речення
         * @param part Частина речення
         * @return Оновлений конструктор
         */
        public SentenceBuilder addPart(SentencePart part) {
            parts.add(part);
            return this;
        }

        /**
         * Додає роздільник до речення
         * @param delimiter Letter Роздільник
         * @return Оновлене речення
         */
        public SentenceBuilder addDelimiter(Letter delimiter) {
            return addPart(new Delimiter(delimiter));
        }

        /**
         * Додає роздільник до речення
         * @param delimiter Char Роздільник
         * @return Оновлене речення
         */
        public SentenceBuilder addDelimiter(char delimiter) {
            return addDelimiter(new Letter(delimiter));
        }

        /**
         * Додає слово до речення
         * @param letters Символи цього слова
         * @return Оновлене речення
         */
        public SentenceBuilder addWord(Letter[] letters) {
            if(!parts.isEmpty()) {
                addDelimiter(' ');
            }
            return addPart(new Word(letters));
        }

        /**
         * Додає слово до речення
         * @param word Строкове представлення доданого слова
         * @return Оновлене речення
         */
        public SentenceBuilder addWord(String word) {
            Letter[] letters = new Letter[word.length()];
            for(int i = 0; i < letters.length; i++) {
                letters[i] = new Letter(word.charAt(i));
            }
            return addWord(letters);
        }

        /**
         * Завершує створення речення і додає його до конструктору текста
         * @param end Пунктуація у кінці речення
         * @return Оновлений TextBuilder
         */
        public TextBuilder endSentence(Delimiter end) {
            parts.add(end);
            TextBuilder.this.addSentence(new Sentence(parts.toArray(new SentencePart[parts.size()])));
            return TextBuilder.this;
        }

        /**
         * Завершує створення речення
         * @param end Пунктуація у кінці речення як Letter
         * @return Оновлений TextBuilder
         */
        public TextBuilder endSentence(Letter end) {
            return endSentence(new Delimiter(end));
        }

        /**
         * Завершує створення речення
         * @param end Пунктуація у кінці речення як char
         * @return Оновлений TextBuilder
         */
        public TextBuilder endSentence(char end) {
            return endSentence(new Letter(end));
        }

        /**
         * Починає створення слова
         * @return Конструктор слова
         */
        public WordBuilder beginWord() {
            return new WordBuilder();
        }

        public class WordBuilder {

            private List<Letter> letters = new ArrayList<>();

            private WordBuilder() {};

            /**
             * Додає символ до створеного слова
             * @param letter Символ
             * @return  Оновлений конструктор
             */
            public WordBuilder addLetter(Letter letter) {
                letters.add(letter);
                return this;
            }

            /**
             *  Додає символ до створеного слова
             * @param letter Символ як char
             * @return Оновлений конструктор
             */
            public WordBuilder addLetter(char letter) {
                return addLetter(new Letter(letter));
            }

            /**
             * Завершує створення слова і додає його до речення
             * @return Оновлений SentenceBuilder
             */
            public SentenceBuilder endWord() {
                SentenceBuilder.this.addPart(new Word(letters.toArray(new Letter[letters.size()])));
                return SentenceBuilder.this;
            }
        }

    }
}



