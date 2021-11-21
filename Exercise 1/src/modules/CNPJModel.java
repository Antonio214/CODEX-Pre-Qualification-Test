package modules;

public class CNPJModel {
    private String cnpjString;
    private Integer[] cnpjDigits;
    private String[] cnpjChars;
    Integer nonDigitsCounter;
    private int amountOfDigits;

    public CNPJModel(String cnpjInStringFormat) {
        this.amountOfDigits = 0;
        this.nonDigitsCounter = 0;
        this.cnpjString = cnpjInStringFormat;
        this.cnpjChars = this.cnpjString.split("");
        this.cnpjDigits = new Integer[14];
        this.generateDigitsFromChars();
    }

    // Generate cnpj digits from chars
    private void generateDigitsFromChars() {
        Integer newDigit;

        for (int i = 0; i < this.cnpjChars.length; i++) {
            try {
                newDigit = Integer.parseInt(this.cnpjChars[i]);
                this.saveDigit(newDigit);
            } catch (NumberFormatException e) {
                this.nonDigitsCounter++;
            } catch (Exception e) {
                System.err.println(e);
            }
        }
    }

    private void saveDigit(Integer digit) {
        if (this.amountOfDigits < 14) {
            this.cnpjDigits[this.amountOfDigits] = digit;
        }
        amountOfDigits++;
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
        return this.nonDigitsCounter == 0;
    }
}
