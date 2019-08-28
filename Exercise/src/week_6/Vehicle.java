package week_6;

public class Vehicle {
	private String name;
	private int cylinders;
	private String owner;

	public Vehicle(String mname, int cylinders, String owner) {
		name=mname;
		this.cylinders=cylinders;
		this.owner=owner;		
	}
	
	public void read() {
		System.out.println("Manufacturer's name\t:" + name + "\nNumber of cylinders\t:" + cylinders + "\nOwner\t\t\t:" + owner);
	}
	
	public String toString() {
		return String.format("%s:%d:%s", name,cylinders,owner);
	}
}
