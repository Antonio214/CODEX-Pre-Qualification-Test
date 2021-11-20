import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import constants.Messages;
import modules.CNPJValidator;

public class TestCNPJValidator {
    String validCNPJ = "43517047000130";
    String invalidCNPJ = "11111111111111";
    CNPJValidator validator = new CNPJValidator();

    @Test
    public void shouldInformValidNumberCNPJ() {
        System.out.println("This should inform that a number format CNPJ is valid!");
        Assertions.assertEquals(validator.check(validCNPJ), Messages.VALIDCNPJ,
                "App is not recognizing a valid CPNJ as valid");
    }

    @Test
    public void shouldInformNotValidNumberCNPJ() {
        System.out.println("This should inform that a number format CNPJ is not valid!");
        Assertions.assertEquals(validator.check(invalidCNPJ), "CNPJ informado não é valido, erro no dígito verificador",
                "App is not recognizing a CNPJ as invalid");
    }
}
