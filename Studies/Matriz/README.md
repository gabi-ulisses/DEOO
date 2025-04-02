# Matriz Java

## Descrição
Este projeto implementa uma classe **Matriz** em Java, que representa uma matriz quadrada de tamanho **2x2** ou **3x3**. A classe permite a execução de diversas operações matemáticas sobre a matriz, como:

- Definição e manipulação de elementos
- Soma, subtração, multiplicação e divisão
- Cálculo do determinante
- Busca do maior e menor elemento

O projeto está estruturado com um pacote **model** para a classe Matriz e um pacote **view** para a execução no programa principal.

## Estrutura do Projeto

```
com/ibag/matriz/
├── model/
│   └── Matriz.java
└── view/
    └── Main.java
```

## Como Executar

### 1. Clonar o Repositório
```sh
git clone <URL_DO_REPOSITORIO>
cd <NOME_DO_DIRETORIO>
```

### 2. Compilar o Projeto
```sh
javac -d bin com/ibag/matriz/model/Matriz.java com/ibag/matriz/view/Main.java
```

### 3. Executar o Programa
```sh
java -cp bin com.ibag.matriz.view.Main
```

## Exemplo de Saída
```
Matriz inicial 2x2:
[ 1.0 1.0 ]
[ 1.0 1.0 ]

Após alterar um elemento (posição [0][1] para 5.0):
[ 1.0 5.0 ]
[ 1.0 1.0 ]

Após adicionar 2.0 a todos os elementos:
[ 3.0 7.0 ]
[ 3.0 3.0 ]

Determinante da matriz: -12.0
```

## Autora
- **Gabrielle Ulisses**