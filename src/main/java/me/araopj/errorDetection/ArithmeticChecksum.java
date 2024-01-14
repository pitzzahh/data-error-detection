package me.araopj.errorDetection;

/**
 * Arithmetic Checksum - A checksum is a sequence of numbers and letters used to check data for errors. This
 * sum is then added to the end of the message, and the message is transmitted to the receiving end.
 * <ul>
 *     <li>Many higher-level protocols used on the Internet (such as TCP and IP) use a form of error detection in
 *         which the characters to be transmitted are "summed" together.</li>
 *     <li>It has two (2) sides: sender’s side (checksum creation) and receiver’s side (checksum validation).</li>
 * </ul>
 *
 * @author Peter John Arao
 * @version 0.0.1
 * @since 0.0.1
 */
public class ArithmeticChecksum implements Handler {

    /**
     * Handles the input for error detection.
     *
     * @param input The user input data to be checked for errors.
     * @return true if the handler checks valid data
     */
    @Override
    public boolean handle(String input) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
