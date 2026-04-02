# 🔗 Backend Relacionamentos II - API REST 🚀

![Java](https://img.shields.io/badge/Java-Backend-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Spring](https://img.shields.io/badge/Spring-Boot-green?style=for-the-badge)
![JPA](https://img.shields.io/badge/JPA-Hibernate-blue?style=for-the-badge)
![Database](https://img.shields.io/badge/Database-MySQL-orange?style=for-the-badge)

---

# 🚀 Sobre o Projeto

Este projeto é uma evolução do estudo de **relacionamentos em banco de dados**, implementado em uma **API REST com Spring Boot**.

Aqui são explorados relacionamentos mais estruturados e próximos de um cenário real, com organização em camadas e boas práticas.

---

# 🎯 Objetivo

Aprofundar conhecimentos em:

✔ Relacionamentos entre entidades  
✔ Estruturação de APIs REST  
✔ Persistência com JPA/Hibernate  
✔ Organização backend profissional  

---

# 🧠 Relacionamentos Aplicados

O projeto trabalha com múltiplos tipos de relacionamento:

### 🔹 OneToOne (1:1)
Relacionamento direto entre duas entidades.

---

### 🔹 OneToMany (1:N)
Uma entidade possui várias outras relacionadas.

---

### 🔹 ManyToOne (N:1)
Várias entidades referenciam uma única.

---

### 🔹 ManyToMany (N:N)
Relacionamento bidirecional entre múltiplos registros.

---

# 🏗 Arquitetura do Projeto

```
src
│
├── controller
├── service
├── repository
├── model
└── dto
```

---

# 📂 Camadas Explicadas

## 🌐 Controller

Responsável por expor os **endpoints da API**.

Exemplo:

```http
GET /entidades
POST /entidades
```

---

## ⚙ Service

Camada de **regras de negócio**.

✔ valida dados  
✔ processa lógica  
✔ organiza operações  

---

## 🗄 Repository

Interface que faz a comunicação com o banco.

✔ CRUD automático com Spring Data  

---

## 📦 Model

Define as entidades e seus relacionamentos.

Exemplo:

```java
@ManyToMany
@JoinTable(name = "relacao")
private List<OutraEntidade> lista;
```

---

## 🔄 DTO

Evita exposição direta das entidades:

✔ segurança  
✔ controle de dados  
✔ padronização da API  

---

# 🌐 Endpoints

Exemplos de rotas:

```http
GET /dados
POST /dados
PUT /dados/{id}
DELETE /dados/{id}
```

---

# 🔄 Fluxo da Requisição

```
Cliente → Controller → Service → Repository → Banco
```

---

# 🛠 Tecnologias Utilizadas

- ☕ Java  
- 🌱 Spring Boot  
- 🗄 JPA / Hibernate  
- 🐬 MySQL  
- 📄 JSON  

---

# 💻 Como Rodar

### 1️⃣ Clonar o projeto

```bash
git clone https://github.com/seu-repositorio/backend-relacionamento2.git
```

---

### 2️⃣ Configurar banco

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/seu_banco
spring.datasource.username=root
spring.datasource.password=senha
```

---

### 3️⃣ Rodar aplicação

Execute a classe principal.

---

# 🔥 Melhorias Futuras

✨ Paginação e filtros  
✨ Swagger (documentação)  
✨ Autenticação JWT  
✨ Logs e monitoramento  
✨ Deploy em nuvem  

---

# 👨‍💻 Autor

**Leandro Mogador ++ 🚀**

---

# ⭐ Conclusão

Este projeto representa um avanço no estudo de:

✔ Relacionamentos complexos  
✔ Estruturação de APIs  
✔ Boas práticas com Spring Boot  

---

🔥 Base sólida para sistemas reais com banco relacional e backend profissional!
