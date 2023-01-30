package week4.day1;

import java.util.Set;
import java.util.TreeSet;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,7,6,8};
		
		Set<Integer> miss=new TreeSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
		miss.add(arr[i]);
	    }
		
		System.out.println("Eelements present: "+miss);
		for (int i = 1; i < miss.size(); i++) {
			if(!miss.contains(i)) {
				System.out.println("Missing element: "+i);
				break;
			}
		}
		
	}

}
