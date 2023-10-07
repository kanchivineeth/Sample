package qedge.aug8;

import java.util.Scanner;

public class Switchcase {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		for(int i=1;i<=5;i++)
		{
			System.out.println("Enter your course name");
		String course =s.next();
		switch (course.toUpperCase()) {
		case "SELENIUM":
			System.out.println("course is Aviable::"+course);
			break;
		case "JAVA":
			System.out.println("course is Aviable::"+course);
			break;
		case "PYTHON":
			System.out.println("course is Aviable::"+course);
			break;
		case "MANUVAL":
			System.out.println("course is Aviable::"+course);
			break;
		case "DATASCIENCE":
			System.out.println("course is Aviable::"+course);
			break;
		default:
			System.out.println("course is notAviable::"+course);
			break;
		}

	}
	}

}
