package lab_5;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kenterbery on 05.05.17.
 */
public class TextBuilder {

    private List<Sentence> sentences = new ArrayList<>();

    private TextBuilder() {}

    public static TextBuilder beginText() {
        return new TextBuilder();
    }

    public TextBuilder addSentence(Sentence sentence) {
        sentences.add(sentence);
        return this;
    }

    public Text endText() {
        return new Text(sentences.toArray(new Sentence[sentences.size()]));
    }

    public SentenceBuilder beginSentence() {
        return new SentenceBuilder();
    }

    public class SentenceBuilder {

        private List<SentencePart> parts = new ArrayList<>();

        private SentenceBuilder() {}

        public SentenceBuilder addPart(SentencePart part) {
            parts.add(part);
            return this;
        }

        public SentenceBuilder addDelimiter(Letter delimiter) {
            return addPart(new Delimiter(delimiter));
        }

        public SentenceBuilder addDelimiter(char delimiter) {
            return addDelimiter(new Letter(delimiter));
        }

        public SentenceBuilder addWord(Letter[] letters) {
            if(!parts.isEmpty()) {
                addDelimiter(' ');
            }
            return addPart(new Word(letters));
        }

        public SentenceBuilder addWord(String word) {
            Letter[] letters = new Letter[word.length()];
            for(int i = 0; i < letters.length; i++) {
                letters[i] = new Letter(word.charAt(i));
            }
            return addWord(letters);
        }

        public TextBuilder endSentence(Delimiter end) {
            parts.add(end);
            TextBuilder.this.addSentence(new Sentence(parts.toArray(new SentencePart[parts.size()])));
            return TextBuilder.this;
        }

        public TextBuilder endSentence(Letter end) {
            return endSentence(new Delimiter(end));
        }

        public TextBuilder endSentence(char end) {
            return endSentence(new Letter(end));
        }

        public WordBuilder beginWord() {
            return new WordBuilder();
        }

        public class WordBuilder {

            private List<Letter> letters = new ArrayList<>();

            private WordBuilder() {};

            public WordBuilder addLetter(Letter letter) {
                letters.add(letter);
                return this;
            }

            public WordBuilder addLetter(char letter) {
                return addLetter(new Letter(letter));
            }

            public SentenceBuilder endWord() {
                SentenceBuilder.this.addPart(new Word(letters.toArray(new Letter[letters.size()])));
                return SentenceBuilder.this;
            }
        }

    }
}



