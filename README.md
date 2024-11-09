# Hibernate
A Hibernate Based Student Management System
This is a Student Management System built using Hibernate ORM. The system allows performing basic CRUD operations on student records, such as adding, updating, deleting, and viewing student details.

**Features :**

                      a)Add a new student: Allows adding a new student record to the database.
                       b)Update an existing student: Allows updating an existing student record by modifying details like name, age, and course.
                       c)Delete an existing student: Allows deleting a student record from the database.
                        d)View an existing student: Allows retrieving and displaying a specific student's details.

              **Prerequisites :**
                    Before running the project, ensure you have the following software installed:
                                                                                                                                                      Java 8+
Maven (for dependency management and building the project)
                                                                                                                     Hibernate (configured for ORM operations)
MySQL or any other supported database (configured for Hibernate)
                                                                                                                     IDE (like IntelliJ IDEA, Eclipse, etc.)

**Setup**
1.Clone the Repository your local machine using Git:
git clone https://github.com/yourusername/student-management-system.git

2. Configure Database using-
CREATE DATABASE student_management;

4.  Add Maven Dependencies -
mvn clean install

5. Create the Student Entity
Make sure the Student class is properly annotated to work with Hibernate.

7. Running the Application
You can run the application by invoking the main class, which should contain the logic for adding, updating, deleting, and viewing students

**Usage**
Once the setup is complete, run the Main class, and the application will perform the following operations based on your input:

a)Add a new student
b)Update an existing student
c)Delete a student
d)View a student record



