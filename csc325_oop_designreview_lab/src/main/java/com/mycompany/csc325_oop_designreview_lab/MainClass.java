/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */

public class MainClass {

	public static void main(String[] args) {

		// Create instances of Freshman and Senior
		Freshman std1 = new Freshman("James", (short) 20, 12); // name, age, credits
		Senior std2 = new Senior("John", (short) 30, 90);      // name, age, credits

		// Display their information using toString methods
		System.out.println(std1);
		System.out.println(std2);

		//  Set the GPA of the student using scanner and user input
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter GPA for James: ");
		double gpa = scanner.nextDouble();
		std1.setGpa(gpa);

		System.out.println("Updated Student Info: " + std1);

		scanner.close(); // Close scanner after use

	}
}