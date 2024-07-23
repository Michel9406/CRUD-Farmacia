## CRUD-Farmacia 🏥
Descrição do Projeto 📋<br>
O CRUD-Farmacia é uma aplicação backend desenvolvida com Spring Boot que permite gerenciar os dados dos produtos de uma farmácia,
classificados por categorias. Este projeto implementa um CRUD completo para o recurso Categoria, com operações de criação, leitura, atualização e exclusão.

## Funcionalidades 🚀
Create: Criar uma nova categoria (POST /categorias)
Read All: Listar todas as categorias (GET /categorias)
Read by ID: Buscar uma categoria específica por ID (GET /categorias/{id})
Update: Atualizar uma categoria existente (PUT /categorias/{id})
Delete: Excluir uma categoria (DELETE /categorias/{id})<br>

## Tecnologias Utilizadas 🛠️
Java
Spring Boot
Spring Data JPA
H2 Database<br>

## Como Executar o Projeto ▶️
Pré-requisitos<br>
Java 8 ou superior<br>
Maven<br>
Passos para Executar<br>
Clone o repositório<br>
git clone https://github.com/seu-usuario/CRUD-Farmacia.git<br>
Navegue até o diretório do projeto<br>
cd CRUD-Farmacia<br>
Compile e execute o projeto com Maven:<br>
mvn spring-boot:run<br>
Acesse a aplicação em seu navegador:<br>
http://localhost:8080<br>


## Estrutura do Projeto 🗂️
src/main/java/com/exemplo/farmacia
model : Contém a entidade Categoria.
repository : Contém a interface CategoriaRepository.
controller : Contém o controlador REST CategoriaController.<br>

## Endpoints da API 🌐
POST /categorias : Cria uma nova categoria.
GET /categorias : Retorna uma lista de todas as categorias.
GET /categorias/{id} : Retorna uma categoria específica por ID.
PUT /categorias/{id} : Atualiza uma categoria existente.
DELETE /categorias/{id} : Exclui uma categoria.<br>

Exemplo de Categoria JSON 📄
json
Copiar código
{
  "nome": "Medicamentos",
  "descricao": "Categoria para medicamentos de prescrição"
}
