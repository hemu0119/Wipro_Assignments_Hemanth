package Day10;
import java.util.*;
public class MergingLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> l1= new ArrayList<>();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(1);
		ArrayList<Integer> l2= new ArrayList<>();
		l2.add(3);
		l2.add(4);
		l2.add(5);
		ArrayList<Integer> l3= new ArrayList<>();
		for(int c:l1) {
			if(!l3.contains(c)) {
				l3.add(c);
			}
		}
		for(int c:l2) {
			if(!l3.contains(c)) {
				l3.add(c);
			}
		}
		System.out.print(l3);
		
		
		

	}

}