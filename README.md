# 📚 Library Management System -( Library Book Catalog API)

A simple **Java Spring Boot RESTful API** for managing a library’s book catalog.

---

## ✅ Features

- Add a new book
- Retrieve all books
- Get details of a book by its ID
- Delete a book
- Update availability of a book (using query parameter)
- In-memory storage — no external database needed
- Initializes with 5 books on startup

---

## ⚙️ Tech Stack

- Java 8+
- Spring Boot
- In-memory `Map` storage
- RESTful API design

---

| Method | Endpoint                       | Description                           |
| ------ | ------------------------------ | ------------------------------------- |
| POST   | `/api/books`                   | Add a new book                        |
| GET    | `/api/books`                   | Get all books                         |
| GET    | `/api/books/{id}`              | Get book by ID                        |
| DELETE | `/api/books/{id}`              | Delete book by ID                     |
| PATCH  | `/api/books/{id}/availability` | Update availability (via query param) |

## 🚀 How to Run the Project

1. **Clone the repository**

   ```bash
   git clone  https://github.com/Shoaib-Hacker/Biz-Digital-Assessment.git
   cd LibraryManagementSystem
2. **Run the application using maven**
   ```bash
   mvn spring-boot:run
2. **Access the API**
   ```bash
   http://localhost:8080/api/books
## Postman Collection Link
https://www.postman.com/avionics-engineer-11227691/workspace/my-workspace/collection/37369139-55cd2416-a96d-439e-9b4e-0f2043a47cb7?action=share&source=copy-link&creator=37369139
 
## Sample Requests & Responses

## 📚 Get all books
- **Request**
  
GET /api/books

- **Expected Response**
  
[


{

  "id": 1,
  
  "title": "Domain-Driven Design",
  
  "author": "Eric Evans",
  
  "isbn": "978-0321125217",
  
  "available": true

},

{
   
   "id": 2,
   
   "title": "Clean Code",
    
   "author": "Robert C. Martin",
   
   "isbn": "978-0132350884",
   
   "available": true
   
},

{
   
  "id": 3,
    
  "title": "Head First Design Patterns",
    
  "author": "Eric Freeman",
    
  "isbn": "978-0596007126",
    
  "available": false
  
},

{
    
  "id": 4,
  
  "title": "Spring in Action",
  
  "author": "Craig Walls",
  
  "isbn": "978-1617294945",
  
  "available": true
  
  },
  
 {
 
   "id": 5,
    
   "title": "The Pragmatic Programmer",
    
   "author": "Andrew Hunt",
    
   "isbn": "978-0201616224",
    
   "available": true
   
  }
  
]

## 📘 Add a new book
- **Request**
  
POST /api/books

Content-Type: application/json

{

  "title": "Domain-Driven Design",
 
  "author": "Eric Evans",
  
  "isbn": "978-0321125217",
  
  "available": true
  
}

- **Expected Response**
  
{

  "id": 6,
  
  "title": "Domain-Driven Design",
  
  "author": "Eric Evans",
  
  "isbn": "978-0321125217",
  
  "available": true
  
}


## 📖 Get book by ID

- **Request**

GET /api/books/1

- **Expected Response**

{

  "id": 1,
 
  "title": "Effective Java",
  
  "author": "Joshua Bloch",
  
  "isbn": "978-0134685991",
  
  "available": true

}

## 🗑️ Delete a book

- **Request**

DELETE /api/books/1

- **Expected Response**

204 No Content

## 🔄 Update availability (using @RequestParam)

**Request**

PATCH /api/books/2/availability?available=false

**Expected Response**

{

  "id": 2,
  
  "title": "Clean Code",
  
  "author": "Robert C. Martin",
  
  "isbn": "978-0132350884",
  
  "available": false
  
}


## 🧑‍💻 Author

Soyab Pinjari

📧 soyabsp.a03@gmail.com





   


