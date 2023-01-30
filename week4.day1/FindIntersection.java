package week4.day1;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		

		int[] a={3,2,11,4,6,7};
		int[] b={1,2,8,4,9,7};
		
		List<Integer> find=new ArrayList<Integer>();
		
		for (int i = 0; i < a.length; i++) {
			find.add(a[i]);
		}
		
		List<Integer> find2= new ArrayList<Integer>();
		
		for (int i = 0; i < b.length; i++) {
			find2.add(b[i]);
		}
		
		for (int i = 0; i < find.size(); i++) {
			for (int j = 0; j < find2.size(); j++) {
				
				if (find.get(i)==find2.get(j)) {
					System.out.println(find.get(i));
				}
			}
		}
	}

}
