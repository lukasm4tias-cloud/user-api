# User API

API REST desenvolvida em Java 21 com Spring Boot para gerenciamento de usuários, utilizando PostgreSQL para persistência de dados.

## Tecnologias

- Java 21
- Spring Boot 3.5.6
- Spring Data JPA
- PostgreSQL
- Flyway
- Maven
- Docker

## Funcionalidades

- Cadastro de usuários
- Listagem de usuários
- Consulta por ID e CPF
- Busca por nome
- Exclusão de usuários

## Endpoints

| Método | Endpoint | Descrição |
|---|---|---|
| GET | `/user/` | Lista os usuários |
| GET | `/user/{id}` | Consulta por ID |
| GET | `/user/cpf/{cpf}` | Consulta por CPF |
| GET | `/user/search?nome=valor` | Busca por nome |
| POST | `/user` | Cadastra um usuário |
| DELETE | `/user/{id}` | Exclui um usuário |

## Estrutura do projeto

A aplicação está organizada em camadas:

- **Controller:** recebe as requisições HTTP.
- **Service:** concentra as operações da aplicação.
- **Repository:** realiza o acesso ao banco de dados.
- **Model:** representa a entidade persistida.
- **DTO:** transporta os dados entre a API e o cliente.

## Execução

O projeto utiliza PostgreSQL na porta `5432`, com o banco `user_api_db`.

Configure a variável de ambiente `DB_PASSWORD` com a senha do PostgreSQL e execute:

```bash
mvn spring-boot:run
```

A API ficará disponível em `http://localhost:8080`.

## Exemplo de cadastro

**POST** `/user`

```json
{
  "nome": "João Silva",
  "cpf": "12345678900",
  "endereco": "São Paulo",
  "email": "joao@email.com",
  "telefone": "11999999999"
}
```

A data de cadastro é preenchida automaticamente pela aplicação.
