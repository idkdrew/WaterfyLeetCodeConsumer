# 🖥️ Teste Técnico (Interface Gráfica)

Este repositório corresponde ao **consumer** da API, ou seja, a **interface gráfica** que consome a API disponível no seguinte repositório:  
🔗 **[Link da API](https://github.com/idkdrew/WaterfyLeetCodeAPI)**

A interface gráfica foi desenvolvida utilizando **Thymeleaf**, uma dependência do **Spring**, seguindo as diretrizes do teste para utilizar as ferramentas do Spring no desenvolvimento do frontend.

Para a estilização da tela, foi utilizado o **Bootstrap** através do arquivo **min.css**.

---

## 🚀 Como executar o projeto (HOW-TO)

### **1️⃣ Inicializar a API**
Antes de rodar o consumer, é necessário **baixar e iniciar a API** seguindo as instruções disponíveis no README do repositório da API (Disponível acima).

### **2️⃣ Executar o consumer**
Após iniciar a API, o consumer pode ser **executado e acessado** através do link:  
🔗 **[localhost:4001](http://localhost:4001)**

A aplicação foi configurada para rodar na porta **4001**, diferente da porta padrão do Tomcat (**8080**).  
Caso deseje alterar essa porta, basta modificar o valor no arquivo **`application.properties`** localizado em:  
📂 `src/main/resources/application.properties`

### **3️⃣ Funcionalidades disponíveis**
Ao executar o projeto e acessar no navegador através da URL **[localhost:4001](http://localhost:4001)**, você terá acesso a uma tela com as seguintes funcionalidades:

✔️ Exibição de tarefas  
✔️ Edição de tarefas  
✔️ Adição de novas tarefas  
✔️ Exclusão de tarefas  
✔️ Tratamento de exceções lançadas pela API  
✔️ Página de erro personalizada para **404 - Página não encontrada**

⚠ **Lembre-se**:  
É necessário **iniciar a API primeiro** e **somente depois** rodar o consumer.

---

Muito obrigado e espero que gostem! 
