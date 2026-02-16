/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.cput.studentmanagementsystem;

/**
 *
 * @author munda
 */
public class UndergraduateStudent extends Student {

    private double creditHours;
    private double scholarshipAmount;

    // Private constructor so only the Builder can create the object
    private UndergraduateStudent(Builder builder) {
        this.studentId = builder.studentId;
        this.name = builder.name;
        this.email = builder.email;
        this.department = builder.department;
        this.creditHours = builder.creditHours;
        this.scholarshipAmount = builder.scholarshipAmount;
    }

    @Override
    public double calculateTuition() {
        // Simple calculation: R1000 per credit hour minus scholarship
        return (creditHours * 1000) - scholarshipAmount;
    }

    @Override
    public String getStudentType() {
        return "Undergraduate Student";
    }

    @Override
    public void displayStudentDetails() {
        System.out.println("--- Undergraduate Student Details ---");
        System.out.println("ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Tuition Total: R" + calculateTuition());
        System.out.println("------------------------------------");
    }

    // Static Inner Builder Class
    public static class Builder {

        private String studentId;
        private String name;
        private String email;
        private String department;
        private double creditHours;
        private double scholarshipAmount;

        public Builder setStudentId(String studentId) {
            this.studentId = studentId;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setDepartment(String department) {
            this.department = department;
            return this;
        }

        public Builder setCreditHours(double creditHours) {
            this.creditHours = creditHours;
            return this;
        }

        public Builder setScholarshipAmount(double scholarshipAmount) {
            this.scholarshipAmount = scholarshipAmount;
            return this;
        }

        public UndergraduateStudent build() {
            return new UndergraduateStudent(this);
        }
    }
}
