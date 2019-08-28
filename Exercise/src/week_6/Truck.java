package week_6;

public class Truck extends Vehicle{
	private double loadcapacity;
	private double towingcapacity;
	public Truck(String name, int cylinders, String owner, double loadcapacity, double towingcapacity) {
		super(name,cylinders,owner);
		this.loadcapacity=loadcapacity;
		this.towingcapacity=towingcapacity;
	}
	
	public void read() {
			super.read();
			System.out.println("Load Capacity\t\t:" + loadcapacity + "\nTowing Capacity\t\t:" + towingcapacity);
		}
	
	public String toString() {
		return super.toString() + ":" + loadcapacity + ":" + towingcapacity;
	}


}
