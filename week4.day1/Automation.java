package week4.day1;

public class Automation extends MultipleLanguage implements Language,TestTool {

	
	public static void main(String[] args) {
		
		Automation obj=new Automation();
		obj.seleinium();
		obj.python();
		obj.java();
		obj.ruby();

	}

	public void seleinium() {
		// TODO Auto-generated method stub
		System.out.println("I'm from Interface TestTool");
	}

	public void java() {
		// TODO Auto-generated method stub
		System.out.println("I'm from Interface Language");
	}

	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		System.out.println("I'm from abstract class MultipleLanguage - Ruby method");
	}

}
