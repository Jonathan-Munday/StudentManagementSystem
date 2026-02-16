# StudentManagementSystem

Project Overview
This project is a Java-based system designed to manage different types of students at a university. It supports Undergraduate Students and Graduate Students. Because students have many optional details (like scholarships or research roles), I used the Builder Design Pattern to create the objects safely and clearly.
+2

How to Run
Open the project in NetBeans IDE.

Ensure the package name is za.ac.cput.studentmanagementsystem.

Run the StudentManagementSystem.java file to see the student details and tuition calculations printed in the console.

How I applied SOLID Principles
1. Single Responsibility Principle (SRP)
Basically, I made sure every class has just one job to do.
+1


In my code: My student classes, like UndergraduateStudent, focus only on student data and calculating tuition.
+1

I didn't clutter them with the logic for "how to build a student." Instead, I put that logic inside a nested Builder class.

This way, if I ever need to change how a student is constructed, I don't have to touch the logic that calculates their fees.

2. Open/Closed Principle (OCP)
This principle says code should be open to grow but closed to changes that might break things.
+1


In my code: I started with an abstract class Student.

This is great because if the university decides to add a "Part-Time Student" tomorrow , I can just create a new subclass that extends Student.
+1

I can add that new feature without having to open up or change my existing Undergraduate or Graduate classes, which keeps the original code safe.

Project Structure (For Grading)

Student.java: The base abstract class.


UndergraduateStudent.java: Handles undergrads with credit hours and scholarships.


GraduateStudent.java: Handles grads with research assistant status and stipends.


StudentManagementSystem.java: This is where I run the code, use the builders to create the objects, and print everything out.
