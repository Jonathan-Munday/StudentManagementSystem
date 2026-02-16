/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.cput.studentmanagementsystem;

/**
 *
 * @author munda
 */
public abstract class Student {

    protected String studentId;
    protected String name;
    protected String email;
    protected String department;

    public abstract double calculateTuition();

    public abstract String getStudentType();

    public abstract void displayStudentDetails();
}
