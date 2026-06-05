//package domain;

/**
 * Utility class for computational exercises.
 *
 * <p>This implementation converts a six-digit decimal number
 * into its binary, octal, and hexadecimal representations.</p>
 */
public class Exercise {

    /**
     * Converts a six-digit decimal number into binary, octal, and hexadecimal forms.
     *
     * @param number a six-digit decimal number in the range 100000..999999
     * @return a comma-separated string with binary, octal, and hexadecimal values
     * @throws IllegalArgumentException if the input is not a six-digit number
     */
    public static String Calculate(int number) {
        return convertNumberBases(number);
    }

    private static String convertNumberBases(int number) {
        if (number < 100000 || number > 999999) {
            throw new IllegalArgumentException("Input must be a six-digit number.");
        }
        return toBinary(number) + ", " + toOctal(number) + ", " + toHex(number);
    }

    private static String toBinary(int number) {
        return Integer.toBinaryString(number);
    }

    private static String toOctal(int number) {
        return Integer.toOctalString(number);
    }

    private static String toHex(int number) {
        return Integer.toHexString(number).toUpperCase();
    }
}
