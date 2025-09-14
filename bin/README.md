# README - Sistema de Semáforo em Java

## 📋 Descrição do Projeto

Este projeto implementa uma simulação de semáforo em Java, desenvolvida como teste técnico para o Banco Toyota. O sistema simula o funcionamento contínuo de um semáforo com três estados (VERDE, AMARELO e VERMELHO), cada um com intervalos de tempo específicos.

## 🚦 Funcionalidades

- Ciclo contínuo de estados do semáforo:
    - **VERDE**: permanece ativo por 3 segundos (3000ms)
    - **AMARELO**: permanece ativo por 1,5 segundos (1500ms)
    - **VERMELHO**: permanece ativo por 5 segundos (5000ms)
- Tratamento de exceções para interrupções do thread
- Loop infinito que mantém o semáforo em funcionamento contínuo

## 🛠️ Tecnologias Utilizadas

- **Linguagem**: Java
- **Recursos**: Threads e tratamento de exceções

## 📦 Estrutura do Projeto

```
semaforo/
├── Semaforo.java
└── README.md
```

## 🔧 Como Executar

### Pré-requisitos
- JDK (Java Development Kit) 8 ou superior instalado

### Compilação e Execução

1. Navegue até o diretório do projeto:
```bash
cd caminho/para/o/diretorio/do/projeto
```

2. Compile o arquivo Java:
```bash
javac Semaforo.java
```

3. Execute o programa:
```bash
java Semaforo
```

### Execução Alternativa com IDEs
- **IntelliJ IDEA**: Abra o arquivo e execute com Ctrl+Shift+F10
- **Eclipse**: Importe o projeto, clique com botão direito e selecione "Run As > Java Application"
- **VS Code**: Instale a extensão Java, abra o arquivo e clique em "Run"

## 📊 Saída do Programa

Ao executar, o programa exibirá no console:

```
VERDE
(aguarda 3 segundos)
AMARELO  
(aguarda 1,5 segundos)
VERMELHO
(aguarda 5 segundos)
VERDE
(... e repete o ciclo indefinidamente)
```

## ⚙️ Personalização

Para alterar os tempos de cada estado do semáforo, modifique os valores em milissegundos nos métodos `Thread.sleep()`:

```java
Thread.sleep(3000); // Verde - 3 segundos
Thread.sleep(1500); // Amarelo - 1,5 segundos  
Thread.sleep(5000); // Vermelho - 5 segundos
```

## 📝 Observações

- Este projeto foi desenvolvido como parte de um processo seletivo para o Banco Toyota
- O código demonstra conhecimentos em programação Java, manipulação de threads e tratamento de exceções
- Para interromper a execução, utilize Ctrl+C no terminal

## 👨‍💻 Autor

Desenvolvido como parte do processo seletivo para o Banco Toyota.