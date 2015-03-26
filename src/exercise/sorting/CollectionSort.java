package exercise.sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionSort {

	public static void main(String[] args) {
		List months = Arrays.asList("Jan","Feb","Mar","Apr","May","June", "July", "Aug", "Sept","Oct","Nov","Dec");
		
		Collections.sort(months);
		
		for (Object month :months){
			System.out.println(month);
		}
	}
}

