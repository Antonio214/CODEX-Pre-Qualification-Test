# To Do for CNPJ validator

## Milestones

- [ X ] Test return "CNPJ informado é valido" when CNPJ is valid and provided in number format
- [ X ] Test return "CNPJ informado não é valido, erro no dígito verificador" when CNPJ is not validated by digit algorithm
- [ x ] Test return "CNPJ informado não possui a quantidade correta de dígitos" when the provided CNPJ doesn't have the correct amount of numbers
- [ x ] Test return "CNPJ não possui máscara válida" when provided CNPJ with an invalid char in the mask
- [ x ] Test return "CNPJ informado é valido" when CNPJ is valid and provided in mask format
- [ x ] Test return "CNPJ informado não é valido, erro no dígito verificador" when CNPJ is not validated by digit algorithm and provided in mask format
- [ x ] Improve code organization with interfaces
- [ ] Add a CLI for the user to interact

## Side Notes:

- I'm proud of the final result here, it seems pretty straight forward to add new validation rules which is the core for this project. So code seems to resolve the current problem and can easily scale around rules if needed. Behold TDD at its best ;).
- I could create an interface to CNPJ model, however since the CNPJ is core to the problem it didn't seem a needed refactoring
- Mask format correspond to "XXX.XXX.XXX/YYYY-ZZ"
- Number format correspond to XXXXXXXXXYYYYZZ

## Future Ideas:

- [ ] add a GUI for the user to interact
