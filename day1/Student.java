package week1.day1;

public class Student {
	
	String collegeName="WCC";
	public void StudentDetails() {
		
		String studentName="Leema Josephine";
		int rollNo=32;
		
		System.out.println("College Name: " +collegeName);
		System.out.println("Name of the Student: " +studentName);
		System.out.println("Roll No.: " +rollNo);
		
	}
	
	public int MarkDetails(int maths,int english,int tamil) {
		return maths+english+tamil;
		
	}
	
}
