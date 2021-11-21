package interfaces;

import Models.CNPJModel;

public interface iValidationRule {
    public String getErrorMessage();

    public boolean isBrokenBy(CNPJModel cnpj);
}
