## **Descrição do Projeto**
O projeto implementa a interação entre threads em um ambiente multithreaded, simulando um produtor que adiciona valores a um buffer e um consumidor que os consome. Ele utiliza técnicas de sincronização para gerenciar o acesso concorrente ao buffer compartilhado.

---

## **Estrutura do Código**
O sistema é dividido em três componentes principais:

1. **Buffer:**
   - Classe que atua como um espaço de armazenamento intermediário entre o produtor e o consumidor.
   - Utiliza métodos sincronizados (`synchronized`, `wait`, `notifyAll`) para garantir acesso seguro por múltiplas threads.
   - Mantém o estado interno (ocupado ou não) e controla a produção e o consumo de valores.

2. **Produtor:**
   - Classe responsável por produzir valores incrementais e armazená-los no buffer.
   - Implementa a interface `Runnable` para ser executada em uma thread separada.
   - Utiliza o método `set()` do buffer para inserir valores, respeitando o estado do buffer.

3. **Consumidor:**
   - Classe responsável por consumir os valores armazenados no buffer.
   - Também implementa a interface `Runnable` para execução em uma thread separada.
   - Utiliza o método `get()` do buffer para retirar valores, respeitando o estado do buffer.

4. **Classe Principal (`Main`):**
   - Configura as threads do produtor e consumidor e gerencia sua execução usando `ExecutorService`.
   - Demonstra a interação e sincronização entre as threads e o buffer.

---

## **Fluxo de Execução**
1. **Inicialização:**
   - Um `Buffer` é criado e compartilhado entre o produtor e consumidor.
   - As threads do produtor e consumidor são configuradas com delays diferentes para simular velocidades distintas de produção e consumo.

2. **Execução Paralela:**
   - O `ExecutorService` inicia as threads para executar as tarefas do produtor e do consumidor simultaneamente.
   - O produtor utiliza o método `set()` do buffer para produzir valores enquanto o consumidor utiliza o método `get()` para consumi-los.

3. **Sincronização:**
   - Enquanto o buffer estiver ocupado, o produtor aguarda (`wait`).
   - Enquanto o buffer estiver vazio, o consumidor aguarda (`wait`).
   - Após cada operação, as threads aguardando são notificadas (`notifyAll`).

4. **Finalização:**
   - O `ExecutorService` é encerrado após o término das tarefas.
   - O estado final do buffer é exibido para verificar os resultados.

---

## **Exemplo de Saída Esperada**
```plaintext
Tentou ler, mas o buffer está vazio.
10 adicionado.
> 10
Tentou escrever, mas o buffer está ocupado.
20 adicionado.
> 20
Tentou ler, mas o buffer está vazio.
30 adicionado.
> 30
...
```

---

## **Conceitos Chave**

### **Produtor-Consumidor:**
- Padrão clássico de sincronização onde um produtor adiciona valores a um recurso compartilhado e um consumidor os retira. Esse padrão é comum em sistemas que precisam gerenciar filas ou buffers.

### **Sincronização com `wait` e `notifyAll`:**
- As threads produtor e consumidor utilizam `wait` para entrar em espera quando o buffer está ocupado ou vazio, e `notifyAll` para acordar threads esperando por acesso.

### **ExecutorService:**
- Gerencia a execução de múltiplas threads, garantindo reutilização eficiente de recursos.

---

## **Configuração do Código**
Para executar o projeto, certifique-se de que:
1. **Classes do sistema (Buffer, Produtor, Consumidor):**
   - Estão implementadas conforme descrito.
2. **Thread Principal (`Main`):**
   - Cria as instâncias e configura os tempos de produção e consumo conforme necessário.

---

## **Melhorias Possíveis**
- Implementar controle de tempo limite para `wait()` em caso de espera excessiva.
- Usar estruturas de dados concorrentes (`BlockingQueue` do pacote `java.util.concurrent`) para simplificar o gerenciamento do buffer.
- Adicionar logs mais detalhados para depuração e monitoramento da execução.