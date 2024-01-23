/*-------------------------------------------------------------
// AUTHOR: MY LIEN TAN.
// FILENAME: Lab3.java.
// SPECIFICATION: This is a program that calculates the final weighted total grade.
// FOR: CS 1400- Lab #3
// TIME SPENT: 1 hour.
//-----------------------------------------------------------*/
import java.util.Scanner;
public class Lab3 {
	public static void main (String [] args) {
		double homeworkGrade, midtermGrade, finalGrade;
		Scanner input = new Scanner (System.in);
		int i = 0;
		if (i==0) {
			System.out.println("Enter your homework grade: ");
			homeworkGrade = input.nextDouble();
			while (homeworkGrade < 0 || homeworkGrade > 100) {
				System.out.println("[ERR] Invalid input. A homework grade should be in [0, 100].");
				System.out.println("Enter your homework grade: ");
				homeworkGrade = input.nextDouble();
			}
			i++;
			if (i==1) {
				System.out.println("Enter your midterm grade: ");
				midtermGrade = input.nextDouble();
				while (midtermGrade < 0 || midtermGrade > 100) {
					System.out.println("[ERR] Invalid input. A midterm grade should be in [0, 100].");
					System.out.println("Enter your midterm grade: ");
					midtermGrade = input.nextDouble();
				}
				i++;
				if (i==2) {
					System.out.println("Enter your final grade: ");
					finalGrade = input.nextDouble();
					while (finalGrade < 0 || finalGrade > 200) {
						System.out.println("[ERR] Invalid input. A final grade should be in [0, 200].");
						System.out.println("Enter your final grade: ");
						finalGrade = input.nextDouble();
				}
					double averageGrade;
					final int NUM_POINTS;
					NUM_POINTS = (int) 400;
					averageGrade = ((finalGrade + midtermGrade + homeworkGrade)/ (double) NUM_POINTS)*100;
					System.out.printf ("[INFO] Student's weighted total is %.2f%%\n", averageGrade);
					if (averageGrade >= 50) {
						System.out.println("[INFO] Student PASSED the class.");
					}
					else {
						System.out.println("[INFO] Student FAILED the class.");
					}
			}
		}
	}
		input.close();
}
}
