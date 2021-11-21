package modules;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CNPJModel {
    private String cnpjString;
    private Integer[] cnpjDigits;
    private String[] cnpjChars;
    private boolean onlyDigits;

    public CNPJModel(String cnpjInStringFormat) {
        this.cnpjString = cnpjInStringFormat;
        this.cnpjChars = this.cnpjString.split("");
        this.onlyDigits = this.verifyOnlyDigits(this.cnpjString);
        if (this.onlyDigits) {
            this.cnpjDigits = this.convertStringToDigits(this.cnpjChars);
        }
    }

    // return true if only contains digits, false otherwise
    private boolean verifyOnlyDigits(String candidate) {
        final String nonDigitsRegex = "\\D";

        final Pattern pattern = Pattern.compile(nonDigitsRegex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(candidate);

        if (matcher.find()) {
            return false;
        } else {
            return true;
        }
    }

    // Transform cpnj from string into a array of integers
    private Integer[] convertStringToDigits(String[] cnpjCharsToConvert) {
        Integer[] digits = new Integer[cnpjCharsToConvert.length];

        for (int i = 0; i < cnpjCharsToConvert.length; i++) {
            digits[i] = Integer.parseInt(cnpjCharsToConvert[i]);
        }

        return digits;
    }

    public String getString() {
        return this.cnpjString;
    }

    public Integer[] getDigits() {
        return this.cnpjDigits;
    }

    public Integer getAmountOfDigits() {
        return this.cnpjDigits.length;
    }

    public boolean hasOnlyDigits() {
        return this.onlyDigits;
    }
}
