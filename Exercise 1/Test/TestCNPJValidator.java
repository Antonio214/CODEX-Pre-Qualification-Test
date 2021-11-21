import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import Models.CNPJModel;
import constants.Messages;
import modules.CNPJValidator;

public class TestCNPJValidator {
    String[] validCNPJs = { "43517047000130", "82867857000178", "09918723000149", "32601289000190", "20499660000176" };
    String[] validMaskCNPJs = { "43.517.047/0001-30", "82.867.857/0001-78", "09.918.723/0001-49", "32.601.289/0001-90",
            "20.499.660/0001-76" };
    String[] invalidCNPJs = { "11111111111111", "22222222222222", "33333333333333", "44444444444444",
            "55555555555555" };
    String[] invalidMaskCNPJs = { "11.111.111/1111-11", "22.222.222/2222-22", "33.333.333/3333-33",
            "44.444.444/4444-44", "55.555.555/5555-55" };
    String smallCNPJ = "1234";
    String bigCNPJ = "1234567891011121314";
    String[] invalidMask = { "43..517.047/0001-30", "A43.517.047/0001-30", "43.517.047/0001-30A" };
    CNPJValidator validator = new CNPJValidator();

    @Test
    public void shouldInformValidNumberCNPJ() {
        System.out.println("This should inform that a number format CNPJ is valid!");

        for (String validCNPJ : validCNPJs) {
            CNPJModel toValidate = new CNPJModel(validCNPJ);
            Assertions.assertEquals(Messages.VALID_CNPJ, validator.check(toValidate),
                    "App is not recognizing a valid CPNJ as valid");
        }
    }

    @Test
    public void shouldInformNotValidNumberCNPJ() {
        System.out.println("This should inform that a number format CNPJ is not valid!");

        for (String invalidCNPJ : invalidCNPJs) {
            CNPJModel toValidate = new CNPJModel(invalidCNPJ);
            Assertions.assertEquals(Messages.INVALID_DIGIT, validator.check(toValidate),
                    "App is not recognizing a CNPJ as invalid");
        }
    }

    @Test
    public void shouldInformInvalidQuantityOfNumbers() {
        System.out.println("This should inform that a CNPJ informed doesn't have 14 digits");
        CNPJModel toValidate = new CNPJModel(smallCNPJ);
        Assertions.assertEquals(Messages.INVALID_AMOUNT_DIGIT, validator.check(toValidate),
                "App is not recognizing the size of CNPJ for less digits");
        toValidate = new CNPJModel(bigCNPJ);
        Assertions.assertEquals(Messages.INVALID_AMOUNT_DIGIT, validator.check(toValidate),
                "App is not recognizing the size of CNPJ for more digits");
    }

    @Test
    public void shouldInformInvalidMask() {
        System.out.println("This should inform that a CNPJ has an invalid mask");

        for (String invalidMaskCNPJ : invalidMask) {
            CNPJModel toValidate = new CNPJModel(invalidMaskCNPJ);
            Assertions.assertEquals(Messages.INVALID_MASK, validator.check(toValidate),
                    "App is not recognizing an invalid Mask");
        }
    }

    @Test
    public void shouldInformValidMaskCNPJ() {
        System.out.println("This should inform that a Mask format CNPJ is valid!");

        for (String validCNPJ : validMaskCNPJs) {
            CNPJModel toValidate = new CNPJModel(validCNPJ);
            Assertions.assertEquals(Messages.VALID_CNPJ, validator.check(toValidate),
                    "App is not recognizing a valid mask CPNJ as valid");
        }
    }

    @Test
    public void shouldInformNotValidMaskCNPJ() {
        System.out.println("This should inform that a mask format CNPJ is not valid!");

        for (String invalidMaskCNPJ : invalidMaskCNPJs) {
            CNPJModel toValidate = new CNPJModel(invalidMaskCNPJ);
            Assertions.assertEquals(Messages.INVALID_DIGIT, validator.check(toValidate),
                    "App is not recognizing a invalid mask CNPJ as invalid");
        }
    }

}
