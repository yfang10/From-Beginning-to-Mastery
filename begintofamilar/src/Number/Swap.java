package Number;

import java.util.Arrays;

public class Swap {
	public static void main(String args[]) {
		int arr[] = new int[5];
		Arrays.fill(arr, 8);			//使用同一元素8对数组进行填充
		for(int i = 0; i < arr.length; i++) {
			System.out.println("第" + i + "个元素是： " + arr[i]);
		}
	}

}
