import java.io.BufferedReader;
import java.io.InputStreamReader;

import Models.CNPJModel;
import modules.CNPJValidator;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Insira o CNPJ para ser validado: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String cnpjFromInput = reader.readLine();

        CNPJModel cnpjModel = new CNPJModel(cnpjFromInput);
        CNPJValidator validator = new CNPJValidator();

        System.out.println(validator.check(cnpjModel));
    }
}