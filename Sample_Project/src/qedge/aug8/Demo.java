package qedge.aug8;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		//verify given marks pass or fail
		Scanner s=new Scanner(System.in);
		for(int i=1;i<=5;i++)
		{
		System.out.println("Enter marks");
		int marks =s.nextInt();
		if (marks>=35) {
			System.out.println("pass::::"+marks);
		}
		else
		{
			System.out.println("Fail::::"+marks);
		}

	}
	}

}
