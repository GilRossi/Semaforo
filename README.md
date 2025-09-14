# 🚦 Projeto Semáforo em Java

Este projeto é uma simulação de um **semáforo** implementado em **Java 21**.  
A ideia é demonstrar conceitos de **orientação a objetos** e aplicar o **padrão de projeto State**, que organiza os diferentes estados do semáforo em classes independentes.

---

## 📌 Objetivos
- Aprender e praticar **estruturas de controle** (`switch`, `while`, `Thread.sleep`).
- Evoluir o código aplicando **boas práticas de Java**.
- Demonstrar o uso do **padrão de projeto State**.
- Tratar corretamente exceções relacionadas a **multithreading**.

---

## 🏗️ Estrutura do Projeto

```

video013/
├── SemaforoApp.java   # Classe principal
├── Semaforo.java      # Contexto que controla o estado atual
├── EstadoSemaforo.java# Interface que define o comportamento dos estados
├── Verde.java         # Estado "verde"
├── Amarelo.java       # Estado "amarelo"
└── Vermelho.java      # Estado "vermelho"

````

---

## ⚙️ Como funciona

1. O programa inicia com o estado **Verde**.
2. A cada ciclo, o estado atual é executado:
   - **Verde** → imprime `"VERDE – siga!"` e espera **3s**.
   - **Amarelo** → imprime `"AMARELO – atenção!"` e espera **1.5s**.
   - **Vermelho** → imprime `"VERMELHO – pare!"` e espera **5s**.
3. O semáforo muda para o próximo estado automaticamente.
4. O ciclo se repete infinitamente: **Verde → Amarelo → Vermelho → Verde...**

---

## 💻 Como executar

1. Compile os arquivos:

```bash
javac video013/*.java
````

2. Execute o programa:

```bash
java video013.SemaforoApp
```

---

## 🧩 Padrões e Boas Práticas

* **Padrão State**: cada estado do semáforo é representado por uma classe (`Verde`, `Amarelo`, `Vermelho`).
* **Encapsulamento**: a classe `Semaforo` controla a transição de estados.
* **Tratamento de exceções**: uso de `InterruptedException` com `Thread.currentThread().interrupt()`.
* **Extensibilidade**: fácil adicionar novos estados (ex.: `Piscando`).

---

## 🔮 Próximos Passos (Melhorias Futuras)

* Criar uma versão com **`enum`** e **Strategy Pattern** para tempos configuráveis.
* Implementar **Observer Pattern** para notificar "pedestres" ou "carros".
* Usar **ExecutorService** em vez de `Thread.sleep()` para maior controle em ambientes reais.
* Criar **testes unitários** para validar as transições de estado.

---

## 📚 Conceitos Estudados

* Estruturas de repetição (`while`).
* Estruturas de decisão (`switch` → evoluindo para State).
* `Thread.sleep()` e tratamento de `InterruptedException`.
* Padrão de projeto **State**.
* Boas práticas de **Clean Code** e **SOLID**.

---

## ✍️ Autor

Projeto desenvolvido para estudos de **Java 21** e **Padrões de Projeto**.
Feito por *\[Gil Rossi Aguiar]* 🚀
