import modules.CNPJModel;
import modules.CNPJValidator;

public class App {
    public static void main(String[] args) throws Exception {
        CNPJModel cnpjModel = new CNPJModel("1234567891011121314");
        CNPJValidator validator = new CNPJValidator();

        validator.check(cnpjModel);
    }
}
