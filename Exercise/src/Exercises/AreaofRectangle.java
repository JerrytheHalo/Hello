package Exercises;
import java.util.Scanner;

public class AreaofRectangle {
	
	public static void main(String args[]){
		Scanner scanner= new Scanner(System.in);
		int width=10;
		int height=6;
		System.out.println("Width:");
		width=scanner.nextInt();
		System.out.println("Height:");
		height=scanner.nextInt();
		System.out.print("Area of a rectangle width="+ width + " height=" + height + " is ");
		System.out.print(width * height);  
		scanner.close();
	} 
}
	