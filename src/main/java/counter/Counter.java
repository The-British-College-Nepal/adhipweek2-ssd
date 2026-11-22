
package counter;

/**
 * Step 1: Complete the Counter interface contract.
 *
 * An interface defines a set of operations that classes must provide.
 * Methods declared in an interface have no body and are implicitly public and abstract.
 */
public interface Counter {

    /**
     * Counts the number of words in the given sentence.
     *
     * @param sentence the sentence whose words are to be counted
     * @return the total number of words in the sentence
     */
    int countWords(String sentence);

    /**
     * Counts the number of letters in the given sentence.
     *
     * @param sentence the sentence whose letters are to be counted
     * @return the total number of letters in the sentence
     */
    int countLetters(String sentence);

    /**
     * Calculates the total length of the given sentence.
     *
     * @param sentence the sentence whose length is to be calculated
     * @return the total length of the sentence
     */
    int getLength(String sentence);

}
