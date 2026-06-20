# 🛒 Ecommerce Store Front

A full-stack Ecommerce Store application built using **Spring Boot**, **React**, **Vite**, **MySQL**, and **Bootstrap**. This project demonstrates a clean separation between the backend REST API and the frontend client while following industry-standard project structure and Git workflow.

---

## 🚀 Features

- 📦 View all available products
- 🗂️ Filter products by category (Backend API)
- 🏷️ Product cards with image, name, description and price
- 🔗 React frontend consuming Spring Boot REST APIs
- 🗃️ MySQL database integration
- 🌱 Automatic sample data seeding
- 🎨 Responsive UI using Bootstrap
- 🏛️ MVC Architecture
- 💉 Dependency Injection (IoC)
- 📡 RESTful APIs with Spring Boot

---

## 🛠️ Tech Stack

### Backend

- Java 21+
- Spring Boot
- Spring Web
- Spring Data JPA
- Hibernate
- MySQL
- Maven
- Lombok

### Frontend

- React
- Vite
- Bootstrap 5
- React Bootstrap
- Fetch API

### Tools

- Git & GitHub
- IntelliJ IDEA
- VS Code
- Postman

---

## 📁 Project Structure

```
Ecommerce-Store-Front
│
├── productcatalog/          # Spring Boot Backend
│   ├── controller/
│   ├── service/
│   ├── repository/
│   ├── model/
│   ├── config/
│   └── resources/
│
├── ecom-frontend/           # React Frontend
│   ├── src/
│   ├── public/
│   └── package.json
│
└── README.md
```

---

## 🏗️ Backend Architecture

```
Client
   │
   ▼
Controller
   │
   ▼
Service
   │
   ▼
Repository (JPA)
   │
   ▼
MySQL Database
```

---

## 📡 REST API Endpoints

### Products

| Method | Endpoint | Description |
|---------|----------|-------------|
| GET | `/api/products` | Get all products |
| GET | `/api/products/category/{id}` | Get products by category |

### Categories

| Method | Endpoint |
|---------|----------|
| GET | `/api/categories` |

---

## ⚙️ Installation

### Clone Repository

```bash
git clone https://github.com/SPIDEY777/Ecommerce-Store-Front.git
cd Ecommerce-Store-Front
```

---

## 🖥️ Backend Setup

```bash
cd productcatalog
```

Configure your MySQL database in:

```
src/main/resources/application.properties
```

Example:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/product-catalog
spring.datasource.username=YOUR_USERNAME
spring.datasource.password=YOUR_PASSWORD
```

Run the backend:

```bash
mvn spring-boot:run
```

Backend runs at:

```
http://localhost:8080
```

---

## 🌐 Frontend Setup

```bash
cd ecom-frontend
```

Install dependencies

```bash
npm install
```

Run development server

```bash
npm run dev
```

Frontend runs at

```
http://localhost:5173
```

---

## 📷 Screenshots

### Home Page

> Add screenshots here

```
screenshots/home.png
```

---

## 🌱 Sample Data

The project automatically seeds sample products and categories on startup using a data seeder.

Example products:

- Smartphone
- Laptop
- Jacket
- Blender

---

## 📚 Concepts Demonstrated

- Spring Boot MVC Architecture
- REST API Development
- Dependency Injection
- Inversion of Control (IoC)
- Spring Data JPA
- Entity Relationships
- React Components
- React Hooks (`useState`, `useEffect`)
- Fetch API
- Bootstrap Grid System
- Cross-Origin Resource Sharing (CORS)
- Git Feature Branch Workflow

---

## 🔮 Future Improvements

- User Authentication
- JWT Security
- Shopping Cart
- Checkout
- Wishlist
- Product Search
- Category Filter UI
- Product Details Page
- Admin Dashboard
- Image Upload
- Pagination
- Docker Deployment

---

## 👨‍💻 Author

**Kunal Sharma**

- GitHub: https://github.com/SPIDEY777

---

## ⭐ If you like this project

Give it a ⭐ on GitHub!
