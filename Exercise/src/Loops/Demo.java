package Loops;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
		for(int rows=1;rows<=5;rows++) {
			for(int i=4;i>=rows;i--) {
				System.out.print(" ");
			}
			for(int j=1;j<=rows;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
