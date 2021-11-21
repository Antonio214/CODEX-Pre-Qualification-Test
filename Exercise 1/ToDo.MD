# To Do for CNPJ validator

## Milestones

- [ X ] Test return "CNPJ informado é valido" when CNPJ is valid and provided in number format
- [ X ] Test return "CNPJ informado não é valido, erro no dígito verificador" when CNPJ is not validated by digit algorithm
- [ x ] Test return "CNPJ informado não possui a quantidade correta de dígitos" when the provided CNPJ doesn't have the correct amount of numbers
- [ ] Test return "CNPJ não possui máscara válida" when provided CNPJ with an invalid char in the mask
- [ ] Test return "CNPJ informado é valido" when CNPJ is valid and provided in mask format
- [ ] Add a CLI for the user to interact

## Side Notes:

- Mask format correspond to "XXX.XXX.XXX/YYYY-ZZ"
- Number format correspond to XXXXXXXXXYYYYZZ

## Future Ideas:

- [ ] add a GUI for the user to interact
