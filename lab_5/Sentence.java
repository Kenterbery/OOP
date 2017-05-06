package lab_5;

/**
 * Created by kenterbery on 05.05.17.
 */
public class Sentence {

    private final SentencePart[] parts;

    public Sentence(SentencePart[] parts) {
        this.parts = parts;
    }

    public int size() {
        return parts.length;
    }

    public SentencePart getPart(int index) {
        return parts[index];
    }

    public void setPart(int index, SentencePart part) {
        parts[index] = part;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        for (SentencePart part : parts) {
            sb.append(part.toString());
        }
        return sb.toString();
    }
}
