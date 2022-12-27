package week1.day1;

public class Report {

public static void main(String[] args) {
		
		Student obj1=new Student();
		obj1.StudentDetails();
		int result= obj1.MarkDetails(78, 80, 85);
		System.out.println("Total marks: " +result);
		float cgpa=result/3;
		System.out.println("Total CGPA: " +cgpa);
	}
}
