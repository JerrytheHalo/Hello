package Pets;

public class Cat {
	private String name;
	private String breed;
	private int age;
	public Cat(String initialname, String initialbreed, int initialage) {
		name=initialname;
		breed=initialbreed;
		age=initialage;
			
	}
	public String toString() {
			return String.format("%s:%s:%d", name,breed,age);
	}
	
}
