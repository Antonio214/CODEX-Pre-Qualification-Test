package modules;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CNPJModel {
    private String cnpjString;
    private Integer[] cnpjDigits;
    private String[] cnpjChars;
    private boolean onlyDigits;
    private int amountOfDigits;

    public CNPJModel(String cnpjInStringFormat) {
        this.cnpjString = cnpjInStringFormat;
        this.cnpjChars = this.cnpjString.split("");
        this.onlyDigits = this.verifyOnlyDigits(this.cnpjString);
        this.amountOfDigits = 0;
        this.cnpjDigits = this.convertStringToDigits(this.cnpjChars);
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
        Integer[] digits = new Integer[14];
        Integer nonDigitsCounter = 0;

        for (int i = 0; i < cnpjCharsToConvert.length; i++) {
            try {
                digits[i - nonDigitsCounter] = Integer.parseInt(cnpjCharsToConvert[i]);
                this.amountOfDigits++;
            } catch (NumberFormatException e) {
                nonDigitsCounter++;
            } catch (ArrayIndexOutOfBoundsException e) {
                // this means cnpj has more digits than it should
                this.amountOfDigits = 15;
                return digits;
            } catch (Exception e) {
                System.err.println(e);
            }
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
        return this.amountOfDigits;
    }

    public boolean hasOnlyDigits() {
        return this.onlyDigits;
    }
}
