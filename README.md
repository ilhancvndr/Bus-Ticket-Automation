# Bus Ticket Automation

This project is a bus seat reservation and management system. The system consists of two main components: admin panel and user interface.

## Features

### Admin Panel
- Add, edit and delete trips
- Edit and delete passenger information
- Trip management
- Secure login system

### User Interface
- Bus seat reservation system
- Gender-based seat placement
- View trips and purchase tickets
- User-friendly interface

## Technical Details

### Technologies Used
- Java SE 22
- Swing GUI Framework
- MariaDB Database
- JGoodies Forms (UI Components)

### Project Structure
```
src/
├── Admin/         # Admin panel components
├── Model/         # Data models
├── View/          # User interface components
└── Helper/        # Helper classes
```

## Installation

1. Install Java SE 22 JDK
2. Install MariaDB database
3. Open the project in Eclipse IDE
4. Add required libraries:
   - com.jgoodies.common_1.8.1
   - com.jgoodies.forms_1.9.0
   - mariadb-java-client-3.5.1

## Running the Application

1. Run `src/View/GirisGUI.java` to start the application
2. To access the admin panel, run `src/Admin/MainAdminImplementation.java`

## Database Configuration

MariaDB database is used. You can configure the database connection settings in `Helper/DatabaseConnection.java`.

## License

This project is developed for private use. All rights reserved. 
