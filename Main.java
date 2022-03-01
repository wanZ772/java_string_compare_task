// coded by wanz

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.print("Enter subjec code: ");
		String subject_code = sc.next(); // getting input
		
		switch (subject_code) { // check course based on condition
		    case "SP023":
		        System.out.print("Your course: Physics SP023"); // output based on condition
		        break;
		    case "S025":
		        System.out.print("Your course: Computer Science SP025");// output based on condition
		        break;
		    default:
		        System.out.println("Please enter a valid code");// output based on condition
		}
	}
}
