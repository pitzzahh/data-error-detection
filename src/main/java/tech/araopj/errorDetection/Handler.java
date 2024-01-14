package tech.araopj.errorDetection;

@FunctionalInterface
public interface Handler<T> {
    /**
     * Handles the input for error detection.
     *
     * @param input The user input data to be checked for errors.
     */
    void handle(String input);
}
