# Consumindo a API do GitHub

Este projeto Spring Boot consome a API pública do GitHub para fornecer informações sobre repositórios e usuários.

## Rotas Disponíveis

A API expõe os seguintes endpoints:

* **`GET /repos`**: Lista todos os repositórios públicos do usuário autenticado.
    * **Header:**
        * `token`: Seu token de autenticação do GitHub.
    * **Resposta:** Retorna uma lista de objetos `RepositoryResponse`, contendo informações sobre cada repositório.

* **`GET /users/{username}`**: Obtém informações detalhadas sobre um usuário específico do GitHub.
    * **Path Variable:**
        * `username`: O nome de usuário do GitHub a ser consultado.
    * **Resposta:** Retorna um objeto `ResponseUsers` com os detalhes do usuário.

* **`GET /users/{username}/repos`**: Lista os repositórios de um usuário específico do GitHub.
    * **Path Variable:**
        * `username`: O nome de usuário do GitHub cujos repositórios serão listados.
    * **Resposta:** Retorna uma lista de objetos `RepositoryResponse` contendo informações sobre os repositórios do usuário.

## Pré-requisitos

* Java Development Kit (JDK) instalado.
* Maven instalado.
* Uma conta no GitHub e um token de acesso pessoal com as permissões necessárias para acessar as informações desejadas (para a rota `/repos`). Você pode gerar um token em [https://github.com/settings/tokens](https://github.com/settings/tokens).

## Como Executar

1.  Clone este repositório (se aplicável).
2.  Navegue até o diretório do projeto.
3.  Execute o seguinte comando para construir o projeto:
    ```bash
    mvn clean install
    ```
4.  Execute o seguinte comando para iniciar a aplicação Spring Boot:
    ```bash
    mvn spring-boot:run
    ```
    A aplicação estará disponível (por padrão) em `http://localhost:8080`.

## Como Usar a API

Você pode usar ferramentas como `curl`, Postman ou Insomnia para interagir com a API.

**Exemplos:**

* **Listar seus repositórios públicos:**
    ```bash
    curl -X GET -H "token: SEU_TOKEN_GITHUB" http://localhost:8080/repos
    ```

* **Obter informações do usuário "octocat":**
    ```bash
    curl http://localhost:8080/users/octocat
    ```

* **Listar os repositórios do usuário "octocat":**
    ```bash
    curl http://localhost:8080/users/octocat/repos
    ```


## Tecnologias Utilizadas

* Java
* Spring Boot
* Spring Web
