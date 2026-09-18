# 🌱 AgriWise — Smart Crop Advisor, Profit Predictor & Marketplace System

## 📌 Overview of the Project
AgriWise is an enterprise-level Command-Line Interface (CLI) application built in Core Java to assist small to mid-scale farmers. Farmers often struggle with crop selection due to fluctuating weather, lack of actionable farming guidance, and volatile market prices. AgriWise solves this by ingesting historical datasets and dynamically calculating crop suitability, generating step-by-step Standard Operating Procedures (SOPs), and predicting gross profits based on current Mandi prices.

## 🚀 Features
* **Crop Suitability & Yield Prediction Engine:** Evaluates regional weather and soil metrics to predict the best crops for a given season.
* **Cultivation Advisory (SOP Guide):** Generates step-by-step textual guidelines tailored to the selected crop.
* **Profit Predictor & Market Analytics:** Evaluates historical prices against cultivation expenses to calculate Estimated Net Profit.
* **Dataset Analytics:** Parses and processes CSV datasets for data-driven decision-making.

## 🛠️ Technologies/Tools Used
* **Language:** Core Java (JDK 8 or higher)
* **Concepts:** Object-Oriented Programming (OOP), Data Structures, File I/O (CSV Parsing)
* **Environment:** VS Code, IntelliJ IDEA, or standard OS Terminal

## 📂 Project Structure

   AgriWise/
├── core/
│   ├── AdvisoryGenerator.java   # Generates tailored SOPs
│   ├── PredictionEngine.java    # Predicts crops based on region/season
│   └── ProfitCalculator.java    # Calculates revenue, costs, and net profit
├── data/
│   ├── Crop.java                # Encapsulated Crop domain model
│   ├── FarmerProfile.java       # User profile model
│   ├── historical_weather.csv   # Regional weather metrics
│   ├── mandi_price.csv          # Real-time crop pricing
│   └── soil_metrics.csv         # pH and NPK level datasets
├── docs/
│   ├── Project_Report.pdf       # [HEAD] Project Report
│   └── diagrams/                # UML and Architecture diagrams
│       ├── architecture.png
│       ├── class.png
│       ├── ER diagram.png
│       ├── sequence.png
│       └── use case.png
├── tests/
│   └── AgriWiseTest.java        # Automated logic test suite
├── .gitignore                   # Ignored files configuration
├── AgriWiseMain.java            # Main CLI Application entry point
├── Readme.md                    # Project documentation
└── statement.md                 # Problem statement and scope

## ⚙️ Steps to Install & Run the Project

**Step 1: Open the Project**
Open the main project folder (`AgriWise`) in your preferred terminal or code editor like VS Code.

**Step 2: Compile the Code**
Run the following command in the terminal to compile all the Java files:

    javac core/*.java data/*.java AgriWiseMain.java

**Step 3: Run the Application**
Launch the main AgriWise CLI by executing:

    java AgriWiseMain

## 🧪 Instructions for Testing

AgriWise includes a custom automated test suite to verify the logic of the core Prediction Engine. 

To execute the tests, run the following commands:

    javac tests/*.java
    java tests.AgriWiseTest