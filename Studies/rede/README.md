## 📦 **Pacote**: `aulas.rede.jogo`

---

### 📄 **ClienteJogoDaVelha.java**

✅ **Função principal:**
🚀 Inicia o jogo criando um objeto `JogoDaVelha`.

✅ **O que faz no código:**

```java
public static void main(String[] args) {
    JogoDaVelha jogo = new JogoDaVelha();
}
```

✅ **O que observar:**

* Não tem lógica de jogo.
* Só serve para disparar o jogo.

---

### 🎮 **JogoDaVelha.java**

✅ **Função principal:**
🕹️ Contém toda a lógica do jogo da velha.

---

#### 🏗️ **Estrutura**

* 📋 `tabuleiro[][]` → matriz 3x3 do jogo.
* 🏁 `fim` → controla fim de jogo.
* ❌ / ⭕ `marcador` → símbolo do jogador.
* 🔄 `suaVez` → indica vez de jogar.
* 📡 `Socket`, `ObjectInputStream`, `ObjectOutputStream` → pré-configurados, mas **ainda não usados de verdade**.

---

#### ⚙️ **Métodos principais**

* 🔌 **conectar()** → simula receber marcador e vez do servidor.
* ♻️ **iniciar()** → prepara tabuleiro vazio.
* 🎲 **jogar()** → loop principal do jogo.
* 🏆 **checarTermino()** → verifica vitória, derrota, empate.
* 🔁 **checarReinicio()** → pergunta se quer jogar novamente.
* 🧐 **ganhador()** → checa linhas, colunas, diagonais.
* ✍️ **marcar()** → marca posições no tabuleiro.
* 🖼️ **toString()** → desenha tabuleiro no console.

---

#### ⚠️ **Atenção para a aula**

* A rede **está simulada** → nada é realmente enviado/recebido.
* Na próxima aula, vão conectar os jogadores de verdade.

---

### 💻 **O que fazer antes da aula**

✅ Rodar o programa:

```bash
javac ClienteJogoDaVelha.java JogoDaVelha.java
java aulas.rede.jogo.ClienteJogoDaVelha
```

✅ Testar:

* Jogadas válidas/ inválidas.
* Condições de vitória/empate.
* Reinício de jogo.

---

### 🚀 **Resumo final**

| Arquivo            | Função                              |
| ------------------ | ----------------------------------- |
| ClienteJogoDaVelha | 🚀 Inicia o jogo (`JogoDaVelha`)    |
| JogoDaVelha        | 🕹️ Lógica do jogo + simulação rede |
