import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import constants.Messages;
import modules.CNPJValidator;

public class TestCNPJValidator {
    String[] validCNPJs = { "43517047000130", "82867857000178", "09918723000149", "32601289000190", "20499660000176" };
    String[] invalidCNPJs = { "11111111111111", "22222222222222", "33333333333333", "44444444444444",
            "55555555555555" };
    CNPJValidator validator = new CNPJValidator();

    @Test
    public void shouldInformValidNumberCNPJ() {
        System.out.println("This should inform that a number format CNPJ is valid!");

        for (String validCNPJ : validCNPJs) {
            Assertions.assertEquals(validator.check(validCNPJ), Messages.VALID_CNPJ,
                    "App is not recognizing a valid CPNJ as valid");
        }
    }

    @Test
    public void shouldInformNotValidNumberCNPJ() {
        System.out.println("This should inform that a number format CNPJ is not valid!");

        for (String invalidCNPJ : invalidCNPJs) {
            Assertions.assertEquals(validator.check(invalidCNPJ), Messages.INVALID_DIGIT,
                    "App is not recognizing a CNPJ as invalid");
        }
    }
}
