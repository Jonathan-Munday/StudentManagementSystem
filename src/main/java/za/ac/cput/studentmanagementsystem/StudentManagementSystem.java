/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package za.ac.cput.studentmanagementsystem;

/**
 *
 * @author munda
 */
public class StudentManagementSystem {

    public static void main(String[] args) {

        // Builder Pattern for Undergraduate
        UndergraduateStudent ugStudent = new UndergraduateStudent.Builder()
                .setStudentId("221001")
                .setName("Alice Johnson")
                .setDepartment("Informatics")
                .setCreditHours(12)
                .setScholarshipAmount(500)
                .build();

        // Builder Pattern for Graduate
        GraduateStudent gradStudent = new GraduateStudent.Builder()
                .setStudentId("115002")
                .setName("Bob Smith")
                .setDepartment("Engineering")
                .setResearchAssistant(true)
                .setStipend(2500)
                .build();

        // Results
        ugStudent.displayStudentDetails();
        gradStudent.displayStudentDetails();
    }
}
