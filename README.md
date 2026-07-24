# ☕ Coffee Menu Service

ระบบ REST API สำหรับจัดการเมนูกาแฟ พัฒนาด้วย **Spring Boot**

โปรเจกต์นี้เป็นระบบจัดการข้อมูลเมนูกาแฟ โดยรองรับการทำงานแบบ CRUD
(Create, Read, Update, Delete) ผ่าน REST API

---

# 📌 Features

ระบบสามารถทำงานได้ดังนี้

- แสดงรายการเมนูกาแฟทั้งหมด
- ค้นหาเมนูกาแฟตาม ID
- เพิ่มเมนูกาแฟใหม่
- แก้ไขข้อมูลเมนูกาแฟ
- ลบข้อมูลเมนูกาแฟ

---

# 🛠️ Technology

- Java
- Spring Boot
- Maven
- REST API
- JSON

---

# 🚀 How to Run

## 1. Clone Repository

```bash
git clone https://github.com/kanyaphak-th06/Lab05_6733803913_3.git
```

## 2. Go to Project Directory

```bash
cd Lab05_6733803913_3
```

## 3. Run Application

ใช้คำสั่ง Maven เพื่อเริ่มต้นระบบ

```bash
mvn spring-boot:run
```

เมื่อรันสำเร็จ สามารถเรียกใช้งาน API ได้ที่

```
http://localhost:8080
```

---

# 📖 API Documentation

## 1. Get All Coffees

แสดงรายการเมนูกาแฟทั้งหมด

### Endpoint

```
GET /coffees
```

### cURL

```bash
curl http://localhost:8080/coffees
```

### Example Response

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

# 2. Get Coffee by ID

ค้นหาเมนูกาแฟตาม ID

### Endpoint

```
GET /coffees/{id}
```

### Example

```bash
curl http://localhost:8080/coffees/1
```

### Example Response

```json
{
  "id": 1,
  "name": "Espresso",
  "price": 45.0
}
```

---

# 3. Create Coffee

เพิ่มเมนูกาแฟใหม่

### Endpoint

```
POST /coffees
```

### Request Body

```json
{
  "name": "Cappuccino",
  "price": 60.0
}
```

### cURL

```bash
curl -X POST http://localhost:8080/coffees ^
-H "Content-Type: application/json" ^
-d "{\"name\":\"Cappuccino\",\"price\":60.0}"
```

### Example Response

```json
{
  "id": 3,
  "name": "Cappuccino",
  "price": 60.0
}
```

---

# 4. Update Coffee

แก้ไขข้อมูลเมนูกาแฟ

### Endpoint

```
PUT /coffees/{id}
```

### Request Body

```json
{
  "name": "Latte",
  "price": 50.0
}
```

### cURL

```bash
curl -X PUT http://localhost:8080/coffees/2 ^
-H "Content-Type: application/json" ^
-d "{\"name\":\"Latte\",\"price\":50.0}"
```

### Example Response

```json
{
  "id": 2,
  "name": "Latte",
  "price": 50.0
}
```

---

# 5. Delete Coffee

ลบเมนูกาแฟ

### Endpoint

```
DELETE /coffees/{id}
```

### cURL

```bash
curl -X DELETE http://localhost:8080/coffees/3
```

### Example Response

```
HTTP Status: 200 OK
```

---

# 🧪 Initial Data

เมื่อเริ่มต้นระบบ จะมีข้อมูลเริ่มต้นดังนี้

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

# 📌 API Summary

| Method | Endpoint | Description |
|---|---|---|
| GET | `/coffees` | Get all coffees |
| GET | `/coffees/{id}` | Get coffee by ID |
| POST | `/coffees` | Create coffee |
| PUT | `/coffees/{id}` | Update coffee |
| DELETE | `/coffees/{id}` | Delete coffee |

---