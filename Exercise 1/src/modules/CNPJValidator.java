package modules;

import Models.CNPJModel;
import constants.Messages;
import interfaces.iValidationRule;
import useCases.AmountOfDigitsValidation;
import useCases.DigitValidation;
import useCases.MaskValidation;

public class CNPJValidator {

    public String check(CNPJModel cnpjToValidate) {
        iValidationRule[] rules = { new MaskValidation(), new AmountOfDigitsValidation(), new DigitValidation() };

        for (iValidationRule rule : rules) {
            if (rule.isBrokenBy(cnpjToValidate)) {
                return rule.getErrorMessage();
            }
        }

        return Messages.VALID_CNPJ;
    }

}
