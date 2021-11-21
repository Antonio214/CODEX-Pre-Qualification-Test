import modules.CNPJModel;
import modules.CNPJValidator;

public class App {
    public static void main(String[] args) throws Exception {
        CNPJModel cnpjModel = new CNPJModel("A43.517.047/0001-30");
        CNPJValidator validator = new CNPJValidator();

        validator.check(cnpjModel);
    }
}
