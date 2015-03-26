package exercise.sets;

import java.awt.Point;
import java.util.HashSet;
import java.util.Set;

public class AddTwice {

	public static void main(String[] args) {
		Set points = new HashSet();
		
		Point p1 = new Point(10,20);
		Point p2 = new Point(10,20);
		
		points.add(p1);
		points.add(p2);
		
		System.out.println("number of points = " + points.size());
	}
}

