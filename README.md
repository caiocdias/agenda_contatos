# Agenda de Contatos com Herança e Polimorfismo

## Descrição
Este projeto implementa uma agenda de contatos utilizando os conceitos de herança e polimorfismo em Java. A agenda suporta operações para adicionar, remover, pesquisar e visualizar contatos, que podem ser tanto pessoas físicas quanto jurídicas.

## Estrutura do Projeto
O projeto é organizado nas seguintes classes:
- `Contato`: Classe abstrata base para todos os contatos.
- `ContatoPF`: Derivada de `Contato`, representa um contato de pessoa física.
- `ContatoPJ`: Derivada de `Contato`, representa um contato de pessoa jurídica.
- `Agenda`: Contém a lista de contatos e métodos para gerenciar a agenda.

## Funcionalidades
- **Adicionar Contatos:** Adiciona um novo contato à agenda.
- **Remover Contatos:** Remove um contato existente.
- **Pesquisar Contatos:** Busca por contatos por nome ou CPF/CNPJ.
- **Visualizar Todos os Contatos:** Exibe todos os contatos na agenda.
- **Ordenar Contatos:** Ordena contatos primeiro por tipo (pessoa física, depois jurídica) e dentro do mesmo tipo por CPF/CNPJ em ordem crescente.

## Como Usar
Para executar o projeto:
1. Clone o repositório.
2. Compile o código fonte com seu compilador Java de escolha.
3. Execute o programa para interagir com a agenda de contatos através do console ou interface gráfica, dependendo da implementação.

## Tecnologias Utilizadas
- Java

## Autores
- Caio Cezar Dias