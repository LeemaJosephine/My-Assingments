package week1.day1;

public class Mobile {

	public void makeCall() {
		String mobileModel="OnePlus Nord";
		float mobileWeight=13.2f;
		
		System.out.println("MobileWeight: " + mobileWeight);
		System.out.println("Mobile Model: " + mobileModel);
	}
	
	public void sendMsg() {
		boolean isFullCharged=true;
		int mobileCost= 30000;
		
		System.out.println("Mobile cost: " + mobileCost);
		System.out.println("Fully charged? " + isFullCharged);
	}
	
	public static void main(String[] args) {
		Mobile obj1=new Mobile();
		obj1.makeCall();
		obj1.sendMsg();
	}
}
