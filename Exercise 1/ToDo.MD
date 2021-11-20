# To Do for CNPJ validator

- [ ] Test return "CNPJ informado é valido" when CNPJ is valid and provided in number format
- [ ] Test return "CNPJ informado não é valido, erro no dígito verificador" when CNPJ is not validated by digit algorithm
- [ ] Test return "CNPJ informado não possui a quantidade correta de dígitos" when the provided CNPJ doesn't have the correct amount of numbers
- [ ] Test return "CNPJ possui digito invalido" when provided CNPJ with an invalid char in the mask
- [ ] Test return "CNPJ informado é valido" when CNPJ is valid and provided in mask format

## Side Notes:

- Mask format correspond to "XXX.XXX.XXX/YYYY-ZZ"
- Number format correspond to XXXXXXXXXYYYYZZ
