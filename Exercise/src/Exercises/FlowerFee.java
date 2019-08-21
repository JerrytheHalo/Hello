package Exercises;
import java.util.Scanner;

public class FlowerFee {
     	 
		private String[] names  = {"Petunia", "Pansy","Rose","Violet","Carnat"};
		private double[] prices = {0.50,0.75,1.50,0.50,0.80};
	
		public static void main(String[] args) {
		int quantity;
     	String flower;
		Scanner scanner= new Scanner(System.in);
		System.out.println("Avalable flower types and prices per stem:\n");
		flower=scanner.next();
		quantity=scanner.nextInt();
		
	}
	
	public double getPriceOfFlower(String Flower) {
		int targetIndex = -1;
			for(int i=0; i<names.length; i++) {
				if(names[i].equals(flower)) {
				targetIndex=i;
				break;
					
				}
			}
		if(targetIndex == -1) {
			return -1.0;
		}else {
			return prices[targetIndex];
		}
		
	}
	
	
	
	

}
