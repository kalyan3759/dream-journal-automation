# 🧪 Dream Journal UI Test Automation

This project is a UI automation framework for testing the **Dream Journal Website** (`https://arjitnigam.github.io/myDreams/`) as part of the **Wingify QA Internship Assignment**.

## ✅ Project Objective

Automate the functional testing of the Dream Journal web pages using **Selenium with Java** and **TestNG** following **Page Object Model (POM)** architecture. Bonus features like AI-based validation, reporting, and screenshot capture are also included.

---

## 🔧 Tech Stack

- **Language:** Java  
- **Testing Framework:** TestNG  
- **Build Tool:** Maven  
- **Browser Automation:** Selenium WebDriver  
- **Design Pattern:** Page Object Model (POM)  
- **Reports:** Allure Report  
- **Optional AI Validation:** (OpenAI-based logic can be plugged in)  

---

## 📁 Folder Structure

dream-portal-automation/
├── src/
│ └── test/
│ └── java/
│ ├── com.wingify.base/ # BaseTest.java
│ ├── com.wingify.pages/ # POM files: DreamDiaryPage, DreamSummaryPage
│ └── com.wingify.tests/ # Test files: HomeTest, DiaryTest, SummaryTest
│ └── resources/
├── testng.xml # TestNG suite file
├── pom.xml # Maven project dependencies
└── README.md # Project documentation

yaml
Copy
Edit

---

## ✅ Test Cases Covered

### 1. `index.html` – Dream Portal Home
- ✅ Verify loading animation appears and disappears after ~3 seconds
- ✅ Main content and "My Dreams" button becomes visible
- ✅ Clicking "My Dreams" opens `dreams-diary.html` and `dreams-total.html` in new tabs

### 2. `dreams-diary.html` – Dream Log Table
- ✅ Exactly 10 dream entries present
- ✅ Dream types are either "Good" or "Bad"
- ✅ All 3 columns (Name, Days Ago, Type) are filled in every row

### 3. `dreams-total.html` – Dream Summary Page
- ✅ Good Dreams count is 6  
- ✅ Bad Dreams count is 4  
- ✅ Total Dreams count is 10  
- ✅ Recurring Dreams count is 2  
- ✅ Assert recurring dreams include:
  - "Flying over mountains"
  - "Lost in maze"

---

## 🎯 Bonus Features

- ✅ **Well-structured POM**
- ✅ **Allure Reporting** support enabled
- ✅ **Screenshot on failure**
- 🔄 **Optional AI validation** placeholder present for dream classification (OpenAI API can be integrated)

---

## 🧪 How to Run

1. **Clone the repository:**
```bash
git clone https://github.com/kalyan3759/dream-journal-automation.git
cd dream-journal-automation