package Practices;

import java.util.LinkedList;
import java.util.List;

public class LianXi1 {
	public static void main(String args[]) {
	List<Integer> list = new LinkedList<>();
	for(int i = 1; i <= 100; i++) {
		list.add(new Integer(i));
	}
	list.remove(10);
	System.out.println(list);
	}

}
