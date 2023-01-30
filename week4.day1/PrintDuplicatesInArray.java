package week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		List<Integer> list=new ArrayList<Integer>();
		for (Integer integer : arr) {
			list.add(integer);
		}
		
		System.out.println("Original list: " +list);
		
		Set<Integer> dup=new TreeSet<Integer>();
		for (Integer integer : arr) {
			dup.add(integer);
		}
		System.out.println("New list: " +dup);

	}

}
