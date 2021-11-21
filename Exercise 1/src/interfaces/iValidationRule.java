package interfaces;

import useCases.CNPJModel;

public interface iValidationRule {
    public String getErrorMessage();

    public boolean isBrokenBy(CNPJModel cnpj);
}
