# Coffee Menu Service

A simple REST API for managing a coffee menu using Spring Boot.

## Features

- Get all coffee menus
- Get coffee by ID
- Create a new coffee menu
- Update coffee information
- Delete a coffee menu

---

## Technologies

- Java
- Spring Boot
- Maven
- REST API
- JSON

---

## Project Structure

```
src
└── main
    └── java
        └── com.example.coffee_menu_service
            ├── controller
            │   └── CoffeeController.java
            ├── model
            │   └── Coffee.java
            ├── service
            │   └── CoffeeService.java
            └── CoffeeMenuServiceApplication.java
```

---

## How to Run

Run the project using Maven:

```bash
mvn spring-boot:run
```

The server will start at:

```
http://localhost:8080
```

---

# API Examples

## 1. Get All Coffees

**Request**

```bash
curl http://localhost:8080/coffees
```

---

## 2. Get Coffee By ID

**Request**

```bash
curl http://localhost:8080/coffees/1
```

---

## 3. Create Coffee

**Request**

### Windows (Command Prompt)

```bash
curl -X POST http://localhost:8080/coffees ^
-H "Content-Type: application/json" ^
-d "{\"name\":\"Cappuccino\",\"price\":60.0}"
```

### Linux / macOS

```bash
curl -X POST http://localhost:8080/coffees \
-H "Content-Type: application/json" \
-d '{"name":"Cappuccino","price":60.0}'
```

---

## 4. Update Coffee

**Request**

### Windows (Command Prompt)

```bash
curl -X PUT http://localhost:8080/coffees/2 ^
-H "Content-Type: application/json" ^
-d "{\"name\":\"Latte\",\"price\":50.0}"
```

### Linux / macOS

```bash
curl -X PUT http://localhost:8080/coffees/2 \
-H "Content-Type: application/json" \
-d '{"name":"Latte","price":50.0}'
```

---

## 5. Delete Coffee

**Request**

```bash
curl -X DELETE http://localhost:8080/coffees/3
```

---

## Initial Data

When the application starts, it contains the following sample data:

```json
[
  {
    "id": 1,
    "name": "Espresso",
    "price": 45.0
  },
  {
    "id": 2,
    "name": "Latte",
    "price": 55.0
  }
]
```

---

## Author

**Name:** Kanyaphak Thongwised

**GitHub:** kanyaphak-th06