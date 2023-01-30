package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] data = {3,2,11,4,6,7};
		
		//List<Integer> data1=new ArrayList<Integer>();
		Set<Integer> data1=new TreeSet<Integer>();
		for (int i = 0; i < data.length; i++) {
			data1.add(data[i]);
			}
		
		//Collections.sort(data1);
		
		System.out.println("Sorted list: "+data1);
		
		List<Integer> list=new ArrayList<Integer>(data1);
		int largestnum=list.get(list.size()-2);
		
		System.out.println("Second largest number: " +largestnum);
	}

}
