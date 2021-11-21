package useCases;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import Models.CNPJModel;
import constants.Messages;
import interfaces.iValidationRule;

public class MaskValidation implements iValidationRule {

    @Override
    public String getErrorMessage() {
        return Messages.INVALID_MASK;
    }

    // TODO: improve this part
    @Override
    public boolean isBrokenBy(CNPJModel cnpj) {
        if (cnpj.hasOnlyDigits()) {
            return false;
        } else if (maskIsInvalid(cnpj.getString())) {
            return true;
        } else {
            return false;
        }
    }

    // return true if doesn't match pattern XX.XXX.XXX/YYYY-ZZ
    private boolean maskIsInvalid(String maskToValidate) {
        final String cnpjRegex = "\\A\\d{2}\\.\\d{3}\\.\\d{3}\\/\\d{4}-\\d{2}$";

        final Pattern pattern = Pattern.compile(cnpjRegex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(maskToValidate);

        if (matcher.find()) {
            return false;
        } else {
            return true;
        }
    }

}
