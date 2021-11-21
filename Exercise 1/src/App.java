import modules.CNPJValidator;
import useCases.CNPJModel;

public class App {
    public static void main(String[] args) throws Exception {
        CNPJModel cnpjModel = new CNPJModel("43517047000130");
        CNPJValidator validator = new CNPJValidator();

        System.out.println(validator.check(cnpjModel));
    }
}
