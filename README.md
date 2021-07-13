# SO System - Back-End
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/jglasner/jglasner.github.io/blob/master/LICENSE) 

# Sobre o projeto

https://jglasner.github.io/

OS System é uma aplicação full stack web construída durante o curso Full Stack Developer, mistrador pelo professor Valdir Cezar. [Udemy](https://www.udemy.com/course/curso-full-stack-developer/ "Site da Udemy").

A aplicação consiste em realizar o cadastro de técnicos, clientes e ordens para criar e gerenciar ordens de serviço.

# Tecnologias utilizadas
## Back end
- Java 11
- Spring Boot
- Spring Data
- Tratamento de exceções
- Validations
- Padrão DTO
- Maven
## Front end
- HTML5 / CSS3 / JS / TypeScript
- Angular 11
- Angular Material
- Angular CLI
- NPM
## Implantação em produção
- Back end: Heroku
- Front end web: Github Pages
- Banco de dados: H2 e MySql

# Como executar o projeto

## Back end
Pré-requisitos: Java 11

```bash
# clonar repositório
git clone https://github.com/jglasner/os-api

# executar o projeto
./mvnw spring-boot:run
```

## Front end web
Pré-requisitos: npm

```bash
# clonar repositório
git clone https://github.com/jglasner/jglasner.github.io

# entrar na pasta do projeto front end web
cd os

# instalar dependências
npm install -g @angular/cli@11.2.7

# criar projeto
npm new os --minimal

# executar o projeto
ng serve

# adicionar o framework Angular Material - Purple/Green
npm add -g @angular/material

```

# Autor

Jorge Glasner

https://www.linkedin.com/in/jorge-glasner-709633b3/
