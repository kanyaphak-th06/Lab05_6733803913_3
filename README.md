# ☕ Coffee Menu Service

A simple REST API for managing coffee menus, developed with **Spring Boot**.  
This project demonstrates the basic CRUD operations (Create, Read, Update, Delete) for a coffee menu.

---

## 📌 Features

- 📋 Get all coffee menus
- 🔍 Get a coffee menu by ID
- ➕ Create a new coffee menu
- ✏️ Update an existing coffee menu
- 🗑️ Delete a coffee menu

---

## 🚀 How to Run

1. Clone this repository

```bash
git clone https://github.com/kanyaphak-th06/Lab05_6733803913_3.git
```

2. Go to the project directory

```bash
cd Lab05_6733803913_3
```

3. Run the application

```bash
mvn spring-boot:run
```

4. The server will start at

```
http://localhost:8080
```

---

# 📖 API Examples

## 1️⃣ Get All Coffees

**Endpoint**

```
GET /coffees
```

**cURL**

```bash
curl http://localhost:8080/coffees
```

---

## 2️⃣ Get Coffee by ID

**Endpoint**

```
GET /coffees/{id}
```

**Example**

```bash
curl http://localhost:8080/coffees/1
```

---

## 3️⃣ Create a New Coffee

**Endpoint**

```
POST /coffees
```

**Windows (Command Prompt)**

```bash
curl -X POST http://localhost:8080/coffees ^
-H "Content-Type: application/json" ^
-d "{\"name\":\"Cappuccino\",\"price\":60.0}"
```

**Request Body**

```json
{
  "name": "Cappuccino",
  "price": 60.0
}
```

---

## 4️⃣ Update Coffee

**Endpoint**

```
PUT /coffees/{id}
```

**Windows (Command Prompt)**

```bash
curl -X PUT http://localhost:8080/coffees/2 ^
-H "Content-Type: application/json" ^
-d "{\"name\":\"Latte\",\"price\":50.0}"
```

**Request Body**

```json
{
  "name": "Latte",
  "price": 50.0
}
```

---

## 5️⃣ Delete Coffee

**Endpoint**

```
DELETE /coffees/{id}
```

**Example**

```bash
curl -X DELETE http://localhost:8080/coffees/3
```

---

## 🧪 Initial Sample Data

When the application starts, the following coffee menu is available:

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

## 👩‍💻 Author

**Name:** Kanyaphak Thongwiset

**GitHub:** https://github.com/kanyaphak-th06