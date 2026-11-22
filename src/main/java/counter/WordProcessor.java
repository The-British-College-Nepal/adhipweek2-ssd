
package counter;

/**
 * WordProcessor implementation of the Counter interface.
 */
public class WordProcessor implements Counter {

    // STEP 3: Encapsulated Fallback State

    private String text = "";

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    // STEP 2 and STEP 3: Core Sentence Analysis Methods

    /**
     * Counts the number of words in the given sentence.
     *
     * @param sentence input string to analyze
     * @return number of words
     */
    @Override
    public int countWords(String sentence) {

        if (sentence == null) {
            sentence = this.text;
        }

        if (sentence.isEmpty()) {
            return 0;
        }

        return sentence.split(" ").length;
    }

    /**
     * Counts alphabetic letters only.
     *
     * @param sentence input string to analyze
     * @return count of alphabetic letters
     */
    @Override
    public int countLetters(String sentence) {

        if (sentence == null) {
            sentence = this.text;
        }

        int letters = 0;

        for (int i = 0; i < sentence.length(); i++) {
            if (Character.isLetter(sentence.charAt(i))) {
                letters++;
            }
        }

        return letters;
    }

    /**
     * Returns the total character length of the sentence.
     *
     * @param sentence input string to analyze
     * @return total length
     */
    @Override
    public int getLength(String sentence) {

        if (sentence == null) {
            sentence = this.text;
        }

        return sentence.length();
    }
}
