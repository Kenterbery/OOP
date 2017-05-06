package lab_5;

/**
 * Created by kenterbery on 05.05.17.
 */
public class Main {

    public static int len = 4;
    public static String pattern = "er";

    public static void main(String[] args) {
        Text text = TextBuilder
                .beginText()
                    .beginSentence()
                        .addWord("I").addWord("wrote").addWord("this").addWord("text")
                        .addWord("for").addWord("testing").addWord("my").addWord("program")
                    .endSentence('.')
                    .beginSentence()
                        .addWord("For").addWord("example").addDelimiter(',').addWord("let's")
                        .addWord("take").addWord("some")
                        .addWord("words").addWord("like").addDelimiter(':')
                        .addWord("Soap").addDelimiter(',')
                        .addWord("street").addDelimiter(',')
                        .addWord("aunt")
                    .endSentence('.')
                .endText();

        System.out.println(text);

        for(int i = 0; i < text.size(); i++) {
            Sentence sentence = text.getSentence(i);
                for(int j = 0; j < sentence.size(); j++) {
                    SentencePart part = sentence.getPart(j);
                    if(part.isWord()) {
                        Word word = (Word) part;
                        char first = word.getLetter(0).getLetter();
                        boolean check = Character.toString(first).matches("(?i:[qwrtpsdfghjklzxcvbnm])");
                        if(check && word.len() == len) {
                            sentence.setPart(j, new Delimiter(new Letter(' ')));

                        }
                    }
                }
        }

        System.out.println(text);
    }
}
