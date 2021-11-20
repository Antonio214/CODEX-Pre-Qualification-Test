package modules;

import constants.Messages;

public class CNPJValidator {
    public String check(String cnpjToValidate) {
        Integer[] cnpjDigits = convertStringToDigits(cnpjToValidate);

        if (validateDigit(cnpjDigits)) {
            return Messages.VALID_CNPJ;
        } else {
            return Messages.INVALID_DIGIT;
        }
    }

    // Uses Receitas Federal's logic to validate digits
    private boolean validateDigit(Integer[] cnpjDigits) {
        int firstDigitVerifier, secondDigitVerifier;

        // validate first Digit
        firstDigitVerifier = 5 * cnpjDigits[0] + 4 * cnpjDigits[1] + 3 * cnpjDigits[2] + 2 * cnpjDigits[3];
        firstDigitVerifier += 9 * cnpjDigits[4] + 8 * cnpjDigits[5] + 7 * cnpjDigits[6] + 6 * cnpjDigits[7];
        firstDigitVerifier += 5 * cnpjDigits[8] + 4 * cnpjDigits[9] + 3 * cnpjDigits[10] + 2 * cnpjDigits[11];
        firstDigitVerifier = 11 - firstDigitVerifier % 11;
        if (firstDigitVerifier >= 10) {
            firstDigitVerifier = 0;
        }

        // validate second Digit
        secondDigitVerifier = 6 * cnpjDigits[0] + 5 * cnpjDigits[1] + 4 * cnpjDigits[2] + 3 * cnpjDigits[3];
        secondDigitVerifier += 2 * cnpjDigits[4] + 9 * cnpjDigits[5] + 8 * cnpjDigits[6] + 7 * cnpjDigits[7];
        secondDigitVerifier += 6 * cnpjDigits[8] + 5 * cnpjDigits[9] + 4 * cnpjDigits[10] + 3 * cnpjDigits[11];
        secondDigitVerifier += 2 * cnpjDigits[12];
        secondDigitVerifier = 11 - secondDigitVerifier % 11;
        if (secondDigitVerifier >= 10) {
            secondDigitVerifier = 0;
        }

        // check if both digits correspond to expected
        return firstDigitVerifier == cnpjDigits[12] && secondDigitVerifier == cnpjDigits[13];
    }

    // Transform cpnj from string into a array of integers
    private Integer[] convertStringToDigits(String cnpjToConvert) {
        Integer[] digits = new Integer[14];

        String[] cnpjChars = cnpjToConvert.split("");

        for (int i = 0; i < cnpjChars.length; i++) {
            digits[i] = Integer.parseInt(cnpjChars[i]);
        }

        return digits;
    }
}