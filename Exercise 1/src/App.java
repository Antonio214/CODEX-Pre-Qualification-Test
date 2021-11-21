import modules.CNPJModel;
import modules.CNPJValidator;

public class App {
    public static void main(String[] args) throws Exception {
        CNPJModel cnpjModel = new CNPJModel("82.867.857/0001-78");
        CNPJValidator validator = new CNPJValidator();

        System.out.println(validator.check(cnpjModel));
    }
}
