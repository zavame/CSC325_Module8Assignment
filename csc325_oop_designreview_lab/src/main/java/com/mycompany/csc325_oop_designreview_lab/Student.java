/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class Student extends Human {
	// ToDo 1: Make this class a child of Human

	// ToDo 2: Fix the resulting errors

    // Constructor for Student that uses the parent constructor
    public Student(String name, short age, double gpa) {
        super(name, age); // Call the constructor of the Human class
        this.gpa = gpa;
    }

	// ToDo 3: Add a field for GPA and create a setter and a getter

    // Getter for GPA
    public double getGpa() {
        return gpa;
    }

    // Setter for GPA
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String getAddress() {
        return this.address;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    // ToDo 4: Add comments to your code
}
