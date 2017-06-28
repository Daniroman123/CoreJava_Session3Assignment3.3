/*Create a student result processing system
 * 
 * Display the details and results of atleast three students*/

package session3;

import java.util.Scanner;

class Student {
	String name, rollno;
	int marks1, marks2, marks3, total;
	float percentage;

	public Student(String name, String rollno, int marks1, int marks2, int marks3) {

		this.name = name;
		this.rollno = rollno;
		this.marks1 = marks1;
		this.marks2 = marks2;
		this.marks3 = marks3;
	}

	void display(String name, String rollno, int marks1, int marks2, int marks3) {

		System.out.println("Results : ");
		System.out.println("Name : " + name);
		System.out.println("RollNo : " + rollno);
		total = marks1 + marks2 + marks3;
		System.out.println("Total Marks : " + total + "/300");
		percentage = (total * 100) / 300;
		System.out.println("Total Percentage: " + percentage + "%");
		System.out.println();

	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		for (int i = 1; i <= 3; i++) {
			System.out.println("Enter the name of the student " + i);
			String name = scanner.next();
			System.out.println("Enter the rollno. of the student " + i);
			String rollno = scanner.next();
			System.out.println("Enter the marks score(out of 100) for " + name + " in History");
			int marks1 = scanner.nextInt();
			System.out.println("Enter the marks score(out of 100) for " + name + " in Geography");
			int marks2 = scanner.nextInt();
			System.out.println("Enter the marks score(out of 100) for " + name + " in Maths");
			int marks3 = scanner.nextInt();

			Student obj = new Student(name, rollno, marks1, marks2, marks3);
			obj.display(name, rollno, marks1, marks2, marks3);
		}
		scanner.close();
	}

}
