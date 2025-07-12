# REST_APIs
Here i want to learn you the concept of REST_APIs works in Spring Boot

🚀 Student CRUD REST API using Spring Boot ☕
🔍 Overview
Welcome to my REST API project! 🎓
This project is built using Spring Boot and demonstrates all basic CRUD operations (Create, Read, Update, Delete) through well-structured RESTful APIs.

⚡ It works without any database — instead, student data is managed using in-memory Java Lists, making it great for learning and practicing REST APIs fundamentals.

✨ Features
✅ Create – Add new students using POST
✅ Read – Retrieve student(s) using GET
✅ Update – Modify student data using PUT
✅ Delete – Remove student records using DELETE


📂 Project Structure
Copy
Edit
📦 springboot_rest_api
 ┣ 📁 controller
 ┃ ┗ 📄 StudentController.java
 ┣ 📁 bean
 ┃ ┗ 📄 Student.java
 
📡 API Endpoints
Method	Endpoint	Description
GET	/students/student	Get a single hardcoded student 👤
GET	/students	Get a list of all students 📃
GET	/students/{id}/{first-name}/{last-name}	Pass student info via path 🛣️
GET	/students/query?id=1&firstName=Neha&lastName=Sharma	Pass student info via query params 🔍
POST	/students/create	Create new student ➕
PUT	/students/{id}/update	Update student by ID ♻️
DELETE	/students/{id}/delete	Delete student by ID 🗑️

🧪 Sample Request Body
For POST or PUT:
json
Copy
Edit
{
  "id": 101,
  "firstname": "Ballu",
  "lastname": "Sharma"
}

🛠️ Tech Stack
☕ Java
🌱 Spring Boot
🌐 RESTful APIs
🧠 In-memory Java Lists (No DB)
🧪 Postman / cURL for testing

⚙️ How to Run
🔁 Clone the repo
bash
Copy
Edit
git clone https://github.com/your-username/student-crud-restapi.git
📂 Open in IntelliJ IDEA / Eclipse

▶️ Run the app using:
bash
Copy
Edit
mvn spring-boot:run
🧪 Open Postman and hit:

http://localhost:8080/students
http://localhost:8080/students/student
... and other routes!

🤝 Contribution
Want to improve this or add new features?
Fork this repo, make changes, and create a pull request! Let's build and grow together 🚀

🔗 Connect with Me
📧 Instagram: https://www.instagram.com/ballu_sharma.coder/
💼 LinkedIn: https://www.linkedin.com/in/ballu-sharma-a4a685276/
💻 GitHub: github.com/BalluSharma
