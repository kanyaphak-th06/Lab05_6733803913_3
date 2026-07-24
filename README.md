# ☕ Coffee Menu Service

ระบบ REST API สำหรับจัดการเมนูกาแฟ พัฒนาด้วย **Spring Boot**  
โดยรองรับการทำงานแบบ CRUD (Create, Read, Update, Delete) สำหรับจัดการข้อมูลเมนูกาแฟ

---

## 📌 ความสามารถของระบบ

- 📋 แสดงรายการเมนูกาแฟทั้งหมด
- 🔍 ค้นหาเมนูกาแฟตาม ID
- ➕ เพิ่มเมนูกาแฟใหม่
- ✏️ แก้ไขข้อมูลเมนูกาแฟ
- 🗑️ ลบเมนูกาแฟ

---

## 🚀 วิธีการรันโปรเจกต์

1. Clone Repository

```bash
git clone https://github.com/kanyaphak-th06/Lab05_6733803913_3.git
```

2. เข้าไปยังโฟลเดอร์โปรเจกต์

```bash
cd Lab05_6733803913_3
```

3. รันโปรเจกต์ด้วย Maven

```bash
mvn spring-boot:run
```

เมื่อรันสำเร็จ ระบบจะทำงานที่

```
http://localhost:8080
```

---

# 📖 ตัวอย่างการเรียกใช้งาน API

## 1. แสดงเมนูกาแฟทั้งหมด

**Method**

```
GET /coffees
```

**cURL**

```bash
curl http://localhost:8080/coffees
```

---

## 2. แสดงเมนูกาแฟตาม ID

**Method**

```
GET /coffees/{id}
```

**ตัวอย่าง**

```bash
curl http://localhost:8080/coffees/1
```

---

## 3. เพิ่มเมนูกาแฟใหม่

**Method**

```
POST /coffees
```

**cURL (Windows Command Prompt)**

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

## 4. แก้ไขข้อมูลเมนูกาแฟ

**Method**

```
PUT /coffees/{id}
```

**cURL (Windows Command Prompt)**

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

## 5. ลบเมนูกาแฟ

**Method**

```
DELETE /coffees/{id}
```

**ตัวอย่าง**

```bash
curl -X DELETE http://localhost:8080/coffees/3
```

---

## 🧪 ข้อมูลเริ่มต้นของระบบ

เมื่อเริ่มต้นระบบ จะมีข้อมูลเมนูกาแฟตัวอย่างดังนี้

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