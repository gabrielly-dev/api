# API de Gerenciamento de Consultas Médicas

![Concluído](https://img.shields.io/badge/status-concluído-brightgreen)

---

## Sumário

- [Visão Geral do Projeto](#visão-geral-do-projeto)
- [Descrição do Projeto](#descrição-do-projeto)
- [Funcionalidades](#funcionalidades)
- [Tecnologias Utilizadas](#tecnologias-utilizadas)
- [Instalação](#instalação)
- [Uso](#uso)
- [Endpoints da API](#endpoints-da-api)
- [Contribuindo](#contribuindo)
- [Licença](#licença)
- [Contato](#contato)

---

## Visão Geral do Projeto

Este projeto backend tem como objetivo gerenciar consultas médicas de forma eficiente e segura, oferecendo funcionalidades como autenticação de usuários, agendamento e cancelamento de consultas via API REST. Ideal para clínicas e consultórios que buscam automatizar seus processos.

---

## Descrição do Projeto

Projeto backend para gerenciamento de consultas médicas, com autenticação de usuários, agendamento e cancelamento de consultas via API REST.

---

## Funcionalidades

- Autenticação de usuários via JWT ![JWT](https://img.shields.io/badge/JWT-seguro-blue)
- Agendamento de consultas médicas ![Agendamento](https://img.shields.io/badge/agendamento-sim-blue)
- Cancelamento de consultas ![Cancelamento](https://img.shields.io/badge/cancelamento-sim-blue)
- Endpoints REST seguros e organizados ![REST](https://img.shields.io/badge/REST-API-blue)

---

## Tecnologias Utilizadas

![Java](https://img.shields.io/badge/Java-17-blue) ![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.0.0-green) ![Spring Security](https://img.shields.io/badge/Spring_Security-5.7.0-green) ![JWT](https://img.shields.io/badge/JWT-JSON_Web_Token-blue) ![Maven](https://img.shields.io/badge/Maven-3.8.6-red) ![Jakarta Validation](https://img.shields.io/badge/Jakarta_Validation-3.0.2-orange) ![Swagger](https://img.shields.io/badge/Swagger-OpenAPI-blue) ![Flyway](https://img.shields.io/badge/Flyway-8.5.13-lightgrey) ![PostgreSQL](https://img.shields.io/badge/PostgreSQL-14-blue)

---

## Instalação

Siga os passos abaixo para configurar o projeto localmente:

```bash
# Clone o repositório
git clone <URL_DO_REPOSITORIO>

# Acesse o diretório do projeto
cd api

# Compile o projeto com Maven
./mvnw clean install

# Execute a aplicação
./mvnw spring-boot:run
```

---

## Uso

Após iniciar a aplicação, a API estará disponível em `http://localhost:8080`. Utilize ferramentas como Postman ou Insomnia para testar os endpoints.

---

## Endpoints da API

Aqui estão alguns dos principais endpoints disponíveis:

| Método | Endpoint               | Descrição                      |
|--------|------------------------|-------------------------------|
| POST   | `/login`               | Autenticação de usuários       |
| GET    | `/medicos`             | Listar médicos                 |
| POST   | `/medicos`             | Cadastrar novo médico          |
| GET    | `/pacientes`           | Listar pacientes               |
| POST   | `/pacientes`           | Cadastrar novo paciente        |
| GET    | `/consultas`           | Listar consultas               |
| POST   | `/consultas`           | Agendar nova consulta          |
| DELETE | `/consultas/{id}`      | Cancelar consulta              |

---

## Contribuindo

Contribuições são bem-vindas! Para contribuir, siga os passos:

1. Fork este repositório.
2. Crie uma branch para sua feature (`git checkout -b feature/nome-da-feature`).
3. Faça commit das suas alterações (`git commit -m 'Adiciona nova feature'`).
4. Faça push para a branch (`git push origin feature/nome-da-feature`).
5. Abra um Pull Request.

---

## Licença

Este projeto está licenciado sob a licença MIT. Veja o arquivo LICENSE para mais detalhes.

---

## Contato

[![Instagram](https://img.shields.io/badge/Instagram-E4405F?style=for-the-badge&logo=instagram&logoColor=white)](https://www.instagram.com/gabrielly.dev)
[![LinkedIn](https://img.shields.io/badge/LinkedIn-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/gabrielly-dev)
[![GitHub](https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=github&logoColor=white)](https://github.com/gabrielly-dev)
