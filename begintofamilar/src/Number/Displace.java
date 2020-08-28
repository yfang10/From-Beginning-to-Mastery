package Number;

import java.util.Arrays;

public class Displace {
	public static void main(String args[]) {
		int arr[] = new int[] {45, 12, 2, 10};
		Arrays.fill(arr, 1, 2, 8);		//使用fill()方法对数组进行初始化
		for(int i = 0; i < arr.length; i++) {
			System.out.println("第" + i + "个元素是： " + arr[i]);
		}
	}

}
