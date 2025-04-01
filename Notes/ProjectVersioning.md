# Aula - Configuração de Projeto e Controle de Versão

## Beanstalk App
Clone o repositório para o seu ambiente local:
```bash
git clone https://gabiulisses.git.beanstalkapp.com/arqdeoos1a2025.git ARQDEOOS1A2025
```

---

## NetBeans
### Criando o projeto:
1. Escolha o tipo de projeto:
   - `Java with Ant`
   - Selecione `Java Application`.

### Atalhos úteis no NetBeans:
- **Alt + Scroll**: Para navegar rapidamente.  
- **Ctrl + Space**: Para auto-completar.  
- **Shift + F6**: Para executar o programa.

---

## Comandos Git - Passo a Passo
### 1. Inicializar o repositório:
```bash
git init
```

### 2. Verificar repositórios remotos:
```bash
git remote -v
```

### 3. Adicionar um repositório remoto:
Substitua `<URL-do-repositório>` pelo link correto do repositório remoto:
```bash
git remote add origin <URL-do-repositório>
```

### 4. Adicionar arquivos ao índice:
- Adicione todos os arquivos:
```bash
git add .
```
- Adicione arquivos específicos:
```bash
git add <nome-do-arquivo>
```

### 5. Criar um commit:
- Registre as alterações:
```bash
git commit -m "Descrição do commit"
```

### 6. Enviar alterações para o repositório remoto:
- Substitua `<branch>` pelo nome da branch, como `main` ou `master`:
```bash
git push -u origin <branch>
```

### 7. Atualizar o repositório local com mudanças remotas:
```bash
git pull origin <branch>
```

### 8. Verificar o status do repositório:
```bash
git status
```

### 9. Verificar histórico de commits:
```bash
git log
```

---

## Observação
- Certifique-se de ajustar `<URL-do-repositório>` e `<branch>` de acordo com o seu projeto.
- Crie um arquivo `.gitignore` para excluir arquivos ou pastas que não devem ser versionados.

---
