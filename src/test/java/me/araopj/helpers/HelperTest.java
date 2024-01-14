package me.araopj.helpers;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

class HelperTest {

    @BeforeEach
    void setUp() {
        System.out.println("---------------------------------------------------------");
    }

    @Test
    void shouldGetCorrectAsciiBinary() {
        char[] testData = {'P', 'I', 'T', 'Z', 'Z', 'A', 'H', 'H'
        };
        int[] expectedData = getAsciiBinaries();

        for (int i = 0, testDataLength = testData.length; i < testDataLength; i++) {
            int result = Helper.getAsciiBinary(testData[i]);
            System.out.printf("[result = %d] : [expected = %d] : [test data =  %s]\n", result, expectedData[i], testData[i]);
            assertEquals(expectedData[i], result);
        }
    }

    @Test
    void shouldGetExactNumberOfBits() {
        int[] testData = getAsciiBinaries();
        long[] expectedData = {2, 3, 3, 4, 4, 2, 2, 2};

        for (int i = 0, testDataLength = testData.length; i < testDataLength; i++) {
            long result = Helper.bitCount(testData[i]);
            System.out.printf("[bit count = %d] : [expected = %d] : [test data =  %d]\n", result, expectedData[i], testData[i]);
            assertEquals(expectedData[i], result);
        }
    }

    private static int[] getAsciiBinaries() {
        return new int[]{
                1010000,
                1001001,
                1010100,
                1011010,
                1011010,
                1000001,
                1001000,
                1001000
        };
    }
}