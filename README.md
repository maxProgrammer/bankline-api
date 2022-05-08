<h1> 🏦 bankline-api 🏦</h1>

> Status: Completed ✅

### It's a REST API responsible for controlling the clients and operations bank CRUD.

<h1 align="center">
  <img alt="Readme" title="Readme" src="https://user-images.githubusercontent.com/87916631/167318487-371ced17-f4a2-4163-bfec-e88f0870f1bd.png"/>
</h1>


## 🔘 Fields of ContaModel are:
+ numero
+ saldo


## 🔘 Fields of CorrentistaModel are:
+ id
+ cpf
+ nome
+ conta

## 🔘 Fields of MovimentacaoModel are:
+ id
+ datahora
+ descricao
+ valor
+ tipo
+ idConta


## 📔 Features
This API is responsable to allow 2 CRUD:
+ client
+ operations

## 🤝🏽 Business Rules
Two colors can be aplied on operations:
+ RED if it's an expense
+ Blue if it's an income

Another business rule is the account balance must have been updated, always operations happen.

## ⚒️ Technologies
+ Java 11
+ Spring Boot
+ Maven
+ PostgreSQL

## 🌱 Starters
+ Spring WEB
+ Spring Data JPA
+ Spring Boot DevTools
+ Validation
+ PostgreSQL Driver
+ Swagger UI

## 🪖 Patterns
+ MVC
+ IOC
+ DTO

## 📲 contact
+ linkedin: https://www.linkedin.com/in/maxwneto/
