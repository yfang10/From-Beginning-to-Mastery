package Number;

import java.util.Arrays;

public class Rakel {
	public static void main(String args[]) {
		
		String str[] = new String[] {"ab", "cd", "ef", "yz"};
		Arrays.sort(str);
		
		int index = Arrays.binarySearch(str, 0, 2, "cd");		//在指定的范围内搜索元素"cd"的索引位置
		System.out.println("cd的索引位置是： " + index);

	}

}
