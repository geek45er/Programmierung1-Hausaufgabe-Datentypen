import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    /**
     * Tests for the caesarChiffre method in the Main class.
     * This method applies a Caesar cipher shift (offset) to a given character.
     * Handles both uppercase and lowercase letters while preserving non-alphabetic characters.
     */

    @Test
    void testLowercaseCharacterWithPositiveOffset() {
        char result = Main.caesarChiffre('a', 3);
        assertEquals('d', result, "Failed to shift lowercase character 'a' by offset 3");
    }

    @Test
    void testUppercaseCharacterWithPositiveOffset() {
        char result = Main.caesarChiffre('A', 5);
        assertEquals('F', result, "Failed to shift uppercase character 'A' by offset 5");
    }

    @Test
    void testLowercaseCharacterWithNegativeOffset() {
        char result = Main.caesarChiffre('d', -3);
        assertEquals('a', result, "Failed to shift lowercase character 'd' by a negative offset of 3.");
    }

    @Test
    void testUppercaseCharacterWithNegativeOffset() {
        char result = Main.caesarChiffre('F', -5);
        assertEquals('A', result, "Failed to shift uppercase character 'F' by a negative offset of 5.");
    }

    @Test
    void testNonAlphabeticCharacter() {
        char result = Main.caesarChiffre('1', 10);
        assertEquals('1', result, "Non-alphabetic character '1' should remain unchanged.");
    }

    @Test
    void testLowercaseWrapAroundAtEndOfAlphabet() {
        char result = Main.caesarChiffre('z', 2);
        assertEquals('b', result, "Failed to handle wrap-around for lowercase character 'z' with offset 2.");
    }

    @Test
    void testUppercaseWrapAroundAtEndOfAlphabet() {
        char result = Main.caesarChiffre('Z', 3);
        assertEquals('C', result, "Failed to handle wrap-around for uppercase character 'Z' with offset 3.");
    }

    @Test
    void testLowercaseWrapAroundAtStartOfAlphabetWithNegativeOffset() {
        char result = Main.caesarChiffre('a', -2);
        assertEquals('y', result, "Failed to handle wrap-around for lowercase character 'a' with negative offset 2.");
    }

    @Test
    void testUppercaseWrapAroundAtStartOfAlphabetWithNegativeOffset() {
        char result = Main.caesarChiffre('A', -3);
        assertEquals('X', result, "Failed to handle wrap-around for uppercase character 'A' with negative offset 3.");
    }

    @Test
    void testZeroOffsetOnLowercaseCharacter() {
        char result = Main.caesarChiffre('k', 0);
        assertEquals('k', result, "Character 'k' should remain unchanged with offset 0.");
    }

    @Test
    void testZeroOffsetOnUppercaseCharacter() {
        char result = Main.caesarChiffre('K', 0);
        assertEquals('K', result, "Character 'K' should remain unchanged with offset 0.");
    }

    @Test
    void testLowercaseToUppercase() {
        char result = Main.switchCase('a');
        assertEquals('A', result, "Lowercase character 'a' should be switched to uppercase 'A'.");
    }

    @Test
    void testUppercaseToLowercase() {
        char result = Main.switchCase('A');
        assertEquals('a', result, "Uppercase character 'A' should be switched to lowercase 'a'.");
    }

    @Test
    void testNonAlphabeticCharacterForSwitchCase() {
        char result = Main.switchCase('1');
        assertEquals(0, result, "Non-alphabetic character '1' should return 0.");
    }

    @Test
    void testEmptyOutputForInvalidCharacter() {
        char result = Main.switchCase('@');
        assertEquals(0, result, "Invalid character '@' should return 0.");
    }

    @Test
    void testPrimeNumber() {
        boolean result = Main.isPrime(7);
        assertEquals(true, result, "Failed to identify 7 as a prime number.");
    }

    @Test
    void testNonPrimeNumber() {
        boolean result = Main.isPrime(10);
        assertEquals(false, result, "Failed to identify 10 as a non-prime number.");
    }

    @Test
    void testOneIsNotPrime() {
        boolean result = Main.isPrime(1);
        assertEquals(false, result, "Failed to identify 1 as a non-prime number.");
    }

    @Test
    void testZeroIsNotPrime() {
        boolean result = Main.isPrime(0);
        assertEquals(false, result, "Failed to identify 0 as a non-prime number.");
    }

    @Test
    void testNegativeNumberIsNotPrime() {
        boolean result = Main.isPrime(-3);
        assertEquals(false, result, "Failed to identify -3 as a non-prime number.");
    }

    @Test
    void testCalculateSeriesLengthOne() {
        int result = Main.calculateSeries(1);
        assertEquals(1, result, "Failed to correctly compute calculateSeries for length 1.");
    }

    @Test
    void testCalculateSeriesMultiplicationLogic() {
        int result = Main.calculateSeries(5);
        assertEquals(24, result, "Failed to correctly compute calculateSeries for length 5 (factorial logic).");
    }

    @Test
    void testCalculateSeriesLengthZero() {
        int result = Main.calculateSeries(0);
        assertEquals(1, result, "Failed to correctly compute calculateSeries for length 0 (boundary case).");
    }

    @Test
    void testCalculateSeriesDoubleLengthOne() {
        double result = Main.calculateSeriesDouble(1);
        assertEquals(1.0, result, "Failed to correctly compute calculateSeriesDouble for length 1.");
    }

    @Test
    void testCalculateSeriesDoubleLengthZero() {
        double result = Main.calculateSeriesDouble(0);
        assertEquals(1.0, result, "Failed to correctly compute calculateSeriesDouble for length 0 (boundary case).");
    }

    @Test
    void testCalculateSeriesDoubleBasicMultiplication() {
        double result = Main.calculateSeriesDouble(5);
        assertEquals(24.0, result, "Failed to correctly compute calculateSeriesDouble for length 5 (factorial logic).");
    }

    @Test
    void testCalculateSeriesDoubleLargeInput() {
        double result = Main.calculateSeriesDouble(10);
        assertEquals(362880.0, result, "Failed to correctly compute calculateSeriesDouble for large input 10.");
    }

    @Test
    void testCalculateSeriesDoubleNegativeInput() {
        double result = Main.calculateSeriesDouble(-5);
        assertEquals(1.0, result, "Negative input should return 1 as per boundary condition for calculateSeriesDouble.");
    }
}