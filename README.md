⚡ Electricity Billing System
A robust desktop-based application developed in Java to automate the billing process for electricity departments. It allows for efficient management of customer data, meter readings, and bill generation with a secure database connection.

🚀 Features
User Authentication: Secure Login system for Admin and Customer access.

Customer Management: Add new customers, update details, and view customer information.

Meter Management: Log meter details and calculate units consumed.

Bill Generation: Automatically calculates the total amount based on units and tax slabs.

Payment Tracking: Check the status of paid and pending bills.

Print Functionality: Generate and print bill receipts directly from the application.

🛠️ Tech Stack
Language: Java Core

GUI Frameworks: Java Swing, AWT (Abstract Window Toolkit)

Database: MySQL

Connectivity: JDBC (Java Database Connectivity)

IDE: Eclipse / NetBeans / VS Code

📂 Project Structure
Plaintext

ElectricityBillingSystem/
├── src/
│   ├── Login.java            # Login Screen logic
│   ├── NewCustomer.java      # Customer registration form
│   ├── DepositDetails.java   # Billing and payment records
│   ├── CalculateBill.java    # Logic for billing calculation
│   └── Conn.java             # Database connection (JDBC)
├── lib/                      # MySQL Connector JAR file
└── database/                 # SQL scripts for table creation
⚙️ Setup & Installation
1. Prerequisites
Java JDK installed on your system.

MySQL Server running locally.

MySQL Connector JAR (included in the lib folder).

2. Database Configuration
Open MySQL and create the database:

SQL

CREATE DATABASE ebs;
USE ebs;
Run the SQL queries provided in the project to create tables like login, customer, meter_info, etc.

3. Run the Application
Clone the repository:

Bash

git clone https://github.com/Jitendra-Kumar7078/ElectricityBilingSystem.git
Open the project in your preferred IDE.

Ensure the MySQL Connector JAR is added to your project's Build Path.

Run Login.java to start the application.

🖥️ User Interface
The application uses Java Swing for a user-friendly experience, featuring:

JFrames for window management.

JButtons for easy navigation.

JTable to display billing and customer records.
