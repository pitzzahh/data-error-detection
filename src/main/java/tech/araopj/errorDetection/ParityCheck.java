package tech.araopj.errorDetection;

import me.araopj.cscreen.classes.Position;
import me.araopj.cscreen.components.CTable;
import tech.araopj.helpers.Helper;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Parity Check (Vertical Redundancy Check) - A simple method of error detection is by adding redundant bits
 * called parity bits to each character.
 * <ul>
 *     <li>This method is called parity checking and is commonly used for ASCII characters where seven (7) bits
 *         are used for actual character encoding, and the eighth bit is for parity.</li>
 *     <li>It comes in two (2) basic forms: even parity and odd parity. The basic concept of parity checking is
 *         that a bit is added to a string of bits to create either even parity or odd parity.</li>
 *     <li>With even parity, the 0 or 1 added to the string produces an even number of binary 1s.</li>
 *     <li>With odd parity, the 0 or 1 added to the string produces an odd number of binary 1s.</li>
 * </ul>
 *
 * @author Peter John Arao
 * @version 1.0
 * @since 1.0
 */
public class ParityCheck implements Handler<ParityCheck> {
    private final String[] header = {
            "Letter",
            "ASCII Binary Equivalent",
            "Number of bits",
            "Parity",
            "Parity Bit Set",
            "ASCII Binary with ParityBit"
    };

    /**
     * Handles the input for error detection.
     *
     * @param input The user input data to be checked for errors.
     */
    @Override
    public void handle(String input) {
        List<List<String>> rows = Arrays.stream(input.split(""))
                .map(e -> {
                    char character = e.charAt(0);
                    int asciiBinary = Helper.getAsciiBinary(character);
                    long bitCount = Helper.bitCount(asciiBinary);
                    String parity = Helper.isEven(bitCount) ? "Even" : "Odd";
                    int parityBitSet = Helper.parityBitSet(parity);

                    return Arrays.asList(
                            String.valueOf(character),
                            String.valueOf(asciiBinary),
                            String.valueOf(bitCount),
                            parity,
                            String.valueOf(parityBitSet),
                            String.valueOf(Helper.asciiBinaryWithParityBit(asciiBinary, parityBitSet))
                    );
                })
                .collect(Collectors.toList());

        CTable table = new CTable(header);
        table.useBoxSet();
        table.hasSeparator(true);

        rows.forEach(e -> table.addRow(e.toArray(String[]::new)));

        for (int i = 0; i < header.length; i++) {
            table.setColumnAlignment(i, Position.CENTER);
        }

        table.display();
    }
}
