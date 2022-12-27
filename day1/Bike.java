package week1.day1;

public class Bike {
	
	public void applyBreak() {
		System.out.println("Applied break - Bike");
	}
	public void soundHorn() {
		System.out.println("Sound horn - Bike");
	}
	
	public static void main(String[] args) {
		Car obj1=new Car();
		Bike obj2=new Bike();
		obj1.applyBreak();
		obj1.soundHorn();
		obj2.applyBreak();
		obj2.soundHorn();
			
	}

}

