package Practice;

import java.util.*;

public class GetTheSixEvenNumber {
	public static int GetEvenNum(double num1, double num2) {
		int s = (int)num1 + (int)(Math.random() * (num2 - num1));
		if(s % 2 == 0) {			//判断随机数是否为偶数
			return s;
		}else {
			return s + 1;
		}
	}
	public static void main(String args[]) {
		int sum = 0;
		int arr[] = new int[6];
		for(int i = 0; i < 6; i++) {
			new GetTheSixEvenNumber();		//类初始化
			arr[i] = GetTheSixEvenNumber.GetEvenNum(2, 32);
			sum = sum + arr[i];
			System.out.println("第" + (i + 1) +"个偶数为: " + arr[i]);
		}
		System.out.println("总和为： " + sum);
	}
}

