# DSList
[![NPM](https://img.shields.io/npm/l/react)]([https://github.com/gilvaneamaro/dslist/blob/main/LICENSE) 

# Sobre o projeto

DSlist é uma aplicação backend web (API Rest) construída durante uma edição da **Semana DevSuperior**, evento organizado pela [DevSuperior](https://devsuperior.com "Site da DevSuperior").

O código segue o Design Patterns -  Camadas DTO, tendo a camada Service, Controller e DTO, aplica a regra de negócio por trás de um site que organiza uma lista de jogos e suas características, responde a requisições para exibir essa lista de formas diferentes e também reordenar os jogos.

Configurado com dois ambientes de desenvolvimento, utilizando o banco de dados H2 para um teste rápido e Postgres através do container Docker para homologação.



## Requisições no Postman
![Postman requisicoes](https://github.com/gilvaneamaro/dslist/assets/121205315/872b4973-4a33-4c22-b514-41c9b06ab679)

## Visualização do Postgres no Docker (Pgadmin)
![Pgadmin docker](https://github.com/gilvaneamaro/dslist/assets/121205315/58356c8c-07e4-41bc-a48e-9c304eaa2de7)

## Docker em execução
![docker](https://github.com/gilvaneamaro/dslist/assets/121205315/4a8102f8-410d-4463-9d8a-7435b10a083e)

## Modelo conceitual
![dslist-model](https://github.com/gilvaneamaro/dslist/assets/121205315/39f9e6b4-cb62-425f-a886-edee08272d6f)

# Tecnologias utilizadas
## Back end
- Java
- Spring Boot
- Spring Tool Suite 4
- JPA / Hibernate
- Maven

## Implantação em Desenvolvimento
- Requisições Back end: Postman
- Banco de dados: H2

## Implantação em Teste
- Requisições Back end: Postman
- Banco de dados: Postgres
- Container: Docker

# Como executar o projeto

## Back end
Pré-requisitos: Java 17

- Importar o projeto para dentro da IDE Spring Tool Suite 4
- Clicar com o botão direito em dslist e selecionar (Re)Start

## Requisições
Pré-requisitos: Postman

- Importar as [Collections](https://github.com/gilvaneamaro/dslist/blob/main/assets/dslist.postman_collection.json "Link da Collection")
- Executar as requisições 

## Visualizar o banco com perfil de teste (banco H2)

- Acessar http://localhost:8080/h2-console

## Visualizar o banco com perfil de desenvolvimento (banco postgres)
Pré-requisitos: Docker

- Faça o download do arquivo [docker-compose.yml](https://github.com/gilvaneamaro/dslist/blob/main/assets/docker-compose.yml "docker compose")
- Abra Powershell em modo administrador
- Localize a pasta do arquivo e digite
```bash
 docker compose -f docker-compose.yml -f
 docker-compose.admin.yml run backup_db
```
- Acesse http://localhost:5050/browser/
login: me@example.com
senha: 1234567

# Autor

Gilvane Amaro

[https://www.linkedin.com/in/wmazoni](https://www.linkedin.com/in/gilvane-amaro/)https://www.linkedin.com/in/gilvane-amaro/
