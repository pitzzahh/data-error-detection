package tech.araopj.helpers;

import java.util.Arrays;
import java.util.Objects;

/**
 * The Helper class provides various utility methods for common operations.
 */
public class Helper {

    /**
     * Checks if a given integer is even.
     *
     * @param num The integer to be checked.
     * @return True if the integer is even, false otherwise.
     */
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    /**
     * Checks if a given integer is odd.
     *
     * @param num The integer to be checked.
     * @return True if the integer is odd, false otherwise.
     */
    public static boolean isOdd(int num) {
        return num % 2 != 0;
    }

    /**
     * Checks if a given string represents a number (integer or decimal).
     *
     * @param val The string to be checked.
     * @return True if the string represents a number, false otherwise.
     */
    public static boolean isNum(String val) {
        return val.matches("^[-+]?\\d*\\.?\\d+$");
    }

    /**
     * Converts a character to its ASCII binary representation.
     *
     * @param value The character to be converted.
     * @return The ASCII binary representation of the character.
     */
    public static int getAsciiBinary(char value) {
        return Integer.parseInt(Integer.toBinaryString(value));
    }

    /**
     * Counts the number of set bits (1s) in the binary representation of an integer.
     *
     * @param binary The integer for which to count set bits.
     * @return The count of set bits in the binary representation.
     */
    public static long bitCount(int binary) {
        return Arrays.stream(String.valueOf(binary)
                        .split(""))
                .filter(e -> Objects.equals(e, "1"))
                .count();
    }
}
