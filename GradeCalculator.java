package internshipTasks;
import java.util.*;

public class GradeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int minMark = 0;
		final int maxMark = 100;
		boolean validMark = true;
		double totalMarks = 0;
		int totalSubjects;
		double average;
		char grade;
		
		Scanner input = new Scanner(System.in);
		System.out.println("STUDENT GRADE CALCULATOR");
		
		try {
			System.out.print("\nENTER YOUR USERNAME: ");
			String name = input.next();
			System.out.printf("Hi %s,\n", name.toUpperCase());
			
			System.out.print("ENTER YOUR TOTAL NO OF SUBJECTS: ");
			totalSubjects = input.nextInt();
			int[] marks = new int[totalSubjects];
			
			System.out.println();
			
			for(int i = 0; i < totalSubjects; i++) {
				System.out.printf("ENTER SUBJECT %d SCORE (/100): ", i+1);
				marks[i] = input.nextInt();
				if(marks[i]< minMark || marks[i] > maxMark) {
					validMark = false;
					while(!validMark) {
						System.out.println("Mark not valid! Re-enter mark ");
						System.out.printf("ENTER SUBJECT %d SCORE (/100): ", i+1);
						marks[i] = input.nextInt();
						if(marks[i] >= minMark && marks[i] <=maxMark) {
							validMark = true;
						}
					}
				}
				totalMarks += marks[i];
			}
			
			average = (totalMarks/totalSubjects);
			System.out.println();
			grade = average < 50 ? 'F':
				(average>= 50 && average < 60)? 'D':
					(average>= 60 && average < 70)? 'C':
						(average>= 70 && average < 80)? 'B':'A';
			
			
			System.out.printf("%s's Details\n",name.toUpperCase());
			System.out.printf("Total Marks: %.2f/%d\n",totalMarks,maxMark*totalSubjects);
			System.out.printf("Average Mark: %.2f%\n",average);
			System.out.printf("Grade: %c\n",grade);
			input.close();
			System.out.println("Thank you for using this program 🙏");
		}
		catch (InputMismatchException e) {
			System.out.println("Invalid Input Entered! Re-run this program");
		}
		catch (Exception e) {
			System.out.println("An Error Occured!");
		}		
	}

}
