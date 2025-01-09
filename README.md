# API Treino

## Visão Geral

Esta API foi desenvolvida para gerenciar clientes, planos de treino e treinos associados a cada plano. Ela utiliza o framework Spring Boot para criação da aplicação e JPA/Hibernate para persistência de dados.

## Tecnologias Utilizadas

- Java 11+
- Spring Boot (Spring Data JPA, Spring Validation, Spring Web)
- H2 Database (banco de dados em memória para desenvolvimento/teste)
- Maven (gerenciamento de dependências)
- Postman (ou outra ferramenta para testes de API)

## Estrutura do Projeto

### Pacotes Principais:

- **model**: Contém as classes de domínio como Cliente, Plano e Treino.
- **repository**: Interfaces para acesso aos dados persistidos.
- **service**: Contém a lógica de negócios.
- **controller**: Controladores que gerenciam os endpoints da API.

## Modelagem de Dados

### Entidades Principais:

#### Cliente

**Representa um cliente da academia.**

**Atributos:**
- **id**: Identificador único do cliente.
- **nome**: Nome completo do cliente.
- **email**: Endereço de e-mail do cliente.
- **planos**: Lista de planos associados ao cliente.

**Relacionamento:**
- Um cliente pode ter muitos planos.

#### Plano

**Representa um plano de treino associado a um cliente.**

**Atributos:**
- **id**: Identificador único do plano.
- **nomePlano**: Nome descritivo do plano.
- **numeroDeTreinos**: Quantidade total de treinos no plano.
- **cliente**: Referência ao cliente dono do plano.
- **treinos**: Lista de treinos associados ao plano.

**Relacionamento:**
- Um plano pertence a um cliente.
- Um plano pode ter muitos treinos.

#### Treino

**Representa um treino individual dentro de um plano.**

**Atributos:**
- **id**: Identificador único do treino.
- **descricao**: Descrição do treino.
- **plano**: Referência ao plano associado.

**Relacionamento:**
- Um treino pertence a um plano.

## Endpoints Disponíveis

### Cliente

**Listar todos os clientes:**
- `GET /clientes`

**Obter cliente por ID:**
- `GET /clientes/{id}`

**Criar um novo cliente:**
- `POST /clientes`
  ```json
  {
      "nome": "João da Silva",
      "email": "joao.silva@example.com"
  }

**Atualizar cliente:**
- `PUT /clientes/{id}`
  ```json
   {
    "nome": "João da Silva Atualizado",
    "email": "joao.silva.atualizado@example.com"
   }

   **Deletar cliente:**
- `DELETE /clientes/{id}`

### Plano

**Listar todos os planos:**
- `GET /planos`

**Obter plano por ID:**
- `GET /planos/{id}`

**Criar um novo plano:**
- `POST /planos`
  ```json
  {
      "nomePlano": "Plano A",
      "numeroDeTreinos": 10,
      "clienteId": 1
  }

**Deletar cliente:**
- `DELETE /clientes/{id}`

### Plano

**Listar todos os planos:**
- `GET /planos`

**Obter plano por ID:**
- `GET /planos/{id}`

**Criar um novo plano:**
- `POST /planos`
  ```json
  {
      "nomePlano": "Plano A",
      "numeroDeTreinos": 10,
      "clienteId": 1
  }

**Atualizar planos:**
- `PUT /planos/{id}`
  ```json
    {
    "nomePlano": "Plano A",
    "numeroDeTreinos": 10,
    "clienteId": 1
    }


    {
    "nomePlano": "Plano A Atualizado",
    "numeroDeTreinos": 15
    }

**Deletar plano:**
- `DELETE /planos/{id}`

### Treino

**Listar todos os treinos:**
- `GET /treinos`

**Obter treino por ID:**
- `GET /treinos/{id}`

**Criar um novo treino:**
- `POST /treinos`
  ```json
  {
      "descricao": "Treino de Peito",
      "planoId": 1
  }

**Criar um novo treino:**
- `POST /treinos`
  ```json
  {
      "descricao": "Treino de Peito",
      "planoId": 1
  }

### Atualizar treino:

**PUT /treinos/{id}**

```json
{
    "descricao": "Treino de Peito Avançado"
}

**Deletar treino:**
- `DELETE /treinos/{id}`

## Configuração Local

### Clone o repositório:

```sh
git clone <URL_DO_REPOSITORIO>
cd apiTreino

## Configure o ambiente:
    Certifique-se de ter o Java 11+ instalado.

    Configure o Maven no PATH.

    Execute a aplicação:
    sh

sh
    mvn spring-boot:run
    Acesse a aplicação em http://localhost:8080.

## Testando a API
    Use o Postman, Insomnia ou qualquer cliente HTTP para consumir os endpoints disponíveis.

    O banco de dados H2 pode ser acessado em http://localhost:8080/h2-console (usuário padrão: sa, senha: vazia).

## Próximos Passos
    Implementar autenticação e autorização (Spring Security).

    Adicionar validações personalizadas para campos específicos.

    Criar testes unitários e de integração.

## Contribuições
    Sinta-se à vontade para abrir issues ou enviar pull requests para melhorias no projeto!

## Autor
    Desenvolvido por Renato Boranga.








