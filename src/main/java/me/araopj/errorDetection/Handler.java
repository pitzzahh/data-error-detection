package me.araopj.errorDetection;

@FunctionalInterface
public interface Handler {
    /**
     * Handles the input for error detection.
     *
     * @param input The user input data to be checked for errors.
     * @return true if the handler checks valid data
     */
    boolean handle(String input);
}
