import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import modules.CNPJValidator;

public class TestCNPJValidator {
    String validCNPJ = "43517047000130";
    CNPJValidator validator = new CNPJValidator();

    @Test
    public void shouldInformValidNumberCNPJ() {
        System.out.println("This should inform that a number format CNPJ is valid!");
        Assertions.assertEquals(validator.check(validCNPJ), "CNPJ informado é valido",
                "App is not recognizing a valid CPNJ as valid");
    }
}
