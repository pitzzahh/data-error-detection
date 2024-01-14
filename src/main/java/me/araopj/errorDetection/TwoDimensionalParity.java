package me.araopj.errorDetection;

/**
 * Two-Dimensional Parity (Longitudinal Redundancy Check) - In the two-dimensional parity check, blocks of
 * data are organized as a two-dimensional array. This method increases the likelihood of detecting burst errors.
 * <ul>
 *     <li>Specifically, each row of the array is a data block that is to be transmitted.</li>
 *     <li>A parity bit is appended to each column based on if even or odd parity is used.</li>
 * </ul>
 *
 * @author Peter John Arao
 * @version 1.0
 * @since 1.0
 */
public class TwoDimensionalParity implements Handler {

    /**
     * Handles the input for error detection.
     *
     * @param input The user input data to be checked for errors.
     * @return true if the handler checks valid data
     */
    @Override
    public boolean handle(String input) {
        return false;
    }
}
