import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import constants.Messages;
import modules.CNPJValidator;

public class TestCNPJValidator {
    String[] validCNPJs = { "43517047000130", "82867857000178", "09918723000149", "32601289000190", "20499660000176" };
    String[] invalidCNPJs = { "11111111111111", "22222222222222", "33333333333333", "44444444444444",
            "55555555555555" };
    String smallCNPJ = "1234";
    String bigCNPJ = "1234567891011121314";
    String invalidMaskCNPJ = "43..517.047/0001-30";
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

    @Test
    public void shouldInformInvalidQuantityOfNumbers() {
        System.out.println("This should inform that a CNPJ informed doesn't have 14 digits");
        Assertions.assertEquals(validator.check(smallCNPJ), Messages.INVALID_AMOUNT_DIGIT,
                "App is not recognizing the size of CNPJ for less digits");
        Assertions.assertEquals(validator.check(bigCNPJ), Messages.INVALID_AMOUNT_DIGIT,
                "App is not recognizing the size of CNPJ for more digits");
    }

    @Test
    public void shouldInformInvalidMask() {
        System.out.println("This should inform that a CNPJ has an invalid mask");
        Assertions.assertEquals(validator.check(invalidMaskCNPJ), Messages.INVALID_MASK,
                "App is not recognizing an invalid Mask");
    }

}
