package me.araopj.dataErrorDetection;

import me.araopj.cscreen.classes.Position;
import me.araopj.cscreen.components.CTable;
import me.araopj.helpers.Helper;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
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
 * @version 0.0.1
 * @since 0.0.1
 */
public class ParityCheck implements Handler {
    private final String[] header = {
            "Letter",
            "ASCII Binary Equivalent",
            "Number of bits",
            "Parity",
            "Parity Bit Set",
            "ASCII Binary with Parity Bit"
    };
    public static int oddValue = 1;
    public static int evenValue = 0;

    /**
     * Handles the input for error detection.
     *
     * @param input The user input data to be checked for errors.
     * @return true if the handler checks valid data
     */
    @Override
    public boolean handle(String input) {
        final List<List<Model>> tableData = Arrays.stream(input.split(""))
                .map(e -> {
                    char character = e.charAt(0);
                    long asciiBinary = Helper.getAsciiBinary(character);
                    long bitCount = Helper.bitCount(asciiBinary);
                    String parity = Helper.isEven(bitCount) ? "Even" : "Odd";
                    int parityBitSet = Helper.parityBitSet(parity);
                    return List.of(new Model(
                            character,
                            asciiBinary,
                            bitCount,
                            parity,
                            parityBitSet,
                            Helper.asciiBinaryWithParityBit(asciiBinary, parityBitSet)
                    ));
                })
                .collect(Collectors.toUnmodifiableList());

        CTable table = new CTable(header);
        table.useBoxSet();
        table.hasSeparator(true);

        for (int i = 0; i < header.length; i++) {
            table.setColumnAlignment(i, Position.CENTER);
        }

        tableData.stream()
                .flatMap(Collection::stream)
                .forEach(e -> table.addRow(e.getData())); // impure

        table.display();

        return false;
    }

    protected static class Model {
        public char letter;
        public long asciiBinary;
        public long numberOfBits;
        public String parity;
        public int parityBitSet;
        public long abBitSet;

        public Model(char letter, long asciiBinary, long numberOfBits, String parity, int parityBitSet, long abBitSet) {
            this.letter = letter;
            this.asciiBinary = asciiBinary;
            this.numberOfBits = numberOfBits;
            this.parity = parity;
            this.parityBitSet = parityBitSet;
            this.abBitSet = abBitSet;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Model model = (Model) o;
            return asciiBinary == model.asciiBinary && numberOfBits == model.numberOfBits && parityBitSet == model.parityBitSet && abBitSet == model.abBitSet && Objects.equals(letter, model.letter) && Objects.equals(parity, model.parity);
        }

        @Override
        public int hashCode() {
            return Objects.hash(letter, asciiBinary, numberOfBits, parity, parityBitSet, abBitSet);
        }

        public String[] getData() {
            return new String[]{
                    String.valueOf(letter),
                    String.valueOf(asciiBinary),
                    String.valueOf(numberOfBits),
                    parity,
                    String.valueOf(parityBitSet),
                    String.valueOf(abBitSet)
            };
        }
    }
}
