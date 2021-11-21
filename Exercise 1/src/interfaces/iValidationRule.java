package interfaces;

import modules.CNPJModel;

public interface iValidationRule {
    public String getErrorMessage();

    public boolean isBrokenBy(CNPJModel cnpj);
}
