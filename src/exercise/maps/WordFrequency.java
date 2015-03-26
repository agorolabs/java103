package exercise.maps;

import java.util.*;

/**
 * Creates a word frequency table from command line arguments
*/
public class WordFrequency {
	
	public static void main(String[] args) {
		Map<String, Integer> m = new HashMap<String, Integer>(); 
		
		for (String a : args) {
			Integer freq = m.get(a);
			m.put(a, (freq == null) ? 1 : freq + 1);
		}
		
		System.out.println(m.size() + " distinct words:");
		
		System.out.println(m);
	}
}

