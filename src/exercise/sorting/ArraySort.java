package exercise.sorting;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraySort {

	public static void main(String[] args) {
		String[] months = {"Jan","Feb","Mar","Apr","May","June", "July", "Aug", "Sept","Oct","Nov","Dec"};
		
		Arrays.sort(months);
		
		for (Object month :months){
			System.out.println(month);
		}
	}
}

