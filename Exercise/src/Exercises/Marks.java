package Exercises;
import java.util.Scanner;
public class Marks {

	public static void main(String[] args) {
		double mark;
		    Scanner scanner= new Scanner(System.in);
		do {
			
		    System.out.println("Please enter your mark:");
		    mark=scanner.nextDouble();
			if(mark<0) {
			System.out.println("?????????????????????????????????");
			}
			else if(mark<=50) {
				System.out.println("Your grade is: NN.");
			}
			else if(mark<60) {
				System.out.println("Your grade is: PA.");
			}
			else if(mark<70) {
				System.out.println("Your grade is: CR.");
			}
			else if(mark<80) {
				System.out.println("Your grade is: DI.");
			}
			else if(mark<=100) {
				System.out.println("Your grade is: HD.");
			}
			else {
				System.out.println("Your grade is: Fake!");
			}
			
		}while(mark>0);
	scanner.close();
	}
}
	
