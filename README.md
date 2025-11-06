# 🧑‍💼 Employment Management System (EMS)

![Project Banner](https://github.com/Kafoor-A/Employee-management-system/blob/main/1762279074641.jpg)

The **Employment Management System (EMS)** is a web-based platform designed to simplify and automate HR operations within organizations.  
It enables administrators and HR teams to efficiently manage employee records, track attendance, handle payroll, and analyze workforce performance through a centralized dashboard.

---

## 🚀 Features
- ✅ Employee registration and profile management  
- ✅ Attendance and leave tracking system  
- ✅ Role-based login for Admin, HR, and Employee  
- ✅ Automated payroll and salary report generation  
- ✅ Real-time performance analytics dashboard  
- ✅ Export employee data in CSV or Excel format  
- ✅ Email notification integration (optional)  

---

## 🛠️ Tech Stack

| Layer | Technology |
|:------|:------------|
| **Frontend** | HTML, CSS, JavaScript, Bootstrap |
| **Backend** | Python Flask |
| **Database** | MySQL |
| **Version Control** | Git & GitHub |
| **IDE** | Visual Studio Code |

---

## 🧩 Project Structure

```bash
Employment-Management-System/
│
├── static/                     # CSS, JS, and image assets
│   ├── css/
│   ├── js/
│   └── images/
│
├── templates/                  # HTML templates for Flask
│   ├── index.html
│   ├── login.html
│   ├── dashboard.html
│   ├── employee.html
│   ├── attendance.html
│   └── reports.html
│
├── app.py                      # Main Flask application
├── config.py                   # Database configuration
├── models.py                   # ORM models (SQLAlchemy)
├── requirements.txt            # Python dependencies
├── README.md                   # Project documentation
└── LICENSE                     # MIT License
```
---

## ⚙️ Installation & Setup

### 🔹 Prerequisites
- Python 3.10+
- Git
- MySQL (running instance)
- Visual Studio Code (recommended)

### 🔹 Setup Steps

```bash
# Clone the repository
git clone https://github.com/Kafoor-A/Employee-management-system.git
cd Employee-management-system

# Create virtual environment
python -m venv venv
source venv/bin/activate   # macOS/Linux
venv\Scripts\activate      # Windows

# Install dependencies
pip install -r requirements.txt

# Update MySQL credentials inside config.py

# Initialize database tables (if applicable)
python models.py

# Run the Flask app
python app.py
```

Your app will be live at 👉http://localhost:5000

---
🔗 API Endpoints (Optional if Flask API enabled)
| Method   | Endpoint                | Description                |
| :------- | :---------------------- | :------------------------- |
| `GET`    | `/employees`            | Fetch all employees        |
| `POST`   | `/add_employee`         | Add new employee           |
| `GET`    | `/attendance`           | Get attendance details     |
| `POST`   | `/mark_attendance`      | Record employee attendance |
| `GET`    | `/payroll`              | View payroll reports       |
| `PUT`    | `/update_employee/{id}` | Update employee details    |
| `DELETE` | `/delete_employee/{id}` | Remove employee record     |

---

🧮 Example Data Model

Employee
```
{
  "id": 1,
  "name": "Abdul Kafoor",
  "designation": "Software Engineer",
  "email": "a.kafoor@example.com",
  "department": "IT",
  "salary": 60000
}
```
Attedance
```
{
  "employee_id": 1,
  "date": "2025-11-06",
  "status": "Present"
}
```
---

###📊 Future Enhancements
 - 🔐 Two-Factor Authentication (2FA) for secure logins
 - 🧾 Payroll PDF generation
 - ☁️ Cloud deployment (Render / Railway / AWS)
 - 📈 Analytics dashboard with charts and trends
 - 📧 Automated email reports

##🧑‍💻 Developed With
 - Python Flask for backend
 - HTML, CSS, JS for frontend
 - MySQL for database
 - VS Code for development

##🏁 Quick Start
 - Clone the repo
 - Set up the virtual environment
 - Install dependencies
 - Update database credentials
 - Run python app.py

Open http://localhost:5000 in your browser

##📜 License

This project is open-source under the MIT License.

See the [LICENSE](./LICENSE) file for more details.


##⭐ Show your support

If you like this project, don’t forget to star 🌟 the repository!

**Author:** Abdul Kafoor  
**Department of Electronics and Communication Engineering**  
**Rajalakshmi Engineering College**


