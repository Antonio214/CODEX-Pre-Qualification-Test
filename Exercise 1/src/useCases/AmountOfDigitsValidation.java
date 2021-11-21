package useCases;

import constants.Messages;
import interfaces.iValidationRule;

public class AmountOfDigitsValidation implements iValidationRule {
    final Integer CNPJ_AMOUNT_OF_DIGITS = 14;

    @Override
    public String getErrorMessage() {
        return Messages.INVALID_AMOUNT_DIGIT;
    }

    @Override
    public boolean isBrokenBy(CNPJModel cnpj) {
        return cnpj.getAmountOfDigits() != CNPJ_AMOUNT_OF_DIGITS;
    }

}
