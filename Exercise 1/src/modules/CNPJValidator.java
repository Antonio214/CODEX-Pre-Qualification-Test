package modules;

import constants.Messages;
import interfaces.iValidationRule;
import useCases.AmountOfDigitsValidation;
import useCases.CNPJModel;
import useCases.DigitValidation;
import useCases.MaskValidation;

public class CNPJValidator {

    public String check(CNPJModel cnpjToValidate) {
        iValidationRule[] rules = { new AmountOfDigitsValidation(), new DigitValidation(), new MaskValidation() };

        for (iValidationRule rule : rules) {
            if (rule.isBrokenBy(cnpjToValidate)) {
                return rule.getErrorMessage();
            }
        }

        return Messages.VALID_CNPJ;
    }

}
