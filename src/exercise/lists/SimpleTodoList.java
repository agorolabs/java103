package exercise.lists;

import java.util.ArrayList;
import java.util.List;

public class SimpleTodoList {

	public static void main(String[] args) {
		List<String> todoList = new ArrayList<String>();
		todoList.add("make breakfast");
		todoList.add("read morning paper");
		todoList.add("Doctors appointment");		
		for (String item : todoList ) {
			System.out.println("Item:" + item) ;
		}
	}
}

