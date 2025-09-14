# 🚦 Projeto Semáforo em Java

Este projeto é uma simulação de um **semáforo** implementado em **Java 21**.  
A ideia é demonstrar conceitos de **orientação a objetos** e aplicar o **padrão de projeto State**, que organiza os diferentes estados do semáforo em classes independentes.

---

## 🚀 Tecnologias Utilizadas

* **Java 21**
* **Padrão de Projeto State**
* **Programação Orientada a Objetos**
* **Multithreading**
* **Tratamento de Exceções**

---

## 📂 Estrutura do Projeto

```
video013/
├── SemaforoApp.java        # Classe principal
├── Semaforo.java           # Contexto que controla o estado atual
├── EstadoSemaforo.java     # Interface que define o comportamento dos estados
├── Verde.java              # Estado "verde"
├── Amarelo.java            # Estado "amarelo"
└── Vermelho.java           # Estado "vermelho"
```

---

## 🛠 Princípios Aplicados

### **Clean Code**

* Classes e métodos com responsabilidades bem definidas
* Nomenclatura clara e descritiva
* Código organizado e de fácil manutenção

### **SOLID**

* **S**ingle Responsibility: cada estado tem uma única responsabilidade
* **O**pen/Closed: fácil adicionar novos estados sem modificar código existente
* **L**iskov Substitution: estados seguem contrato definido pela interface
* **D**ependency Inversion: dependência de abstrações (interface) não de implementações

### **Design Patterns**

* **State Pattern**: cada estado do semáforo é representado por uma classe específica
* **Interface Pattern**: contrato comum para todos os estados do semáforo

---

## ⚙️ Como Funciona

1. O programa inicia com o estado **Verde**
2. A cada ciclo, o estado atual é executado:
   - **Verde** → imprime `"VERDE – siga!"` e espera **3s**
   - **Amarelo** → imprime `"AMARELO – atenção!"` e espera **1.5s**
   - **Vermelho** → imprime `"VERMELHO – pare!"` e espera **5s**
3. O semáforo muda para o próximo estado automaticamente
4. O ciclo se repete infinitamente: **Verde → Amarelo → Vermelho → Verde...**

---

## 💻 Como Executar

1. **Compile os arquivos**:

```bash
javac video013/*.java
```

2. **Execute o programa**:

```bash
java video013.SemaforoApp
```

---

## 📌 Funcionalidades Principais

* Simulação realista de semáforo com tempos configurados
* Transição automática entre estados
* Tratamento adequado de exceções de multithreading
* Design extensível para adição de novos estados

---

## 🧩 Próximos Passos (Melhorias Futuras)

* Criar uma versão com **`enum`** e **Strategy Pattern** para tempos configuráveis
* Implementar **Observer Pattern** para notificar "pedestres" ou "carros"
* Usar **ExecutorService** em vez de `Thread.sleep()` para maior controle em ambientes reais
* Criar **testes unitários** para validar as transições de estado

---

## 📚 Conceitos Estudados

* Estruturas de repetição (`while`)
* Estruturas de decisão (`switch` → evoluindo para State)
* `Thread.sleep()` e tratamento de `InterruptedException`
* Padrão de projeto **State**
* Boas práticas de **Clean Code** e **SOLID**

---

## 👨‍💻 Autor

**Gil Rossi Aguiar**  
📧 [gilrossi.aguiar@live.com](mailto:gilrossi.aguiar@live.com)  
💼 [LinkedIn](https://www.linkedin.com/in/gil-rossi-5814659b/)  
🐙 [GitHub](https://github.com/GilRossi)
