package Practices;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LianXi2 {
	public static void main(String args[]) {
		Set<String> set = new HashSet<>();
		set.add("A");
		set.add("a");
		set.add("c");
		set.add("C");
		set.add("a");
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("a");
		list.add("c");
		list.add("C");
		list.add("a");
		System.out.println(set);
		System.out.println(list);
	}

}
