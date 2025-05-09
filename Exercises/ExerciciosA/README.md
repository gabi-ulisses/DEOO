**Desenvolvido por: Gabrielle Ulisses**

## 📚 Exercícios Java – Organização MVC Simples

Este projeto contém a resolução de vários exercícios de Java organizados no padrão **MVC básico**:

* 📁 `model/`: contém as **classes de lógica**.
* 📁 `view/`: contém os **métodos `main` de execução**, nomeados como `ExercicioX.java`.

---

## 🗂 Lista de Exercícios

| Nº Original  | Descrição                                                 | Classe `model/`                | Classe `view/`            |
| ------------ | --------------------------------------------------------- | ------------------------------ | ------------------------- |
| 2            | Lançar exceção se o número for ímpar                      | `VerificadorPares`               | `Exercicio2.java`         |
| 6 (lista)    | Lançar exceção se houver números duplicados               | `VerificadorDuplicados`          | `Exercicio6Excecao.java`    |
| 7            | Lançar exceção se string não tiver vogais                 | `VerificadorVogais`            | `Exercicio7Excecao.java`         |
| 4            | Verificar padrão de letra maiúscula seguida de minúsculas | `SequenciaMaiusculaMinuscula`  | `Exercicio4.java`         |
| 26           | Verificar se string é um código hexadecimal válido        | `VerificadorHexadecimal`         | `Exercicio26.java`        |
| 29           | Verificar se string é uma expressão matemática            | `VerificadorExpressaoMatematica` | `Exercicio29.java`        |
| 6 (arquivos) | Comparar dois arquivos lexicograficamente                 | `ComparadorLexico`           | `Exercicio6Arquivo.java` |
| 14           | Ler arquivo linha a linha em array                        | `LeitorArquivo`          | `Exercicio14.java`        |
| 18           | Encontrar palavra mais longa de um arquivo                | `EncontrarPalavraMaisLonga`    | `Exercicio18.java`        |
| 7 (threads)  | Conta bancária com saques e depósitos concorrentes        | `ContaBancaria`                | `Exercicio7Threads.java`  |

---

## 📁 Estrutura das Pastas

```
src/
│
├── model/
│   ├── VerificadorPar.java
│   ├── VerificadorDuplicados.java
│   ├── VerificadorVogais.java
│   ├── SequenciaMaiusculaMinuscula.java
│   ├── VerificadorHexadecimal.java
│   ├── VerificadorExpressaoMatematica.java
│   ├── ComparadorArquivos.java
│   ├── LeitorArquivo.java
│   ├── EncontrarPalavraMaisLonga.java
│   └── ContaBancaria.java
│
├── view/
│   ├── Exercicio2.java
│   ├── Exercicio6Excecao.java
│   ├── Exercicio7Excecao.java
│   ├── Exercicio4.java
│   ├── Exercicio26.java
│   ├── Exercicio29.java
│   ├── Exercicio6Arquivo.java
│   ├── Exercicio14.java
│   ├── Exercicio18.java
│   └── Exercicio7Threads.java
```

---

## 💡 Observações

* Os arquivos `.txt` e `.xml` usados nos exercícios devem estar em uma pasta separada (ex: `./arquivos/`) fora da pasta `src/`.