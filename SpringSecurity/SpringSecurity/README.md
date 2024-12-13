# Projeto Spring Security - Controle de Acesso por Papéis

Este projeto utiliza **Spring Security** para implementar controle de acesso com três níveis de rotas: uma rota pública acessível a todos, uma rota para usuários autenticados com o papel "USER" e uma rota exclusiva para administradores com o papel "ADMIN".

## Funcionalidades

- **Rota Pública**: Acessível a qualquer usuário, sem necessidade de autenticação.
- **Rota para Usuários Autenticados**: Disponível apenas para usuários autenticados com o papel "USER".
- **Rota para Administradores**: Exclusiva para usuários com o papel "ADMIN".

## Como Executar

1. **Clone o Repositório**

   ```bash
   git clone <URL-do-repositorio>
   cd nome-do-repositorio
