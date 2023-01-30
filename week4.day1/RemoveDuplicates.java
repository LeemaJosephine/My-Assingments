package week4.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		
		String text="We learn java basics as part of java sessions in java week1";
		
		String[] txt1=text.split(" ");
		System.out.println("With Duplicates: " +text);
		Set<String> set=new LinkedHashSet<String>();
		for (String string : txt1) {
			set.add(string);
		}
		System.out.println("Duplicates removed: " +set);
		
		
		//List<String> wrd=new ArrayList<String>(Arrays.asList(txt1));
		//System.out.println(wrd);
		
		/* for (int i = 0; i < txt1.length; i++) {
			for (int j = 0; j < txt1.length; j++) {
				if (txt1[i].equals(txt1[i])) {
					
					txt2=txt1[i];
					count++;
					}		
			}
		}
		
		if(count >1) {
			System.out.println(text.replace(txt2, " "));
		}
		System.out.println(text);
		
		/*List<String> duplicate=new ArrayList<String>();
		
		for (int i = 0; i < txt1.length; i++) {
			duplicate.add(txt1[i]);
		}
		//System.out.println(duplicate);
		
		Collections.sort(duplicate);
		System.out.println(duplicate); */
			
		
	}

}
