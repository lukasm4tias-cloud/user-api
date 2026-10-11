# 🚀 User API — Java & Spring Boot

API REST para gerenciamento de usuários, desenvolvida com **Java 21, Spring Boot e PostgreSQL**, como parte dos meus estudos e aprimoramento em desenvolvimento Backend.

O projeto utiliza arquitetura em camadas, persistência de dados com Spring Data JPA e gerenciamento de migrações do banco de dados com Flyway.

## 🛠️ Tecnologias utilizadas

- **Java 21** — Linguagem de programação
- **Spring Boot 3.5.6** — Framework para desenvolvimento da API
- **Spring Web** — Construção de endpoints REST
- **Spring Data JPA** — Persistência de dados
- **Hibernate** — Mapeamento objeto-relacional (ORM)
- **PostgreSQL** — Banco de dados relacional
- **Flyway** — Versionamento e migração do banco de dados
- **Docker** — Execução do PostgreSQL em contêiner
- **Maven** — Gerenciamento de dependências e build
- **Git e GitHub** — Versionamento do código-fonte

## 🏗️ Arquitetura do projeto

A aplicação está organizada em camadas para separar responsabilidades:

**Controller → Service → Repository → PostgreSQL**

- **Controller:** recebe as requisições HTTP e retorna as respostas.
- **Service:** concentra a lógica de negócio da aplicação.
- **Repository:** realiza operações de persistência com Spring Data JPA.
- **DTO:** representa os dados transferidos entre a API e seus clientes.
- **Model:** representa as entidades persistidas no banco de dados.

## ⚙️ Funcionalidades

- Cadastro de usuários
- Listagem de usuários
- Consulta por ID
- Consulta por CPF
- Busca de usuários por nome
- Exclusão de usuários
- Persistência de dados no PostgreSQL

## 🌐 Endpoints da API

| Método | Endpoint | Descrição |
|---|---|---|
| GET | `/user/` | Lista todos os usuários |
| GET | `/user/{id}` | Busca usuário pelo ID |
| GET | `/user/cpf/{cpf}` | Busca usuário pelo CPF |
| GET | `/user/search?nome=...` | Busca usuários por nome |
| POST | `/user` | Cadastra um usuário |
| DELETE | `/user/{id}` | Exclui um usuário |

### Exemplo de cadastro

**POST** `/user`

```json
{
  "nome": "Lukas",
  "cpf": "12345678900",
  "endereco": "São Paulo",
  "email": "lukas@email.com",
  "telefone": "11999999999"
}
```

O campo `dataCadastro` é preenchido automaticamente pela aplicação.

## 🗄️ Banco de dados

A aplicação utiliza PostgreSQL, com esquema `users`.

As alterações estruturais do banco são gerenciadas pelo Flyway, por meio de scripts SQL versionados.

A migração inicial cria a tabela responsável pelo armazenamento dos usuários.

## ▶️ Como executar o projeto

### Pré-requisitos

- JDK 21
- Maven
- Docker com PostgreSQL
- Git
- IDE Java (NetBeans, IntelliJ IDEA ou VS Code)

### 1. Clonar o repositório

```bash
git clone https://github.com/lukasmatias-dev/user-api.git
```

### 2. Configurar o banco de dados

Inicie uma instância do PostgreSQL na porta `5432` e crie o banco:

```sql
CREATE DATABASE user_api_db;
```

Configure a variável de ambiente `DB_PASSWORD` com a senha do PostgreSQL.

A configuração atual da aplicação utiliza o usuário `postgres` e a conexão local na porta `5432`.

### 3. Executar a aplicação

Na pasta do projeto:

```bash
mvn spring-boot:run
```

A API estará disponível em:

`http://localhost:8080`

### 4. Testar a aplicação

Para listar os usuários, acesse:

`http://localhost:8080/user/`

Para cadastrar usuários, envie uma requisição POST com JSON utilizando um cliente HTTP.

## 📚 Aprendizados

Este projeto permitiu colocar em prática conceitos importantes de desenvolvimento Backend:

- Construção de APIs REST
- Injeção de dependências
- Arquitetura em camadas
- Spring Data JPA e Hibernate
- Persistência de dados relacionais
- Migrações com Flyway
- Integração com PostgreSQL
- Versionamento de código com Git e GitHub

## 👨‍💻 Autor

**Lukas Matias**

Graduado em Análise e Desenvolvimento de Sistemas, com experiência profissional em Tecnologia da Informação e foco no desenvolvimento Backend Java.

[GitHub](https://github.com/lukasmatias-dev) • [LinkedIn](https://www.linkedin.com/in/lukas-matias-01201019b) • [E-mail](mailto:lukas.m4tias@gmail.com)
