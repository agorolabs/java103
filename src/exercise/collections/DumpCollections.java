package exercise.collections;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class DumpCollections {

	public static void main(String[] args) {
		Collection months = Arrays.asList("Mon","Tues","Wed","Thurs","Fri","Sat", "Sun");
		dumpCollection(months);
	}
	
	public static void  dumpCollection(Collection c){
		System.out.println("collection has " + c.size() + " elements");
		
		Iterator iterator = c.iterator();
		while (iterator.hasNext()){
			System.out.println("Next element is " + iterator.next());
		}
	}
}

