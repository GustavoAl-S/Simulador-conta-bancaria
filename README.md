# Simulador de Conta Bancária

Este projeto é uma aplicação em Java que simula uma conta bancária simples, utilizando entrada de dados via terminal. O usuário pode criar sua conta, visualizar o saldo, fazer depósitos e saques.

Atualização: O projeto recebeu um "update" e agora está Orientado a Objetos. Temos a classe Cliente, Conta, ContaCorrente e ContaPoupanca e com metodos para validar o tipo de conta, para sacar e depositar.

## Objetivo

O projeto foi desenvolvido com foco em praticar:

- Leitura de dados com `Scanner`
- Uso de estruturas de repetição e condicionais (`do/while`, `switch`)
- Validação de entrada de dados
- Formatação de saída no console
- Lógica de fluxo de um sistema bancário básico
- Orientação a Objetos e seus princípios como **encapsulamento**, **herança** e **polimorfismo**.

## Funcionalidades

- Criar conta bancária (Corrente ou Poupança)
- Definir saldo inicial com validação
- Consultar saldo
- Realizar depósitos (com validação de valor)
- Realizar saques (com verificação de saldo)
- Sair da aplicação

## Exemplo de uso

```text
Digite seu nome: 
João
Digite o seu tipo de conta (Corrente/Poupanca)
Corrente
Digite o valor do deposito inicial: 
1000

___________________________
Dados iniciais do cliente:

Nome:           João
Tipo de conta:  Corrente
Saldo inicial:  R$ 1000.00
___________________________

___________________________
Operaçoes disponiveis:

1- Consultar saldo
2- Depositar
3- Sacar
4- Sair

Digite a opção desejada:
```

## Estrutura do projeto
```
src
└── main.com.contabancaria
    ├── application
    │   ├── Aplicacao.java
    │   └── Main2.java
    │
    ├── entities
    │   ├── Cliente.java
    │   ├── Conta.java
    │   ├── ContaCorrente.java
    │   ├── ContaPoupanca.java
    │   ├── Transacao.java
    │   └── ITransacaoRepository.java
    │
    ├── usecases
    │   └── TransacaoService.java
    │
    └── infrastructure
        └── TransacaoRepositoryInMemory.java
```

## Tecnologias utilizadas

- Java 21
- IntelliJ IDEA
- POO (Programação Orientada a Objetos) - utilizando os princípios de POO, como **encapsulamento**, **herança** e **polimorfismo**.


Feito com 💻 e ☕ por Gustavo Alves
